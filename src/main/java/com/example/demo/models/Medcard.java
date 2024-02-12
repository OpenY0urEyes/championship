package com.example.demo.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Medcard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="number_medcard", nullable = true)
    private String numberMedcard;
    @Column(name="date_take_medcard")
    private Timestamp dateTakeMedcard;
    private String anamnez;
    @Column(name="description_pain")
    private String descriptionPain;
    @Column(name="diagnosis")
    private String diagnosis;
    @Column(name="recomendation")
    private String recomendation;
    @Column(name="recept")
    private String recept;
    @OneToOne
    @JoinColumn(name = "patient_id", referencedColumnName = "id")
    private Patient patient;

}
