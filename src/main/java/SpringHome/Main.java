package SpringHome;

import SpringHome.Config.AppConfigHome;
import SpringTheory.Config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfigHome.class);
        Driver driver1 = context.getBean("driver1", Driver.class);
//        Driver driver2 = context.getBean("driver2", Driver.class);
//        Driver driver3 = context.getBean("driver3", Driver.class);
          System.out.println(driver1);
//        System.out.println(driver2);
//        System.out.println(driver3);
          driver1.startCar();

//        Transport transport = context.getBean(Transport.class);
//        System.out.println(transport);

        context.close();

    }
}
