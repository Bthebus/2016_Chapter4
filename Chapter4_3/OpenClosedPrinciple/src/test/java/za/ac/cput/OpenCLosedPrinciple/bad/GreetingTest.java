package za.ac.cput.OpenCLosedPrinciple.bad;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.OpenCLosedPrinciple.appConfig.AppConfig;
import za.ac.cput.OpenCLosedPrinciple.bad.impl.Greeting;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-03-21
 */
public class GreetingTest extends TestCase {

    private ApplicationContext ctx;
    private Greeting defaultGreeting, casual, formal, intimate;

    @Before
    public void setUp() throws Exception
    {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        defaultGreeting  = (Greeting)ctx.getBean("default");
        casual = (Greeting)ctx.getBean("casual");
        formal = (Greeting)ctx.getBean("formal");
        intimate = (Greeting)ctx.getBean("intimate");
    }

    @After
    public void tearDown() throws Exception
    {
        ctx = null;
        defaultGreeting = casual = formal = intimate =null;
    }

    @Test
    public void testCasualGreeting() throws Exception{
        assertEquals("Howsit going bru?", casual.getGreeting());
    }

    @Test
    public void testFormalGreeting() throws Exception{
        assertEquals("Good Evening good sir!", formal.getGreeting());
    }

    @Test
    public void testIntimateGreeting() throws Exception{
        assertEquals("Hey babe!", intimate.getGreeting());
    }
}
