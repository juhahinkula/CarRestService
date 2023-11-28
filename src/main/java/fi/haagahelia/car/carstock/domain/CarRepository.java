package fi.haagahelia.car.carstock.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.Description;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Car", description = "Car management APIs")
@RepositoryRestResource(collectionResourceRel = "cars", path = "cars", collectionResourceDescription = @Description (value = "A collection of cars"), itemResourceDescription = @Description (value = "A single car"))
public interface CarRepository extends CrudRepository<Car, Long> {
	List<Car> findByBrand(@Param("brand") String brand);
	List<Car> findByModel(@Param("model") String model);
	List<Car> findByFuel(@Param("fuel") String fuel);
	List<Car> findByColor(@Param("color") String color);
	List<Car> findByModelYear(@Param("year") int year);
}

