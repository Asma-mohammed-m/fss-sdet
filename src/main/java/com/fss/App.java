package com.fss;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class App {

    public static void main(String[] arg) {

        File f = new File("names1.txt");
        try {

            // f.deleteOnExit();

            Scanner sc = new Scanner(f);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());

            }
            sc.close();
        } catch (IOException e) {
            System.out.println("File not found");
        }
        try (FileWriter writer = new FileWriter(f)) {
            String text = "Hi Aravindan cool";

            writer.write(text);
            System.out.println("Text written to the file successfully.");
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file: " + e.getMessage());
        }

    }
}
