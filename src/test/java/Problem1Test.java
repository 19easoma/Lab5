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
public class Problem1Test {
    
    public Problem1Test() {
    }

    @Test
    public void testCompareArrayToN() {
        System.out.println("CompareArrayToN");
        int[] array = {5,6,7,8,9,10,11,12,13,14};
        int n = 11;
        int expResult = 3;
        int result = Problem1.CompareArrayToN(array, n);
        assertEquals(expResult, result);
    }
}
