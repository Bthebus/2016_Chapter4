package za.ac.cput.DependencyInversionPrinciple.appConfig;

import org.springframework.context.annotation.Bean;
import za.ac.cput.DependencyInversionPrinciple.bad.Greeting;
import za.ac.cput.DependencyInversionPrinciple.good.AnotherPerson;
import za.ac.cput.DependencyInversionPrinciple.good.Greet;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-03-25
 */
 @Configuration
public class AppConfig {

    @Bean(name = "greeting")
    public Greeting getGreeting()
    {
        return new Greeting();
    }

    @Bean(name="greet")
    public AnotherPerson getGreet()
    {
        return new AnotherPerson();
    }

}
