package com.example.SystemCombatPandemic.service;

import com.example.SystemCombatPandemic.dto.MessageResponseDTO;
import com.example.SystemCombatPandemic.entity.Hospital;
import com.example.SystemCombatPandemic.entity.Recursos;
import com.example.SystemCombatPandemic.repository.HospitalRepository;
import com.example.SystemCombatPandemic.repository.RecursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class HospitalService {

    private HospitalRepository hospitalRepository;

    @Autowired//Vai chamar um contrato da interface repository para essa classe controller
    public HospitalService(HospitalRepository hospitalRepository) {
        this.hospitalRepository = hospitalRepository;
    }





    public MessageResponseDTO insertHospital(Hospital hospital){
        Hospital savedHospital = hospitalRepository.save(hospital);

        return MessageResponseDTO
                .builder()
                .message("Hospital criado com o id: " + savedHospital.getId())
                .build();
    }


}
