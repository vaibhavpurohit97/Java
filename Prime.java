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

public class Prime {
    public static void main(String args[])
    {
        int num, temp, flag=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be checked");
        num = sc.nextInt();
        temp = num/2;
        if (num == 0 || num == 1)
        {
            System.out.println(num + " is not a prime number");
        }
        else
        {
            for(int i = 2; i <= temp ; i++)
            {
                if(num % i == 0)
                {
                    System.out.println(num + " is not a prime number");
                    flag = 1 ;
                    break;
                }
            }
            if(flag == 0)
            {
                System.out.println(num + " is a prime number ");
                
            }
        }
    }
}
