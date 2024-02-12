package com.example.demo.repository;

import com.example.demo.models.Hospitolzation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HospitalizationRepository extends JpaRepository<Hospitolzation, Long> {

}
