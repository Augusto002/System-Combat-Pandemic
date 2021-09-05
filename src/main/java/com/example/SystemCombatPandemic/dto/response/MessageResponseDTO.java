package com.example.SystemCombatPandemic.dto.response;

import lombok.Builder;
import lombok.Data;

//ESSA classe vai mandar uma mensagem quando a requisição for feita no Insominia

@Data
@Builder
public  class MessageResponseDTO {

    private String message;


}
