package com.company;

import java.util.Queue;

public interface IFunWithQueue<T> {
    void initializeQueue(T[] anything);
    void iterateQueue(Queue<T> numbers);
}

