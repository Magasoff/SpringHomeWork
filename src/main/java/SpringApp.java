import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        Driver driver = context.getBean("driver", Driver.class);
        driver.startTheCar();

        Driver driver1 = context.getBean("driver1", Driver.class);
        driver1.startTheCar();

        Driver driver2 = context.getBean("driver2", Driver.class);
        driver2.startTheCar();
    }
}

