package com.tasyrkin;

public class SingleLineLambda {
    public static void main(String[] args) {
        new Thread(
                () -> System.out.println("Hello from thread!")
        ).start();
    }
}
