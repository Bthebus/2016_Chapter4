package za.ac.cput.OpenCLosedPrinciple.good.impl;

import junit.framework.TestCase;
import org.junit.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.OpenCLosedPrinciple.appConfig.AppConfig;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-03-22
 */
public class TestCasualFormality extends TestCase {

    private ApplicationContext ctx;
    private CasualFormality casual;

    @Before
    public void setUp() throws Exception {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        casual = (CasualFormality) ctx.getBean("casualFormality");
    }

    @After
    public void tearDown() throws Exception {
        ctx = null;
        casual = null;
    }

    @Test
    public void testIntimate() throws Exception {
        assertEquals("Howsit going bru?", casual.greet());
    }
}
