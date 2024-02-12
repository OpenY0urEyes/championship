package com.example.demo.service.hospitalizationService;

import com.example.demo.models.CodeByTerapevt;
import com.example.demo.models.Hospitolzation;
import com.example.demo.models.Patient;
import com.example.demo.repository.CodeByTerapevtRepository;
import com.example.demo.repository.HospitalizationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;

@Service
@AllArgsConstructor
public class HospitalizationService {
    private final HospitalizationRepository hospitalizationRepository;
    private final CodeByTerapevtRepository codeByTerapevtRepository;



    public String addHospitalization(Timestamp date,
                                     String status,
                                     String codeByTerapevt,
                                     String firstName,
                                     String lastName,
                                     String passport){
        CodeByTerapevt code = codeByTerapevtRepository.findByCode(codeByTerapevt).orElse(null);
        Patient patient = code.getPatient();
        if (patient.getFirstName().equals(firstName) &&
                patient.getLastName().equals(lastName) &&
                patient.getPassport().equals(passport)){
            Hospitolzation hospitolzation = new Hospitolzation();
            hospitolzation.setDate(date);
            hospitolzation.setStatus(status);
            hospitolzation.setCodeByTerapevt(code);
            hospitolzation.setPatient(patient);
            hospitalizationRepository.save(hospitolzation);
            return "hospitolzation added";
        }
        return "not added";
    }
}
