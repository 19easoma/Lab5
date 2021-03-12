/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author antho
 */
public class Problem2 {
    public static void main(String[] args) {
        //this array is for testing purposes
        int[] testArray = {1,2,3,4,5,6,7,8,9,10};
        
        getTotal(testArray); 
        getAverage(testArray); 
        getHighest(testArray); 
        getLowest(testArray); 
    }    
    
    public static int getTotal(int[] array){
        int total = 0;
        
        for (int i=0; i<array.length; i++) {
            total += array[i];
        }
        System.out.println("The total sum of all numbers is: " + total);
        return total;
    }
    
    public static double getAverage(int[] array){
        double average;
        double sum = 0;
                
        for (int i=0; i<array.length; i++) {
            sum += array[i];
        }
        
        average = sum/array.length;
        System.out.println("The average of all numbers is: " + average);
        return average;
    }
    
    public static int getHighest(int[] array){
        int high = 0;
        
        for (int i=0; i<array.length; i++) {
            if (array[i] > high){
                high = array[i];
            }
        }
        
        System.out.println("The highest of all numbers is: " + high);
        return high;
    }
    
    public static int getLowest(int[] array){
        int low = array[1];
        
        for (int i=0; i<array.length; i++) {
            if (array[i] < low){
                low = array[i];
            }
        }
        
        System.out.println("The lowest of all numbers is: " + low);
        return low;
    }
}
