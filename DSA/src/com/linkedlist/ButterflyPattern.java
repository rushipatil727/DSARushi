package com.linkedlist;

public class ButterflyPattern {  
    public static void main(String[] args) {  
        int n = 4; // number of rows  
        // upper half of the pattern  
        for (int i = 1; i <= n; i++) {  
            for (int j = 1; j <= i; j++) {  
                System.out.print("*");  
                
            }  
            for (int k = 2 * (n - i); k >= 1; k--) {  
                System.out.print(" ");  
            }  
            for (int j = 1; j <= i; j++) {  
                System.out.print("*");  
            }  
            System.out.println();  
            System.out.println();  
        }  
        // lower half of the pattern  
        for (int i = n-1; i >= 1; i--) {  
            for (int j = 1; j <= i; j++) {  
                System.out.print("*");  
            }  
            for (int k = 2 * (n - i); k >= 1; k--) {  
                System.out.print(" ");  
            }  
            for (int j = 1; j <= i; j++) {  
                System.out.print("*");  
            }  
            System.out.println();  
            System.out.println();  
        }  
    }  
}  

