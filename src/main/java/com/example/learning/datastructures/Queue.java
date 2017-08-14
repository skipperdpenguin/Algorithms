package com.example.learning.datastructures;

public interface Queue<E> {

    void enqueue(E element);
    E dequeue();
    E peek();

}
