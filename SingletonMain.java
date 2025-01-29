package com;

class Singleton {
        // Private static variable to hold the single instance of the class
        private static Singleton instance;
    
        // Private constructor to prevent instantiation from other classes
        private Singleton() {
            // Initialization code here
        }
    
        // Public static method to provide access to the single instance
        public static Singleton getInstance() {
            if (instance == null) {
                // Create the instance if it doesn't exist
                instance = new Singleton();
            }
            return instance;
        }
    
        // Other methods of the class
        public void showMessage() {
            System.out.println("Hello this Singleton!");
        }
    }
    
    public class SingletonMain {
        public static void main(String[] args) {
            // Get the single instance of the Singleton class
            Singleton singleton = Singleton.getInstance();
    
            // Call a method on the Singleton instance
            singleton.showMessage();
        }
    }

