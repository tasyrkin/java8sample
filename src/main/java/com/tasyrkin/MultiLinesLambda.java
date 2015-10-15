package com.tasyrkin;

import java.util.Random;

public class MultiLinesLambda {
    public static void main(String[] args) {
        new Thread(() -> {
            long start = System.currentTimeMillis();
            try {
                Thread.sleep(new Random().nextInt(1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            long finish = System.currentTimeMillis();
            System.out.println(String.format("The thread slept %s ms", (finish - start)));
        }).run();
    }
}
