package com.calculator;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Calculate obj = new Calculate();

        long sum = obj.multiplication("8895456465444894494,/n");
        System.out.print(sum);
    }
}
