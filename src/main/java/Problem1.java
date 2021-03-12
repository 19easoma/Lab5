/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author antho
 */
public class Problem1 {
    public static void main(String[] args) {
        //this array is for testing purposes
        int[] testArray = {1,2,3,4,5,6,7,8,9,10};
        int n = 5;
        CompareArrayToN(testArray, n); 
    }    
    
    public static int CompareArrayToN(int[] array, int n){
        int count = 0;
        
        for (int i=0; i<array.length; i++) {
            if (array[i]>n)
                count++;
        }
        System.out.println("There were " + count + " numbers greater than n");
        return count;
    }
}
