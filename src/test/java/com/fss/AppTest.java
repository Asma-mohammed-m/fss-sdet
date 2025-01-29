package com.fss;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testSum()
    {
       App app = new App();
       int excepted =10;
       int actual = app.sum(5,5);

       assertEquals(excepted,actual);
       assertTrue(2<5);
       assertFalse(2>5);


    }
}
