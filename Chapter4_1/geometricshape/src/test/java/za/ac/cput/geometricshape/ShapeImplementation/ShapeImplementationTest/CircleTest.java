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
public class CircleTest extends TestCase {

    private GeometricShape circle;
    @Before
    public void setUp() throws Exception
    {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        circle = (Circle)ctx.getBean("circle");
    }
    @After
    public void tearDown()
    {
        circle = null;
    }

    @Test
    public void testGetName()
    {
        assertEquals("Circle", circle.getName());
    }

    @Test
    public void testGetArea() {
        assertEquals(78.5, circle.getArea());
    }

    @Test
    public void testGetPerimeter() {
        assertEquals(15.7, circle.getPerimeter(),.1);
    }
}
