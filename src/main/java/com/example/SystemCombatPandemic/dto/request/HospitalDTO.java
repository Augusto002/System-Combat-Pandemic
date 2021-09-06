package com.example.SystemCombatPandemic.dto.request;

import com.example.SystemCombatPandemic.entity.Localizacao;
import com.example.SystemCombatPandemic.entity.Recursos;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.List;


//Aqui é a minha classe DTO onde vou fazer o refinamento dos Dados, antes de ir para o banco


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class HospitalDTO {

   private Long id;

    @NotEmpty
    @Size(min = 2,max = 50)
    private String nome;

    @NotEmpty
    @Size(min = 2, max = 60)
    private String endereco;

    @NotEmpty
    @Size(min = 14,max = 14)
    private String cnpj;

    @NotEmpty
    private int percentual;

    @Valid
    @NotEmpty
    private List<Recursos> recursos;

    @Valid
    @NotEmpty
    private List<Localizacao> localizacao;
}
