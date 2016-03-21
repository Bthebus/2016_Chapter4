package za.ac.cput.SRP.bad;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.SRP.appConfig.AppConfig;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-03-21
 */
public class KettleTest extends TestCase {

    private ApplicationContext ctx;
    private KettleService kettle;


    @Before
    public void setUp() throws Exception
    {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        kettle = (Kettle)ctx.getBean("kettle");
    }

    @After
    public void tearDown() throws Exception
    {
        ctx = null;
        kettle = null;
    }

    @Test
    public void testInsertWater() throws Exception{
        kettle.insertWater(300);
        assertEquals(300, kettle.getCurrentVolume(), .0);
    }

    @Test
    public void testPourWater() throws Exception{
        kettle.insertWater(300);
        kettle.pourWater(200);
        assertEquals(100, kettle.getCurrentVolume(), .0);
    }

    @Test
    public void testIsOn() throws Exception
    {
        kettle.toggleOnOff(true);
        assertTrue(kettle.isOn());
    }

    @Test
    public void testGetCapacity() throws Exception{
        assertEquals(1500, kettle.getCapacity(), .0);
    }

    @Test
    public void testIsFull() throws Exception{
        //testing empty kettle
        kettle.insertWater(200);
        System.out.println("Current volume: " + kettle.getCurrentVolume());
        System.out.println("Is kettle full:"+kettle.isFull()+"\n");
        assertFalse(kettle.isFull());

        //testing full kettle
        kettle.insertWater(1300);
        System.out.println("Current volume: "+kettle.getCurrentVolume());
        System.out.println("Is kettle full:"+kettle.isFull());
        assertTrue(kettle.isFull());
    }

}
