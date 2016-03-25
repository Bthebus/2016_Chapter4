package za.ac.cput.DependencyInversionPrinciple.bad;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.DependencyInversionPrinciple.appConfig.AppConfig;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-03-25
 */
public class Person {

    private ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
    private Greeting greeting = (Greeting)ctx.getBean("greeting");

    public Person() {
    }

    public String formal()
    {
        return greeting.formal();
    }

    public String casual()
    {
        return greeting.casual();
    }
}
