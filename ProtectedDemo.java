package dpack;

import bpack.B;
import cpack.C;

public class ProtectedDemo {
    public static void main(String[] args) {
        B bObj = new B();
        C cObj = new C();

        System.out.println("From Class B:");
        bObj.display();

        System.out.println("From Class C:");
        cObj.display();
    }
}

/*
Output:

From Class B:
Protected: 20
Public: 40
From Class C:
Public: 40
*/