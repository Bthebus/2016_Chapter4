package za.ac.cput.PrincipleOfLeastKnowledge.appConfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import za.ac.cput.PrincipleOfLeastKnowledge.bad.impl.Pigeon;
import za.ac.cput.PrincipleOfLeastKnowledge.good.impl.Eagle;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-03-26
 */
@Configuration 
public class AppConfig {

    @Bean(name="pigeon")
    public Pigeon getPigeon()
    {
        return new Pigeon();
    }

    @Bean(name="eagle")
    public Eagle getEagle()
    {
        return new Eagle();
    }
}
