package za.ac.cput.LiskovSubstitutionPrinciple.appConf;

import org.springframework.context.annotation.Bean;
import za.ac.cput.LiskovSubstitutionPrinciple.bad.Kettle;
import za.ac.cput.LiskovSubstitutionPrinciple.good.ImprovedKettle;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-03-25
 */
public class AppConfig {

    @Bean(name="kettle")
    public Kettle getKettle()
    {
        return new Kettle();
    }

    @Bean(name="improvedKettle")
    public ImprovedKettle getImprovedKettle()
    {
        return new ImprovedKettle();
    }
}
