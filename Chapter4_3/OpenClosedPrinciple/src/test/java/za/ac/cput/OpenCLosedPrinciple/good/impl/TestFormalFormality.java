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
public class TestFormalFormality extends TestCase {

    private ApplicationContext ctx;
    private FormalFormality formal;

    @Before
    public void setUp() throws Exception {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        formal = (FormalFormality) ctx.getBean("formalFormality");
    }

    @After
    public void tearDown() throws Exception {
        ctx = null;
        formal = null;
    }

    @Test
    public void testIntimate() throws Exception {
        assertEquals("Good Evening good sir!", formal.greet());
    }
}