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
import java.util.* ;

public class BubbleSort {
    static void print(int[] arr)
    {
        for(int i = 0 ; i < arr.length; ++i)
        {
         System.out.println(arr[i]);
        }
    }
    static void BSort(int[] arr)
    {
        int n = arr.length;
        int temp = 0;
        for(int i = 0; i < n ; i++)
        {
            for(int j = 1 ; j < (n-i); j++)
            {
                if(arr[j-1] > arr[j])
                {
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp ;
                    
                }
            }
        }
    }
    public static void main(String args[] )
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array to be sorted");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Now enter values");
        for(int i = 0 ; i < size ; ++i)
        {
            arr[i] = sc.nextInt();
        }
        BSort(arr);
        System.out.println("The sorted array is");
        System.out.println("");
        print(arr);
    }
}
