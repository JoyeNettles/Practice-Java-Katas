package com.thoughtworks.kata;

public class LambdaPractice {

    public static void main(String[] args) {
        basicRunnable();
    }

    private static void basicRunnable() {
        System.out.println("=== RunnableTest ===");

        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous Inner Class version");
            }
        };
        r1.run();

        Runnable r2 = () -> System.out.println("Lambda!");

        r2.run();
    }

}
