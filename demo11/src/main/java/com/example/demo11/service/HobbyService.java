package com.example.demo11.service;

import com.example.demo11.entity.Hobby;
import com.example.demo11.repository.HobbyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class HobbyService implements BaseService<Hobby, Integer> {

    @Autowired
    private HobbyRepository hobbyRepository;

    @Override
    public List<Hobby> findAll() {
        return hobbyRepository.findAll();
    }

    @Override
    public Hobby findById(Integer id) {
        Optional<Hobby> hobby = hobbyRepository.findById(id);
        return hobby.orElse(null);
    }

    @Override
    @Transactional
    public Hobby save(Hobby hobby) {
        return hobbyRepository.save(hobby);
    }

    @Transactional
    public void deleteById(Integer id) {
        hobbyRepository.deleteById(id);
    }

    // Additional service methods specific to Hobby
    public List<Hobby> getAllHobbies() {
        return findAll();
    }

    public Hobby getHobbyById(Integer id) {
        return findById(id);
    }

    public Hobby saveHobby(Hobby hobby) {
        return save(hobby);
    }

    public void deleteHobby(Integer id) {
        deleteById(id);
    }
}
