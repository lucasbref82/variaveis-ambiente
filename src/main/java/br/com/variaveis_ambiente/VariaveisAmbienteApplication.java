package br.com.variaveis_ambiente;

import br.com.variaveis_ambiente.config.VariaveisConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(VariaveisConfiguration.class)
public class VariaveisAmbienteApplication {

	public static void main(String[] args) {
		SpringApplication.run(VariaveisAmbienteApplication.class, args);
	}

}
