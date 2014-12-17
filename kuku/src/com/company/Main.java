package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public int doJob(int a) {
        if (a == 21) {
            throw new IllegalArgumentException();
        }
        return a * 2;
    }
}
