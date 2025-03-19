package br.com.variaveis_ambiente.controller;

import br.com.variaveis_ambiente.config.VariaveisConfiguration;
import br.com.variaveis_ambiente.dto.DadosVariaveisDTO;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/variaveis")
@AllArgsConstructor
public class VariaveisController {

    private VariaveisConfiguration variaveisConfiguration;

    @GetMapping("/recuperar")
    public ResponseEntity<DadosVariaveisDTO> getVariaveisAmbiente() {
        return ResponseEntity
                .ok(DadosVariaveisDTO
                        .builder()
                        .nome(variaveisConfiguration.getNome())
                        .email(variaveisConfiguration.getEmail())
                        .idade(variaveisConfiguration.getIdade())
                        .build()
                );
    }
}
