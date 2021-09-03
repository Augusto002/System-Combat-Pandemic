package com.example.SystemCombatPandemic.controller;

import com.example.SystemCombatPandemic.dto.MessageResponseDTO;
import com.example.SystemCombatPandemic.entity.Hospital;
import com.example.SystemCombatPandemic.repository.HospitalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/hospital")
public class HospitalController {

    private HospitalRepository hospitalRepository;

    @Autowired //Vai chamar um contrato da interface repository para essa classe controller
    public HospitalController(HospitalRepository hospitalRepository) {
        this.hospitalRepository = hospitalRepository;
    }

    @PostMapping()
    public MessageResponseDTO insertHospital(@RequestBody Hospital hospital){
       Hospital savedHospital = hospitalRepository.save(hospital);
        return MessageResponseDTO
                .builder()
        .message("Hospital criado com o id: " + savedHospital.getId())
        .build();
    }

}
