package fi.haagahelia.car.carstock;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import fi.haagahelia.car.carstock.utils.PopulateDB;

@SpringBootApplication
public class CarstockApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarstockApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(PopulateDB populateDb) {
		return (args) -> {
			populateDb.populate();
		};
	}

}
