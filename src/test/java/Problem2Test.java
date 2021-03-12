/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author antho
 */
public class Problem2Test {
    
    public Problem2Test() {
    }

    @Test
    public void testGetTotal() {
        System.out.println("getTotal");
        //Here's a little easter egg, courtesy of Fibonacci
        int[] array = {1,2,3,5,8,13,21,34,55,89};
        int expResult = 231;
        int result = Problem2.getTotal(array);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetAverage() {
        System.out.println("getAverage");
        int[] array = {1,2,3,5,8,13,21,34,55,89};
        double expResult = 23.1;
        double result = Problem2.getAverage(array);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testGetHighest() {
        System.out.println("getHighest");
        int[] array = {1,2,3,5,8,13,21,34,55,89};
        int expResult = 89;
        int result = Problem2.getHighest(array);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetLowest() {
        System.out.println("getLowest");
        int[] array = {1,2,3,5,8,13,21,34,55,89};
        int expResult = 1;
        int result = Problem2.getLowest(array);
        assertEquals(expResult, result);
    }
    
}
