package za.ac.cput.SRP.good;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.SRP.appConfig.AppConfig;
import za.ac.cput.SRP.good.impl.ImprovedKettle;
import za.ac.cput.SRP.good.services.ImprovedKettleService;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-03-21
 */
public class ImprovedKettleTest extends TestCase {
    private ApplicationContext ctx;
    private ImprovedKettleService improvedKettle;

    @Before
    public void setUp() throws Exception{
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        improvedKettle = (ImprovedKettle)ctx.getBean("improvedKettle");
    }

    @After
    public void tearDown() throws Exception
    {
        ctx = null;
        improvedKettle = null;
    }

    @Test
    public void testInsertWater() throws Exception
    {
        improvedKettle.insertWater(200);
        assertEquals(200, improvedKettle.getCurrentVolume(), .0);
    }

    @Test
    public void testPourWater() throws Exception{
        improvedKettle.insertWater(300);
        improvedKettle.pourWater(200);
        assertEquals(100, improvedKettle.getCurrentVolume(), .0);
    }

    @Test
    public void testIsOn() throws Exception
    {
        improvedKettle.toggleOnOff(true);
        assertTrue(improvedKettle.isOn());
    }

    @Test
    public void testGetCapacity() throws Exception{
        assertEquals(1500, improvedKettle.getCapacity(), .0);
    }

    @Test
    public void testIsFull() throws Exception{
        //testing empty kettle
        improvedKettle.insertWater(500);
        System.out.println("Current volume: " + improvedKettle.getCurrentVolume());
        System.out.println("Is kettle full:"+improvedKettle.isFull()+"\n");
        assertFalse(improvedKettle.isFull());

        //testing full kettle
        improvedKettle.insertWater(1000);
        System.out.println("Current volume: "+improvedKettle.getCurrentVolume());
        System.out.println("Is kettle full:"+improvedKettle.isFull());
        assertTrue(improvedKettle.isFull());
    }
}
