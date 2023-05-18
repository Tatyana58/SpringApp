package SpringTheory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;


public class TaxiPark {

    @Autowired
    //@Qualifier("driver2")
    private List<Driver> drivers;

    public List<Driver> getDrivers() {
        return drivers;
    }

    @PostConstruct
    public void showDriverCount() {
        System.out.printf("В парке %d водителя.",drivers.size());
    }

    public void setDrivers(List<Driver> drivers) {
        this.drivers = drivers;
    }

    @Override
    public String toString() {
        return "TaxiPark{" +
                "driver=" + drivers +
                '}';
    }
}
