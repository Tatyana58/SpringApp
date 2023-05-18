package SpringHome;

import SpringHome.Config.AppConfigHome;
import SpringTheory.Config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfigHome.class);

        Driver driver1 = context.getBean("driver1", Driver.class);
        System.out.println(driver1);
        driver1.startCar();

        Driver driver2 = context.getBean("driver2", Driver.class);
        System.out.println(driver2);
        driver2.startCar();

        Driver driver3 = context.getBean("driver3", Driver.class);
        System.out.println(driver3);
        driver3.startCar();
        context.close();
    }
}
