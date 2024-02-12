package com.example.demo.repository;

import com.example.demo.models.HospitalEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface HospitalEventRepository extends JpaRepository<HospitalEvent, Long> {
    public Optional<HospitalEvent> findById(Long id);
    public boolean existsById(Long id);
}
