package com.fss;

public class Singleton1 {
    public static void main(String[] args) {
        Singleton inst = Singleton.getInstance();
        System.out.println(inst);
        Singleton inst1 = Singleton.getInstance();
        System.out.println(inst1);
    }
}
