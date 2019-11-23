package ru.kalkshtein.unicorn;

public class BrunoQueue {

    int[] storage = new int[10];

    int lastIndex = -1;

    public void add(int value) {
        for (int i = lastIndex; i >= 0; i--) {
            storage[i + 1] = storage[i];

        }
        lastIndex++;
        storage[0] = value;

    }

    public int get() {
        if (lastIndex >= 0) {
            int result = storage[lastIndex];
            lastIndex--;
            return result;
        } else {
            return 0;
        }


    }
}

