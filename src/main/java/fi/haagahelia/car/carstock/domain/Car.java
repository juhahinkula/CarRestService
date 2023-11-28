package fi.haagahelia.car.carstock.domain;

import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Schema(name = "Car", description = "A car object")
public class Car {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Hidden
	private long id;
	@Schema(description = "The brand of the car", example = "Ford")
	private String brand;
	@Schema(description = "The model of the car", example = "Mustang")
	private String model;
	@Schema(description = "The color of the car", example = "Red")
	private String color;
	@Schema(description = "The fuel of the car", example = "Diesel")
	private String fuel;
	@Schema(description = "The year model of the car", example = "2023")
	private int modelYear;
	@Schema(description = "The price of the car (euros)", example = "44000")
	private int price;
	
	public Car() {
	}
	
	public Car(String brand, String model, String color, String fuel, int year, int price) {
		super();
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.fuel = fuel;
		this.modelYear = year;
		this.price = price;
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getFuel() {
		return fuel;
	}
	
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	
	public int getModelYear() {
		return modelYear;
	}
	
	public void setModelYear(int year) {
		this.modelYear = year;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
