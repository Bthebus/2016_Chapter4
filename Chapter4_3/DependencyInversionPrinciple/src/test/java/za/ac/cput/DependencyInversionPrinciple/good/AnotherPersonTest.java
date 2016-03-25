package za.ac.cput.DependencyInversionPrinciple.good;

import junit.framework.TestCase;
import org.junit.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.DependencyInversionPrinciple.appConfig.AppConfig;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-03-25
 */
public class AnotherPersonTest extends TestCase {

    private ApplicationContext ctx;
    private AnotherPerson greet;

    @Before
    public void setUp() throws Exception
    {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        greet = (AnotherPerson)ctx.getBean("greet");
    }

    @After
    public void tearDown() throws Exception {

        ctx = null;
        greet  = null;
    }

    @Test
    public void testFormal() throws Exception{
        assertEquals("Good evening sir.",greet.formalGreeting());
    }

    @Test
    public void tesCasual() throws Exception
    {
        assertEquals("Sup dude!", greet.casualGreeting());
    }

}