package com.bridgelabz;

/*
 *  This program is printing even position elements of an array
 *  @author : Sadanand Pandey
 */
public class EvenPosition_Array {  
    public static void main(String[] args) {  
  
        int [] arr = new int [] {1, 2, 3, 4, 5, 8,10, 12};  
        System.out.println("Elements of given array present on even position : ");    
        for (int i = 1; i < arr.length; i = i+2) {  
            System.out.println(arr[i]);  
        }  
    }  
} 