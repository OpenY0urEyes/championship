package com.example.demo.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class Hospitolzation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "date", nullable = false)
    private Timestamp date;
    @Column(name = "status", nullable = false)
    private String status;
    @Column(name = "reason_giving_up")
    private String reasonGivingUp;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

    @OneToOne
    @JoinColumn(name = "codeByTerapevt_id", referencedColumnName = "id")
    private CodeByTerapevt codeByTerapevt;
}
