package za.ac.cput.LiskovSubstitutionPrinciple.good;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.LiskovSubstitutionPrinciple.appConf.AppConfig;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-03-25
 */
public class ImprovedKettleTest extends TestCase {

    private ApplicationContext ctx;
    private ImprovedKettle kettle;

    @Before
    public void setUp() throws Exception
    {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        kettle = (ImprovedKettle)ctx.getBean("improvedKettle");
    }

    @After
    public void tearDown() throws Exception
    {
        ctx = null;
        kettle =null;
    }

    @Test
    public void testToggleSwitch() throws Exception
    {
        assertTrue(kettle.toggleSwitch());
    }

    @Test
    public void testPourWater() throws Exception
    {
        assertTrue(kettle.pourWater());
    }
}
