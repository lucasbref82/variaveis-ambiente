package br.com.variaveis_ambiente.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DadosVariaveisDTO {
    private String nome;
    private String email;
    private String idade;
}
