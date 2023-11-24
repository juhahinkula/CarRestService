package fi.haagahelia.car.carstock.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fi.haagahelia.car.carstock.domain.Car;
import fi.haagahelia.car.carstock.domain.CarRepository;

@Component
public class PopulateDB {
	@Autowired
	private CarRepository repository; 
	
	public void populate() {
		repository.deleteAll();
		
		repository.save(new Car("Ford", "Mondeo", "Red", "Diesel", 2013, 17500));
		repository.save(new Car("Ford", "Focus", "White", "E95", 2015, 18900));
		repository.save(new Car("Ford", "Focus", "Red", "E95", 2016, 19000));
		repository.save(new Car("Alfa Romeo", "Spider", "Black", "E98", 2019, 31000));
		repository.save(new Car("Mercedes-Benz", "180", "Silver", "Diesel", 2011, 16500));
		repository.save(new Car("Mercedes-Benz", "E200", "Silver", "Diesel", 2010, 21500));
		repository.save(new Car("Mercedes-Benz", "A", "Red", "E95", 2017, 23500));
		repository.save(new Car("Mercedes-Benz", "A", "White", "E95", 2020, 34000));
		repository.save(new Car("Mazda", "6", "Red", "E95", 2018, 29000));
		repository.save(new Car("Audi", "A3", "Black", "E95", 2022, 27600));
		repository.save(new Car("Audi", "A3", "Silver", "E95", 2011, 12500));
		repository.save(new Car("Audi", "A4", "White", "E95", 2017, 31500));
		repository.save(new Car("Peugeot", "508", "Red", "E95", 2015, 17900));			
		repository.save(new Car("Toyota", "Auris", "Black", "E95", 2013, 16700));
		repository.save(new Car("Toyota", "Auris", "Blue", "Hybrid", 2015, 19000));
		repository.save(new Car("Toyota", "Avensis", "White", "Diesel", 2021, 28700));
		repository.save(new Car("Toyota", "Prius", "White", "Hybrid", 2022, 35500));
		repository.save(new Car("Nissan", "Micra", "Red", "E95", 2015, 15000));
		repository.save(new Car("Nissan", "Micra", "Blue", "E95", 2016, 15500));
		repository.save(new Car("Tesla", "Model S", "White", "Electric", 2020, 85000));
		repository.save(new Car("Tesla", "Model X", "Silver", "Electric", 2021, 96000));
		repository.save(new Car("Nissan", "Leaf", "Red", "Electric", 2022, 35500));
		repository.save(new Car("Volvo", "V40", "White", "Diesel", 2017, 32000));
		repository.save(new Car("Volvo", "S40", "White", "E95", 2012, 17500));
		repository.save(new Car("Volvo", "XC40", "Black", "Diesel", 2021, 47000));
		repository.save(new Car("Volvo", "XC60", "Black", "E95", 2023, 59000));
		repository.save(new Car("Nissan", "X-Trail", "Silver", "Diesel", 2012, 19000));
		repository.save(new Car("Volkswagen", "Polo", "Blue", "E95", 2014, 13300));
		repository.save(new Car("Porsche", "911", "Red", "E98", 2017, 39000));
		repository.save(new Car("Skoda", "Suberb", "Silver", "E95", 2020, 41000));
		repository.save(new Car("Skoda", "Octavia", "Green", "E95", 2014, 18400));
		repository.save(new Car("Subaru", "Outback", "White", "E95", 2012, 19000));
		repository.save(new Car("Opel", "Astra", "White", "E95", 2022, 39000));
		repository.save(new Car("Opel", "Mokka", "Red", "E95", 2014, 21000));
		repository.save(new Car("Lexus", "Ct", "White", "Hybrid", 2013, 21500));			
		repository.save(new Car("Lexus", "Ct", "Red", "Hybrid", 2023, 36500));
		repository.save(new Car("Hyundai", "Kona", "White", "Electric", 2022, 46000));
		repository.save(new Car("Kia", "Sportage", "Red", "E95", 2022, 42300));
	}
}
