package com.example.demo.service.userService;

import com.example.demo.models.Doctors;
import com.example.demo.repository.DoctorRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {

    private final DoctorRepository doctorRepository;
    private PasswordEncoder passwordEncoder;

    public void addUser(Doctors doctors){
        doctors.setPassword(passwordEncoder.encode(doctors.getPassword()));
        doctorRepository.save(doctors);

    }
}
