package pivotal.io.apj.pa.workshops;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ApjWorkshopsApplication {

	private WorkshopRepository workshopRepository;

	@Bean
	ApplicationRunner run (WorkshopRepository workshopRepository) {
		return args ->
				workshopRepository.findAll().forEach(System.out::println);
	}

	public static void main(String[] args) {
		SpringApplication.run(ApjWorkshopsApplication.class, args);
	}
}
