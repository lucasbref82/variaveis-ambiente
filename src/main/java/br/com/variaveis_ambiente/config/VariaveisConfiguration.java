package br.com.variaveis_ambiente.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "param.lucas")
@Data
public class VariaveisConfiguration {
    private String nome;
    private String email;
    private String idade;
}
