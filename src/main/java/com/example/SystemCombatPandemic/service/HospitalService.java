package com.example.SystemCombatPandemic.service;

import com.example.SystemCombatPandemic.dto.response.MessageResponseDTO;
import com.example.SystemCombatPandemic.dto.request.HospitalDTO;
import com.example.SystemCombatPandemic.entity.Hospital;
import com.example.SystemCombatPandemic.mapper.HospitalMapper;
import com.example.SystemCombatPandemic.repository.HospitalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

//AQUI É a minha classe de serviços

@Service
public class HospitalService {

    private HospitalRepository hospitalRepository;

    private final HospitalMapper hospitalMapper = HospitalMapper.INSTANCE;

    @Autowired//Vai chamar um contrato da interface repository para essa classe controller
    public HospitalService(HospitalRepository hospitalRepository) {

        this.hospitalRepository = hospitalRepository;
    }

    //VAI MOSTRAR uma lista de Hospitais
    public  List<HospitalDTO> listAll() {

        List<Hospital> allHospital = hospitalRepository.findAll();
        return allHospital.stream()
                .map(hospitalMapper::toDTO)
                .collect(Collectors.toList());
    }


   //Vai inserir os Hospitais
    public MessageResponseDTO insertHospital(HospitalDTO hospitalDTO){
          Hospital hospitalToSave = hospitalMapper.toModel(hospitalDTO);

        Hospital savedHospital = hospitalRepository.save(hospitalToSave);

        return createMessageResponse(savedHospital.getId(),"Criado com o id:");

    }

    private MessageResponseDTO createMessageResponse(Long id,String message){
        return MessageResponseDTO
                .builder()
                .message(message + id)
                .build();
    }



}
