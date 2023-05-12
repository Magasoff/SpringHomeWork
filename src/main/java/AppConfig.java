import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Car getCarBean() {
        return new Car("BMW","Z23");
    }

    @Bean(name = "driver")
    public Driver getDriver() {
        return new Driver("Вася" , getCarBean());
    }
    @Bean
    public Bus getBusBean () {
        return new Bus("Икарус","Икарус");
    }
    @Bean (name = "driver1")
    public Driver getDriver1 () {
        return  new Driver("Саша", getBusBean());
    }
    @Bean
    public Pickup getPickUpBean () {
        return new Pickup("Ford", "Raptor");
    }
    @Bean (name = "driver2")
    public Driver getDriver2 () {
        return  new Driver("Паша", getPickUpBean());
    }
}