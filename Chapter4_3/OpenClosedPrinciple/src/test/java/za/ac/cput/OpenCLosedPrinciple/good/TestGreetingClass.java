package za.ac.cput.OpenCLosedPrinciple.good;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.OpenCLosedPrinciple.appConfig.AppConfig;
import za.ac.cput.OpenCLosedPrinciple.good.services.Formality;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-03-21
 */
class DefaultGreeting implements Formality
{
    @Override
    public String greet() {
        return "Hello";
    }
}

public class TestGreetingClass extends TestCase {

    private DefaultGreeting dg;
    private GreetingClass gc;

    @Before
    public void setUp() throws Exception
    {
        dg = new DefaultGreeting();
        gc = new GreetingClass(dg);
    }

    @After
    public void tearDown() throws Exception
    {
        dg = null;
        gc = null;
    }

    @Test
    public void testGreetingClass()
    {
        assertEquals("Hello", gc.greet());
    }
}
