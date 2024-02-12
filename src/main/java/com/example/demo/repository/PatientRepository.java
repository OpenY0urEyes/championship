package com.example.demo.repository;

import com.example.demo.models.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
    public Optional<Patient> findById(Long id);
    public boolean existsById(Long id);
    public boolean existsByFirstName(String fName);
    public boolean existsByLastName(String lName);
    public boolean existsByMiddleName(String mName);
    public boolean existsByNumberPhone(String phone);
    public boolean existsByEmail(String email);
    public boolean existsByNumberPolic(String polic);

}
