package za.ac.cput.DependencyInversionPrinciple.bad;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.DependencyInversionPrinciple.appConfig.AppConfig;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-03-25
 */
public class PersonTest extends TestCase {

    private ApplicationContext ctx;
    private Greeting greeting;

    @Before
    public void setUp() throws Exception
    {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        greeting = (Greeting)ctx.getBean("greeting");
    }

    @After
    public void tearDown() throws Exception {

        ctx = null;
        greeting  = null;
    }

    @Test
    public void testFormal() throws Exception
    {
        assertEquals("Good evening sir.", greeting.formal());
    }

    @Test
    public void testCasual() throws Exception
    {
        assertEquals("yo dude!", greeting.casual());
    }
}
