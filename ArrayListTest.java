/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructurestest;

/**
 *
 * @author A
 */
import java.util.* ;

public class ArrayListTest {
    public static void main(String args[]){
        Student s1=new Student(101,"Sonoo",23);  
        Student s2=new Student(102,"Ravi",21);  
        Student s3=new Student(103,"Hanumat",25); 
        
        ArrayList<Student> AL = new ArrayList<Student>();
        AL.add(s1);
        AL.add(s2);
        AL.add(s3);
        
        Iterator itr = AL.iterator();
        
        while(itr.hasNext()){
            Student St = (Student)itr.next();
            System.out.println(St.rollno + " " + St.name + " " + St.age);
        }
    }
}
class Student{  
        int rollno;  
        String name;  
        int age;  
        Student(int rollno,String name,int age){  
        this.rollno=rollno;  
        this.name=name;  
        this.age=age;  
        }  
    } 