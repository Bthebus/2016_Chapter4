package za.ac.cput.InterfaceSegregationPrinciple.bad;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.InterfaceSegregationPrinciple.appConfig.AppConfig;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-03-25
 */
public class CellphoneTest extends TestCase {

    private ApplicationContext ctx;
    private Cellphone cell;

    @Before
    public void setUp() throws Exception
    {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        cell = (Cellphone)ctx.getBean("cell1");
    }

    @After
    public void tearDown() throws Exception
    {
        ctx =null;
        cell = null;
    }

    @Test
    public void testMakeCall() throws Exception{
        assertEquals("Dialling number ...", cell.makeCall());
    }

    @Test
    public void testReceiveCall() throws Exception{
        assertEquals("Incoming call ...", cell.receiveCall());
    }

    @Test
    public void testSendText() throws Exception
    {
        assertEquals("SMS sent ...", cell.sendText());
    }

    @Test
    public void testReceiveText() throws Exception {
        assertEquals("SMS received ...", cell.receiveText());
    }
}
