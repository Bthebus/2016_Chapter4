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
public class PersonTest extends TestCase {

    private Person person;

    @Before
    public void setUp()
    {
        person =  new Person("Braedy", "Thebus");
    }

    @After
    public void tearDown()
    {
        person = null;
    }

    @Test
    public void testGetNAME()
    {
        assertEquals("Braedy", person.getNAME());
    }

    @Test
    public void testGetSURNAME()
    {
        assertEquals("Thebus", person.getSURNAME());
    }

}
