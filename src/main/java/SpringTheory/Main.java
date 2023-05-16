package SpringTheory;

import SpringTheory.Config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
//        Car car = context.getBean("car",Car.class);
//        System.out.println(car);
        Driver driver = context.getBean("driver",Driver.class);
        System.out.println(driver.getCar());

        driver.setCar(new Car("Audi"));
        System.out.println(driver.getCar());

    }
}
