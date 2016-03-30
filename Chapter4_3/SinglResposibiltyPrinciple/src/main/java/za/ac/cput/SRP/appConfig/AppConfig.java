package za.ac.cput.SRP.appConfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import za.ac.cput.SRP.bad.impl.Kettle;
import za.ac.cput.SRP.bad.services.KettleService;
import za.ac.cput.SRP.good.impl.ImprovedKettle;
import za.ac.cput.SRP.good.services.ImprovedKettleService;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-03-21
 */
@Configuration 
public class AppConfig {

    @Bean(name="kettle")
    public KettleService getKettle() throws Exception
    {
        return new Kettle();
    }

    @Bean(name="improvedKettle")
    public ImprovedKettleService getImprovedKettle() throws Exception
    {
        return new ImprovedKettle();
    }
}
