package za.ac.cput.composition;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Author       : Braedy Thebus
 * Email        : Bthebus2@gmail.com
 * Date Created : 20/03/2016
 */
public class DateTest extends TestCase {

    private Date dob;

    @Before
    public void setUp()
    {
        dob = new Date(10, 12, 1992);
    }

    @After
    public void tearDown()
    {
        dob =null;
    }

    @Test
    public void testGetDAY() {
        assertEquals(10, dob.getDAY());
    }

    @Test
    public void testGetMONTH()
    {
        assertEquals(12, dob.getMONTH());
    }

    @Test
    public void testGetYEAR()
    {
        assertEquals(1992, dob.getYEAR());
    }
}
