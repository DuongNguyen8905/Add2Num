package com.example;

public class main {

    public static void main(String[] args) {

        MyBigNumber myBigNumber = new MyBigNumber();

        String result = myBigNumber.sum(
                "999999999999999999",
                "1"
        );

        System.out.println(result);
    }
}