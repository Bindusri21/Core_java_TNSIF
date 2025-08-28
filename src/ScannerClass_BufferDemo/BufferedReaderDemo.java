package ScannerClass_BufferDemo;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class BufferedReaderDemo {

    public static void main(String[] args) {
        // Use try-with-resources to auto-close the BufferedReader
        try (BufferedReader br = new BufferedReader(
                new FileReader("C:\\Users\\bindusri\\OneDrive\\Desktop\\Java training Notes\\demo.txt"))) {

            String data;
            while ((data = br.readLine()) != null) {
                System.out.println(data);
            }

        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
