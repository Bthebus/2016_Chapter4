package za.ac.cput.geometricshape.ShapeImplementation.ShapeImplementationTest;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.geometricshape.AppConfig.AppConfig;
import za.ac.cput.geometricshape.GeometricShape;
import za.ac.cput.geometricshape.ShapeImplementation.Circle;
import za.ac.cput.geometricshape.ShapeImplementation.Square;

/**
 * Author       : Braedy Thebus
 * Email        : Bthebus2@gmail.com
 * Date Created : 20/03/2016
 */
public class SquareTest extends TestCase{

    private GeometricShape square;

    @Before
    public void setUp()
    {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        square = (Square)ctx.getBean("square");
    }

    @After
    public void tearDown()
    {
        square = null;
    }

    @Test
    public void testGetName()
    {
        assertEquals("Square", square.getName());
    }

    @Test
    public void testGetArea()
    {
        assertEquals(25, square.getArea(),.0);
    }

    @Test
    public void testGetPerimeter()
    {
        assertEquals(10, square.getPerimeter(),.0);
    }
}
