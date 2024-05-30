package com.example.demo11.controller;

import com.example.demo11.model.request.CreateUserRequest;
import com.example.demo11.model.request.UpdateUserResquest;
import com.example.demo11.model.response.UserResponse;
import com.example.demo11.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }



    @GetMapping
    public Page<UserResponse> getUsers(
            @RequestParam(required = false) String name,
            Pageable pageable
    ) {
        return userService.getUsers(name, pageable);

    }

    @PostMapping
    public UserResponse createUser(@RequestBody @Valid CreateUserRequest request) {
        return userService.createUser(request);
    }

    @GetMapping({"/{id}"})
    public UserResponse getUser(@PathVariable Integer id) {
        return userService.getUser(id);
    }

    @PutMapping({"/{id}"})
    public UserResponse updateUser(@PathVariable Integer id, @RequestBody @Valid UpdateUserResquest request) {
        return userService.updateUser(id, request);
    }
}
