package com.example.demo.repository;

import com.example.demo.models.Medcard;
import com.example.demo.models.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MedcardRepository extends JpaRepository<Medcard, Long> {
    public boolean existsByNumberMedcard(String num);
    public Optional<Medcard> findByPatient(Patient patient);
}
