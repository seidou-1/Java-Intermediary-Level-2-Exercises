/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s03unittests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author laptop
 */
public class SayHiTest {
    
    //Put a member field for the Say Hi class so we can call one of the methods
        
    private SayHi sayHi = new SayHi();//Create a reference called "sayHi" to the SayHi() method.
    
    public SayHiTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of sayHi method, of class SayHi.
     */
    @Test
    public void testBob() {
      String expectedResult = "Hello Bob!";
      /*
      assertEquals will take two parmaters (the expected result, and what actually came back)
      */
      assertEquals(expectedResult, sayHi.sayHi("Bob"));
    }
    
    @Test
    public void testAlice(){
        String expectedResult = "Hello Alice!";
        assertEquals(expectedResult, sayHi.sayHi("Alice"));
    }
    
    @Test
    public void testX(){
        String expectedResult = "Hello X!";
        assertEquals(expectedResult, sayHi.sayHi("X"));
    }
    
}
