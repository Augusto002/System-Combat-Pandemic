package com.example.SystemCombatPandemic.dto.request;

import com.example.SystemCombatPandemic.entity.enums.ponto_Item;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

//Aqui é a minha classe DTO onde vou fazer o refinamento dos Dados, antes de ir para o banco

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RecursosDTO {

    private Long id;

    @Enumerated(EnumType.STRING)
    private ponto_Item nome_item;

    @NotEmpty
    private int ponto_item;

    @NotEmpty
    private int qtd_item;
}
