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
		repository.save(new Car("Ford", "Focus", "White", "A95", 2015, 18900));
		repository.save(new Car("Ford", "Focus", "Red", "A95", 2016, 19000));
		repository.save(new Car("Alfa Romeo", "Spider", "Black", "B98", 2019, 31000));
		repository.save(new Car("Mercedes-Benz", "180", "Silver", "Diesel", 2011, 16500));
		repository.save(new Car("Mercedes-Benz", "E200", "Silver", "Diesel", 2010, 21500));
		repository.save(new Car("Mercedes-Benz", "A", "Red", "A95", 2017, 23500));
		repository.save(new Car("Mercedes-Benz", "A", "White", "A95", 2020, 34000));
		repository.save(new Car("Mazda", "6", "Red", "A95", 2018, 29000));
		repository.save(new Car("Audi", "A3", "Black", "A95", 2020, 27600));
		repository.save(new Car("Audi", "A3", "Silver", "A95", 2011, 12500));
		repository.save(new Car("Audi", "A4", "White", "A95", 2017, 31500));
		repository.save(new Car("Peugeot", "508", "Red", "A95", 2015, 17900));			
		repository.save(new Car("Toyota", "Auris", "Black", "A95", 2013, 16700));
		repository.save(new Car("Toyota", "Auris", "Blue", "Hybrid", 2015, 19000));
		repository.save(new Car("Toyota", "Avensis", "White", "Diesel", 2015, 18700));
		repository.save(new Car("Toyota", "Prius", "White", "Hybrid", 2021, 35500));
		repository.save(new Car("Nissan", "Micra", "Red", "A95", 2015, 15000));
		repository.save(new Car("Nissan", "Micra", "Blue", "A95", 2016, 15500));
		repository.save(new Car("Tesla", "Model S", "White", "Electric", 2020, 85000));
		repository.save(new Car("Tesla", "Model X", "Silver", "Electric", 2019, 96000));
		repository.save(new Car("Nissan", "Leaf", "Red", "Electric", 2020, 35500));
		repository.save(new Car("Volvo", "V40", "White", "Diesel", 2017, 32000));
		repository.save(new Car("Volvo", "S40", "White", "A95", 2012, 17500));
		repository.save(new Car("Volvo", "XC40", "Black", "Diesel", 2021, 47000));
		repository.save(new Car("Volvo", "XC60", "Black", "A95", 2015, 39000));
		repository.save(new Car("Nissan", "X-Trail", "Silver", "Diesel", 2012, 19000));
		repository.save(new Car("Volkswagen", "Polo", "Blue", "A95", 2014, 13300));
		repository.save(new Car("Porsche", "911", "Red", "A98", 2017, 39000));
		repository.save(new Car("Skoda", "Suberb", "Silver", "A95", 2020, 41000));
		repository.save(new Car("Skoda", "Octavia", "Green", "A95", 2014, 18400));
		repository.save(new Car("Subaru", "Outback", "White", "A95", 2012, 19000));
		repository.save(new Car("Opel", "Astra", "White", "A95", 2019, 29000));
		repository.save(new Car("Opel", "Mokka", "Red", "A95", 2014, 21000));
		repository.save(new Car("Lexus", "Ct", "White", "Hybrid", 2013, 21500));			
		repository.save(new Car("Lexus", "Ct", "Red", "Hybrid", 2021, 34500));
	}
}
