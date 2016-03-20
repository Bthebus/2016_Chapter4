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
public class PersonalInformationTest extends TestCase {
    private PersonalInformation info;

    @Before
    public void setUp(){
        info = new PersonalInformation("Braedy", "Thebus", 10, 12, 1992, "01234567891012");
    }

    @After
    public void tearDown()
    {
        info = null;
    }

    @Test
    public void testGetPerson_NAME()
    {
        assertEquals("Braedy", info.getPerson().getNAME());
    }

    @Test
    public void testGetPerson_SURNAME()
    {
        assertEquals("Thebus", info.getPerson().getSURNAME());
    }
    @Test
    public void testGetDob_DAY()
    {
        assertEquals(10, info.getDob().getDAY());
    }

    @Test
    public void testGetDob_MONTH()
    {
        assertEquals(12, info.getDob().getMONTH());
    }

    @Test
    public void testGetDob_YEAR()
    {
        assertEquals(1992, info.getDob().getYEAR());
    }

    @Test
    public void testgetID()
    {
        assertEquals("01234567891012", info.getID());
    }

}
