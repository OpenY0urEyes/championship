package com.example.demo.service.medcardService;

import com.example.demo.models.Medcard;
import com.example.demo.models.Patient;
import com.example.demo.repository.MedcardRepository;
import com.example.demo.repository.PatientRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ChangeMedcardService {
    private final MedcardRepository medcardRepository;
    private final PatientRepository patientRepository;
    public String changeMedcard(String anamnez, String description_pain, String diagnosis, String recept, String recomendation, Long patient_id){
        Patient patient = patientRepository.findById(patient_id).orElse(null);
        if (patient != null){
            Medcard medcard = medcardRepository.findByPatient(patient).orElse(null);
            if (anamnez.isEmpty()){
                anamnez = medcard.getAnamnez();
            }
            if (description_pain.isEmpty()){
                description_pain = medcard.getDescriptionPain();
            }
            if (diagnosis.isEmpty()){
                diagnosis = medcard.getDiagnosis();
            }
            if (recept.isEmpty()){
                recept = medcard.getRecept();
            }

            if (recomendation.isEmpty()){
                recomendation = medcard.getRecomendation();
            }

            if (recept.split(",").length > 10){
                return "Не более 10 препаратов";
            }
            medcard.setAnamnez(anamnez);
            medcard.setDiagnosis(diagnosis);
            medcard.setRecept(recept);
            medcard.setRecomendation(recomendation);
            medcard.setDescriptionPain(description_pain);

            medcardRepository.save(medcard);
            return "medcard changed";
        }
        return "patient not find";
    }
}
