package main;

import databean.Book;
import implementation.MyQueue;

import java.util.Arrays;

public class MyMain{
    public static void main(String[] args) {
        /*Book[] arr = new Book[5];
        MyQueue<Book> queue = new MyQueue<>(arr);
        Book b1 = new Book("Java", 200);
        Book b2 = new Book("C++", 150);
        queue.enqueue(b1);
        queue.enqueue(b2);
        System.out.println(queue.dequeue());*/
        Integer[] integers = new Integer[5];
        MyQueue<Integer> myQueue = new MyQueue<>(integers);
        myQueue.enqueue(10);
        myQueue.enqueue(20);
        myQueue.enqueue(30);
        myQueue.traverse();
        Integer deleted = myQueue.dequeue();
        if(deleted != null)
            System.out.println("deleted element = " + deleted);
        else
            System.out.println("queue underflow");
        deleted = myQueue.dequeue();
        if(deleted != null)
            System.out.println("deleted element = " + deleted);
        else
            System.out.println("queue underflow");
        myQueue.enqueue(100);
        myQueue.enqueue(200);
        myQueue.enqueue(300);
        myQueue.enqueue(400);
        myQueue.enqueue(500);
        myQueue.traverse();

    }
}

