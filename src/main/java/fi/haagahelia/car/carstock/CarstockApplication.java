package fi.haagahelia.car.carstock;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import fi.haagahelia.car.carstock.domain.Car;
import fi.haagahelia.car.carstock.domain.CarRepository;

@SpringBootApplication
public class CarstockApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarstockApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(CarRepository repository) {
		return (args) -> {
			repository.save(new Car("Ford", "Mondeo", "Red", "Diesel", 2013, 17500));
			repository.save(new Car("Ford", "Focus", "White", "A95", 2015, 18900));
			repository.save(new Car("Ford", "Focus", "Red", "A95", 2016, 19000));
			repository.save(new Car("Alfa Romeo", "Spider", "Black", "B98", 2016, 21000));
			repository.save(new Car("Mercedes-Benz", "180", "Silver", "Diesel", 2011, 16500));
			repository.save(new Car("Mercedes-Benz", "E200", "Silver", "Diesel", 2010, 21500));
			repository.save(new Car("Mercedes-Benz", "A", "Red", "A95", 2017, 23500));
			repository.save(new Car("Mazda", "6", "Red", "A95", 2018, 29000));
			repository.save(new Car("Audi", "A3", "Black", "A95", 2014, 19000));
			repository.save(new Car("Audi", "A3", "Silver", "A95", 2011, 12500));
			repository.save(new Car("Audi", "A4", "White", "A95", 2017, 31500));
			repository.save(new Car("Peugeot", "508", "Red", "A95", 2015, 17900));			
			repository.save(new Car("Toyota", "Auris", "Black", "A95", 2013, 16700));
			repository.save(new Car("Toyota", "Auris", "Blue", "Hybrid", 2015, 19000));
			repository.save(new Car("Toyota", "Avensis", "White", "Diesel", 2015, 18700));
			repository.save(new Car("Toyota", "Prius", "White", "Hybrid", 2016, 21500));
			repository.save(new Car("Nissan", "Micra", "Red", "A95", 2015, 15000));
			repository.save(new Car("Nissan", "Micra", "Blue", "A95", 2016, 15500));
			repository.save(new Car("Tesla", "Model S", "White", "Electric", 2016, 75000));
			repository.save(new Car("Tesla", "Model X", "Silver", "Electric", 2017, 96000));
			repository.save(new Car("Nissan", "Leaf", "Red", "Electric", 2016, 29000));
			repository.save(new Car("Volvo", "V40", "White", "Diesel", 2017, 32000));
			repository.save(new Car("Volvo", "S40", "White", "A95", 2012, 17500));
			repository.save(new Car("Volvo", "XC40", "Black", "Diesel", 2016, 35000));
			repository.save(new Car("Volvo", "XC60", "Black", "A95", 2015, 39000));
			repository.save(new Car("Nissan", "X-Trail", "Silver", "Diesel", 2012, 19000));
			repository.save(new Car("Volkswagen", "Polo", "Blue", "A95", 2014, 13300));
			repository.save(new Car("Porsche", "911", "Red", "A98", 2007, 29000));
			repository.save(new Car("Skoda", "Suberb", "Silver", "A95", 2018, 38000));
			repository.save(new Car("Skoda", "Octavia", "Green", "A95", 2014, 18400));
			repository.save(new Car("Subaru", "Outback", "White", "A95", 2012, 19000));
			repository.save(new Car("Opel", "Astra", "White", "A95", 2017, 23000));
			repository.save(new Car("Opel", "Mokka", "Red", "A95", 2014, 21000));
			repository.save(new Car("Lexus", "Ct", "White", "Hybrid", 2013, 21500));
		};
	}

}
