package com.example.demo.DTO;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
public class ChangeMedcardRequest {
    private String anamnez;
    private String description_pain;
    private String diagnosis;
    private String recept;
    private String recomendation;
    private Long patient_id;
}
