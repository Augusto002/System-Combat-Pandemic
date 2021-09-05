package com.example.SystemCombatPandemic.mapper;


import com.example.SystemCombatPandemic.dto.request.HospitalDTO;
import com.example.SystemCombatPandemic.entity.Hospital;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

//Aqui vai fazer a conversão de um OBJETO DTO para entidade e de entidade para DTO

@Mapper
public interface HospitalMapper {

    HospitalMapper INSTANCE = Mappers.getMapper(HospitalMapper.class);


    Hospital toModel(HospitalDTO hospitalDTO);

    HospitalDTO toDTO(Hospital hospital);

}
