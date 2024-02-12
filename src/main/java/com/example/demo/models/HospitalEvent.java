package com.example.demo.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class HospitalEvent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="first_name_patient", nullable = false)
    private String fNamePatient;
    @Column(name="last_name_patient", nullable = false)
    private String lNamePatient;
    @Column(name="middle_name_patient", nullable = true)
    private String mNamePatient;
    @Column(name="date_hospitalEvent", nullable = false)
    private Timestamp dateHosptialEvent;
    @Column(name="first_name_doctor", nullable = false)
    private String fNameDoctor;
    @Column(name="type_event", nullable = false)
    private String type;
    @Column(name="name_event", nullable = false)
    private String name;
    @Column(name="result_event", nullable = false)
    private String result;
    @Column(name="recomendation", nullable = false)
    private String recomendation;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;




}
