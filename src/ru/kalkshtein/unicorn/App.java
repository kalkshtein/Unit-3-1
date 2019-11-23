package ru.kalkshtein.unicorn;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class App {
    public static void main(String[] args) {
        BrunoQueue myQueue = new BrunoQueue();
        myQueue.add(1);
        myQueue.add(2);
        myQueue.add(3);

        System.out.println(myQueue.get());
        System.out.println(myQueue.get());
        System.out.println(myQueue.get());
        System.out.println(myQueue.get());
        System.out.println(myQueue.get());

    }

}
