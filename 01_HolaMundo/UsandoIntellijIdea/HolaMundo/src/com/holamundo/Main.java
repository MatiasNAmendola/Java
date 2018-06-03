package com.holamundo;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        int a = 6;
        int b = 8;

        int c = 0;

        if (a > b) {
            c = a;
        } else {
            c = b;
        }

        c = a > b ? a : b;

        System.out.println(c);


    }
}
