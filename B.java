package bpack;

import apack.A;

public class B extends A {
    public void display() {
        // System.out.println("Default: " + defaultVar); // Not accessible - different package
        System.out.println("Protected: " + protectedVar); // Accessible - subclass
        // System.out.println("Private: " + privateVar); // Not accessible - private
        System.out.println("Public: " + publicVar); // Accessible - public
    }
}