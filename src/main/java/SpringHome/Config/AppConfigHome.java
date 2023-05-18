package SpringHome.Config;

import SpringHome.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfigHome {

//    @Bean(name = "bus")
//    @Scope(scopeName = "prototype")
//    public Transport getBusBean() {
//        return new Bus(getBusBean().getModel(), "BMW","454");
//    }
//    @Bean(name = "car")
//    public Transport getCarBean() {
//        return new Car(getCarBean().getModel(),"Volvo","777");
//    }
//
    @Bean(name = "pickup")
    public Transport getPickupBean() {
        return new Pickup("камаз","Самосвал","грузовик");
    }

    @Bean(name = "driver1")
    @Scope(scopeName = "prototype")
    public Driver getDriver1() {
        return new Driver("Вася",getPickupBean());
    }

//    @Bean(name = "driver2")
//    public Driver getDriver2() {
//        return new Driver("Петя",getBusBean());
//    }
//    @Bean(name = "driver3")
//    public Driver getDriver3() {
//        return new Driver("Григорий",getPickupBean());
//    }
}
