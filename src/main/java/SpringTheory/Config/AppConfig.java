package SpringTheory.Config;

import SpringTheory.Car;
import SpringTheory.Driver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean("car")
    public Car getCarBean() {
        return new Car("BMW");
    }
    @Bean("driver")
    public Driver getDriverBean() {
        return new Driver("Iliya");
    }

}
