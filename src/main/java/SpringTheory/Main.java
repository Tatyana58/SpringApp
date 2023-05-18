package SpringTheory;

import SpringTheory.Config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        Car car = context.getBean("car",Car.class);
//        System.out.println(car);

        Driver driver1 = context.getBean("driver1",Driver.class);
        System.out.println(driver1);

        Driver driver2 = context.getBean("driver2",Driver.class);
        System.out.println(driver2);

//        driver.setCar(new Car("Audi"));
//        System.out.println(driver.getCar());
//
//        Driver driver1 = context.getBean("driver",Driver.class);
//        System.out.println(driver1.getCar());


//        TaxiPark taxiPark = context.getBean(TaxiPark.class);
//        //System.out.println(taxiPark);
//        System.out.println(taxiPark.getDrivers());



    }
}
