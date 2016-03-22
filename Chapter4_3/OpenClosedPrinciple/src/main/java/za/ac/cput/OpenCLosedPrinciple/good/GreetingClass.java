package za.ac.cput.OpenCLosedPrinciple.good;

import za.ac.cput.OpenCLosedPrinciple.good.services.Formality;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-03-21
 */
public class GreetingClass {
    private Formality formality;

    public GreetingClass()
    {
    }

    public GreetingClass(Formality formality)
    {
        this.formality = formality;
    }

    public String greet()
    {
        return this.formality.greet();
    }
}
