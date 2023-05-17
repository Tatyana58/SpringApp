package SpringTheory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


public class TaxiPark {

    @Autowired
    @Qualifier("driver1")
    private Driver driver;


    @Override
    public String toString() {
        return "TaxiPark{" +
                "driver=" + driver +
                '}';
    }
}
