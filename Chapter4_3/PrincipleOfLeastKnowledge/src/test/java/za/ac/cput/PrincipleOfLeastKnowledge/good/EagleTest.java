package za.ac.cput.PrincipleOfLeastKnowledge.good;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.PrincipleOfLeastKnowledge.appConfig.AppConfig;
import za.ac.cput.PrincipleOfLeastKnowledge.good.impl.Eagle;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-03-26
 */
public class EagleTest extends TestCase {
    private ApplicationContext ctx;
    private Eagle eagle;


    @Before
    public void setUp() throws Exception
    {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        eagle = (Eagle)ctx.getBean("eagle");
    }

    @After
    public void tearDown() throws Exception {
        ctx = null;
        eagle = null;
    }

    @Test
    public void testEat() throws Exception {
        assertEquals("Eagle eats", eagle.eat());
    }

    @Test
    public void testMakeNoise() throws Exception
    {
        assertEquals("Eagle makes noise", eagle.makeNoise());
    }
}
