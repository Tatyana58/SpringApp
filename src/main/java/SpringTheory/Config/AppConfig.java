package SpringTheory.Config;

import SpringTheory.Car;
import SpringTheory.Driver;
import SpringTheory.TaxiPark;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Configuration
public class AppConfig {

    @Bean("car")
    public Car getCarBean() {
        return new Car("BMW");
    }
    @Bean("driver1")
    @Primary
    @Scope(scopeName = "prototype")
    public Driver getDriver1Bean() {
        return new Driver("Iliya");
    }

    @Bean("driver2")

    @Scope(scopeName = "prototype")
    public Driver getDriver2Bean() {
        return new Driver("Semen");
    }

    @Bean
    public TaxiPark getTaxiPark() {
        return new TaxiPark();
    }

}
