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

public class FibonacciRecursion {
    static int num1=0, num2=1, num3=0;
    static void print(int count)
    {
        if (count > 0)
        {
            num3 = num1 + num2 ;
            num1 = num2 ;
            num2 = num3 ;
            System.out.println(num3);
            print(count-1);
        }
    }
    public static void main(String args[])
    {
        int count ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the count for the series");
        count = sc.nextInt();
        System.out.println("The series is");
        System.out.println(num1);
        System.out.println(num2);
        print(count-2);
        
    }
}
