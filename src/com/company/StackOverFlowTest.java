package com.company;

public class StackOverFlowTest {
    public static void main(String[] args) {

        test();
    }

    private static int count;

    public static void test() {
        try {
            count++;
            test();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
