package com.example.demo.service.doctorDetailsService;

import com.example.demo.config.DoctorDetails;
import com.example.demo.models.Doctors;
import com.example.demo.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DoctorDetailsService implements UserDetailsService {

    @Autowired
    private DoctorRepository doctorRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<Doctors> doctors = doctorRepository.findByName(username);
        return doctors.map(DoctorDetails::new)
                .orElseThrow(() -> new UsernameNotFoundException(username + " not found"));
    }
}
