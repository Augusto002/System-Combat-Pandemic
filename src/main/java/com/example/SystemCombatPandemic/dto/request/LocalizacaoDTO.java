package com.example.SystemCombatPandemic.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;


//Aqui é a minha classe DTO onde vou fazer o refinamento dos Dados, antes de ir para o banco

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LocalizacaoDTO {

    private Long id;

    @NotEmpty
    private String latitude;

    @NotEmpty
    private String longetude;
}
