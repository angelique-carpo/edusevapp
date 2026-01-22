package gr.aueb.cf.edusevapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class EdusevappApplication {

	public static void main(String[] args) {
		SpringApplication.run(EdusevappApplication.class, args);
	}

}
