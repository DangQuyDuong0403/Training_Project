package com.example.demo11.service;

import com.example.demo11.dto.UserDTO;
import com.example.demo11.entity.Education;
import com.example.demo11.entity.User;
import com.example.demo11.exception.CustomException;
import com.example.demo11.exception.NotFoundException;
import com.example.demo11.mapper.UserMapper;
import com.example.demo11.model.request.CreateUserRequest;
import com.example.demo11.model.request.UpdateUserResquest;
import com.example.demo11.model.response.EducationResponse;
import com.example.demo11.repository.MySchoolRepository;
import com.example.demo11.model.response.UserResponse;
import com.example.demo11.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class UserService implements BaseService<User, Integer>{
    @Autowired
    private UserRepository userRepository;
    private UserMapper userMapper;
    @Autowired
    private MySchoolRepository educationRepository;

    public UserResponse createUser(CreateUserRequest request) {
        List<Education> educations = educationRepository.findAllById(request.getEducationIds());
//
        User user = request.toUser();
        User savedUser = userRepository.save(user);

        educationRepository.saveAll(educations.stream().peek(s -> s.setUser(savedUser)).toList());

        return UserResponse.fromUser(savedUser);
    }

    public UserResponse updateUser(Integer id, UpdateUserResquest request){
        User user = userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
        List<Education> educations = educationRepository.findAllById(request.getEducationIds());

        user.setEducation(educations);
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
        user.setEmail(request.getEmail());
        user.setDob(request.getDob());
        user.setDescription(request.getDescription());
        User savedUser =userRepository.save(user);
        return UserResponse.fromUser(savedUser);
    }

    public UserResponse getUser(Integer id) {
        if (id < 1) {
            throw new CustomException("Invalid id", HttpStatus.BAD_REQUEST);
        }

        User user = userRepository.findById(id).orElseThrow(() -> new CustomException("User not found", HttpStatus.NOT_FOUND));
        return UserResponse.fromUser(user);
    }

    public Page<UserResponse> getUsers(String name,
                                       Pageable pageable) {
        Page<User> users = userRepository.findBy(name, pageable);
        return users.map(UserResponse::fromUser);
    }

    public UserDTO save(UserDTO userDTO) {
        User user = userMapper.toUser(userDTO);
        user = userRepository.save(user);
        return userMapper.toUserDTO(user);
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(Integer id) {
        return userRepository.findById(id).orElse(null);
    }

    public User save(User basicInfo) {
        return userRepository.save(basicInfo);
    }

    public void deleteById(Integer id) {
        userRepository.deleteById(id);
    }
}
