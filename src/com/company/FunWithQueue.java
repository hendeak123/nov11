package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.*;

public class FunWithQueue<T> implements IFunWithQueue<T> {
    @Override
    public void initializeQueue(T[] anything) {
        System.out.println(anything);
        Queue<T> queue = new LinkedList<>();
        for(int i = 0; i < anything.length; i++){
            queue.offer(anything[i]);
        }
        iterateQueue(queue);
    }

    @Override
    public void iterateQueue(Queue<T> numbers) {
        Iterator iterator = numbers.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
