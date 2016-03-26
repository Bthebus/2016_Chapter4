package za.ac.cput.OpenCLosedPrinciple.appConfig;

import org.springframework.context.annotation.Bean;
import za.ac.cput.OpenCLosedPrinciple.bad.impl.Greeting;
import za.ac.cput.OpenCLosedPrinciple.good.impl.CasualFormality;
import za.ac.cput.OpenCLosedPrinciple.good.impl.FormalFormality;
import za.ac.cput.OpenCLosedPrinciple.good.impl.IntimateFormality;
import za.ac.cput.OpenCLosedPrinciple.good.services.Formality;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-03-21
 */
@Configuration
public class AppConfig {

    @Bean(name="default")
    public Greeting getDefault()
    {
        return new Greeting();
    }

    @Bean(name="casual")
    public Greeting getCasual()
    {
        return new Greeting("Casual");
    }
    @Bean(name="intimate")
    public Greeting getIntimate()
    {
        return new Greeting("Intimate");
    }
    @Bean(name="formal")
    public Greeting getFormal()
    {
        return new Greeting("Formal");
    }

    @Bean(name="intimateFormality")
    public IntimateFormality getIntimateFormality()
    {
       return new IntimateFormality();
    }

    @Bean(name="casualFormality")
    public CasualFormality getCasualFormality()
    {
        return new CasualFormality();
    }
    @Bean(name="formalFormality")
    public FormalFormality getFormalFormality()
    {
        return new FormalFormality();
    }

}
