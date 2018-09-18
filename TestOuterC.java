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
public class TestOuterC {
            private int data=30;  
            class Inner{  
            void msg(){System.out.println("data is "+data);}  
            }  
        public static void main(String args[]){  
            TestOuterC obj=new TestOuterC();  
            TestOuterC.Inner in=obj.new Inner();  
            in.msg();  
          
        }  
    }
