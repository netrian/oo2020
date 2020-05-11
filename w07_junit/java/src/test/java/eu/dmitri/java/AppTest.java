package eu.dmitri.java;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest{

    private static App app;
    private static String name;


    /**
     * Rigorous Test :-)
     */


    @BeforeClass
    public static void initiateApp(){
        name = "Dima";
        app = new App(name);
        
    }

    @Test
    public void appHasCorrectName(){
        assertTrue("App name is Dima", app.getName() == name);
    }

    @Test
    public void shouldAnswerWithTrue(){
        assertTrue( true );
    }

    @Test
    public void oneEqualsTwo(){
        assertEquals("checking if one equals two", 1, 2);
    }
}
