package com.fss;

public class Singleton {
    private static Singleton instance = null;
 
    private Singleton() {
    }
 
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
            System.out.println("Object is initialised");
            return instance;
        }
        return instance;
    }
}
 

