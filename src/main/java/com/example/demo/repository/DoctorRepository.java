package com.example.demo.repository;

import com.example.demo.models.Doctors;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DoctorRepository extends JpaRepository<Doctors, Long> {
    Optional<Doctors> findByName(String username);
}
