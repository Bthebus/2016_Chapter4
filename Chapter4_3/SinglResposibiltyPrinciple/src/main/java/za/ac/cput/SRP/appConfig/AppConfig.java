package za.ac.cput.SRP.appConfig;

import org.springframework.context.annotation.Bean;
import za.ac.cput.SRP.bad.Kettle;
import za.ac.cput.SRP.bad.KettleService;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-03-21
 */
public class AppConfig {

    @Bean(name="kettle")
    public KettleService getKettle() throws Exception
    {
        return new Kettle();
    }
}
