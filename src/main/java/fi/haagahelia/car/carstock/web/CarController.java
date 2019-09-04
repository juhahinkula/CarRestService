package fi.haagahelia.car.carstock.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import fi.haagahelia.car.carstock.utils.PopulateDB;

@RestController
public class CarController {
	@Autowired
	private PopulateDB populateDb;
	
	@RequestMapping("reset")
	public String reset() {
		populateDb.populate();
		return "reset ok";
	}
}
