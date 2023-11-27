package fi.haagahelia.car.carstock;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class OpenApiConfig {
	@Bean
	public OpenAPI carDatabaseOpenAPI() {
		return new OpenAPI()
				.info(new Info()
						.title("Car Shop REST API")
						.description("Car Shop")
						.version("1.0"));
	}
}