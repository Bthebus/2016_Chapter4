package za.ac.cput.composition.AppConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import za.ac.cput.composition.Date;
/**
 * Author       : Braedy Thebus
 * Email        : Bthebus2@gmail.com
 * Date Created : 20/03/2016
 */

public class AppConfig {

    @Configuration
    public class AppConfig {

        @Bean(name="dob")
        public Date getCircle()
        {
            return new Circle(5);
        }

        @Bean(name="rectangle")
        public Rectangle getRectangle()
        {
            return new Rectangle(7,5);
        }

        @Bean(name = "Square")
        public Square getSquare()
        {
            return new Square(5,5);
        }

    }
}
