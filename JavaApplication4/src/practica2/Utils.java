/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

import java.util.Random;

/**
 * Class with some useful and general methods
 * @author Andrea Merici
 */
public class Utils {
    
    // Matrix for the random numbers
    static int [][] numbers = new int[10][10];
    static Random rand = new Random();
    
    /**
     * Get the string which represents the matrix
     * @param array
     * @return the string which represents the matrix
     */
    public static String getMatrix(int[][] array){
        String matrix = "";
        
        for(int i = 0; i < array.length; i++){
            
            for(int j = 0; j < array[i].length; j++){
                
                if(array[i][j] != -5){
                    matrix += "   " + array[i][j];
                }else{
                    matrix += "  " + " - ";
                }
            }
            matrix += "\n";
        }
        
        return matrix;
    }
    
    /**
     * Get the string which represents the modified matrix
     * @param value: each number of the matrix that is smaller than this value must be replaced with '-'
     * @return the string which represents the matrix
     */
    public static String getModifiedMatrix(int value){
   
        int [][] temp = new int[10][10];
        
        for(int i = 0; i < numbers.length; i++){
            
            for(int j = 0; j < numbers[i].length; j++){
                
                if(numbers[i][j] <= value){
                    temp[i][j] = -5;
                }else{
                    temp[i][j] = numbers[i][j];
                }
            }

        }
        
        return getMatrix(temp);
    }

    /**
     * Get the string which represents the matrix that contains numbers between min and max values
     * @param min
     * @param max
     * @return the string which represents the matrix
     */
    public static String getOriginalMatrix(int min, int max){
        
        for(int i = 0; i < numbers.length; i++){
            
            for(int j = 0; j < numbers[i].length; j++){
                numbers[i][j] = rand.nextInt((max - min) + 1) + min;
            }
        }
        
        return getMatrix(numbers);
    }
    
    /**
     * Check the validity of the parameters
     * @param min
     * @param max
     * @return true if the condition is verified
     */
    public static boolean checkValidity(int min, int max){
        return min < max;
    }
    
}
