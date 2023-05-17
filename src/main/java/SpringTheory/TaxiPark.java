package SpringTheory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class TaxiPark {

    @Autowired
    private Driver driver;


    @Override
    public String toString() {
        return "TaxiPark{" +
                "driver=" + driver +
                '}';
    }
}
