package za.ac.cput.PrincipleOfLeastKnowledge.bad;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.PrincipleOfLeastKnowledge.appConfig.AppConfig;
import za.ac.cput.PrincipleOfLeastKnowledge.bad.impl.Pigeon;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-03-26
 */
public class PigeonTest extends TestCase{

    private ApplicationContext ctx;
    private Pigeon bird;

    @Before
    public void setUp() throws Exception {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        bird = (Pigeon)ctx.getBean("pigeon");
    }

    @After
    public void tearDown() throws Exception {
        ctx=null;
        bird=null;
    }

    @Test
    public void testEat() throws Exception
    {
        assertEquals("eat", bird.eat());
    }

    @Test
    public void testFly() throws Exception{
        assertEquals("Bird flies", bird.fly());
    }

   @Test
    public void testMakeNoise() throws Exception
    {
        assertEquals("Bird makes noise",bird.makeNoise());
    }


}
