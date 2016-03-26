package za.ac.cput.InterfaceSegregationPrinciple.appConfig;

import org.springframework.context.annotation.Bean;
import za.ac.cput.InterfaceSegregationPrinciple.bad.Cellphone;
import za.ac.cput.InterfaceSegregationPrinciple.good.impl.LGCellphone;
import za.ac.cput.InterfaceSegregationPrinciple.good.impl.SamsungCellphone;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-03-25
 */
@Configuration
public class AppConfig {
    @Bean(name="cell1")
    public Cellphone getCellphone()
    {
        return new Cellphone();
    }

    @Bean(name="LG")
    public LGCellphone getLGCell()
    {
        return new LGCellphone();
    }

    @Bean(name="Samsung")
    public SamsungCellphone getSamsungCell()
    {
        return new SamsungCellphone();
    }
}
