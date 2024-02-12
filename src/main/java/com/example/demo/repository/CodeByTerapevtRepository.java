package com.example.demo.repository;

import com.example.demo.models.CodeByTerapevt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CodeByTerapevtRepository extends JpaRepository<CodeByTerapevt, Long> {
    public Optional<CodeByTerapevt> findByCode(String code);
}
