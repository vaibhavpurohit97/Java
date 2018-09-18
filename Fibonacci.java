/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author A
 */
import java.util.*;

public class Fibonacci {
    public static void main(String args[]){
        int num1=0, num2=1, num3, count ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the count for series");
        count = sc.nextInt();
        System.out.println("The Fibonacci series is : ");
        System.out.println(num1);
        System.out.println(num2);
        for(int i=2 ; i<count; ++i)
        {
            num3 = num1 + num2;
            System.out.println(num3);
            num1 = num2 ;
            num2 = num3;
            
        }
        
    }
    
}
