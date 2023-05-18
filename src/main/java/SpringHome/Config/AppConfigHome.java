package SpringHome.Config;

import SpringHome.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfigHome {

    @Bean(name = "car")
    @Scope("prototype")
    public Transport getCarBean() {
        return new Car("Легковая","Volvo","Седан");
    }
    @Bean(name = "bus")
    @Scope("prototype")
    public Transport getBusBean() {
    return new Bus("Автобус","BMW","Автобус");
    }

    @Bean(name = "pickup")
    @Scope("prototype")
        public Transport getPickupBean() {
        return new Pickup("Самосвал","Камаз","Грузовик");
    }
    @Bean(name = "driver1")
    public Driver getDriver1() {
        return new Driver("Вася",getCarBean());
    }

    @Bean(name = "driver2")
//    @Qualifier("bus")
    public Driver getDriver2() {
        return new Driver("Петя",getBusBean());
    }
    @Bean(name = "driver3")
    public Driver getDriver3() {
        return new Driver("Григорий",getPickupBean());
    }
}
