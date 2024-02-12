package com.example.demo.rest;

import com.example.demo.models.Doctors;
import com.example.demo.service.userService.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/auth")
@AllArgsConstructor
public class AuthController {
    private final UserService userService;

    @PostMapping("/new-user")
    public String addUser(@RequestBody Doctors doctors){
        userService.addUser(doctors);
        return "user added";
    }
}
