package br.edu.ifsp.arq.prss6.glicdiary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import br.edu.ifsp.arq.prss6.glicdiary.config.property.GlicDiaryApiProperty;

@SpringBootApplication
@EnableConfigurationProperties(GlicDiaryApiProperty.class)
public class GlicDiaryApplication {

	public static void main(String[] args) {
		SpringApplication.run(GlicDiaryApplication.class, args);
	}

}
