package com.example.demo.rest;

import com.example.demo.DTO.ChangeMedcardRequest;
import com.example.demo.service.medcardService.ChangeMedcardService;
import com.example.demo.service.medcardService.CreateMedcardService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/medcard")
@AllArgsConstructor
public class MedcardController {
    private final ChangeMedcardService changeMedcard;

    @PostMapping("change-medcard")
    public String changeMedcard(@RequestBody ChangeMedcardRequest request){
        return changeMedcard.changeMedcard(request.getAnamnez(),
                request.getDescription_pain(),
                request.getDiagnosis(),
                request.getRecept(), request.getRecomendation(), request.getPatient_id());
    }
}
