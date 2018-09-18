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
import java.util.*;

public class LinkedListTest {
    public static void main(String args[]){
     LinkedList<Book> L = new LinkedList<Book>();
     
     Book b1 = new Book(321,"Harry Potter", "JK Rowling",5);
     Book b2 = new Book(645,"Oliver Twist", "Mark Twain",7);
     Book b3 = new Book(235,"Narnia", "Rhonda Fiel",12);
     Book b4 = new Book(279,"Swastik", "Bhushan",8);
     
     L.add(b1);
     L.addFirst(b2);
     L.add(b4);
     L.addLast(b3);
    
     
     for(Book b : L){
     System.out.println(b.id + " " + b.name + " " + b.author + " " + b.quantity);
     }
     
    }
}
class Book{
    int id ;
    String name, author;
    int quantity ;
    public Book(int id, String name, String author, int quantity){
        this.id = id ;
        this.author = author;
        this.name = name;
        this.quantity = quantity;
    }
}
