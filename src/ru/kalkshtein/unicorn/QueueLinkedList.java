package ru.kalkshtein.unicorn;

import java.util.LinkedList;

public class QueueLinkedList{
    private int value;
    private QueueLinkedList prevValue;
    private QueueLinkedList nextValue;


    public QueueLinkedList(int value) {
        this.value = value;
    }

    public QueueLinkedList(int value, QueueLinkedList prevValue) {
        this.value = value;
        this.prevValue = prevValue;
    }


    public int getValue() {
        return value;
    }

    public QueueLinkedList getPrevValue() {
        return prevValue;
    }
}
