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
/**
 * Author       : Braedy Thebus
 * Email        : Bthebus2@gmail.com
 * Date Created : 20/03/2016
 */
public class RectangleTest extends TestCase{

    private GeometricShape rectangle;

    @Before
    public void setUp()
    {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        rectangle = (Circle)ctx.getBean("rectangle");
    }

    @After
    public void tearDown()
    {
        rectangle = null;
    }

    @Test
    public void testGetName()
    {
        assertEquals("Rectangle", rectangle.getName());
    }

    @Test
    public void testGetArea()
    {
        assertEquals(35, rectangle.getArea(),.0);
    }

    @Test
    public void testGetPerimeter()
    {
        assertEquals(12, rectangle.getPerimeter(),.0);
    }
}
