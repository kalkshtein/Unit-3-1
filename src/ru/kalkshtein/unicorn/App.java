package ru.kalkshtein.unicorn;


import ru.kalkshtein.unicorn.bruno.colllections.BrunoQueue;

public class App {
    public static void main(String[] args) {
        BrunoQueue<String> myQueue = new BrunoQueue<String>();

        myQueue.add("Billy");
        myQueue.add("Villy");
        myQueue.add("Dilly");
        myQueue.add("Button");

        for (String str : myQueue){
            System.out.println(str);
        }
    }
}

