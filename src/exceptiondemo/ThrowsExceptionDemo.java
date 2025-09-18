package exceptiondemo;

import java.io.IOException;

public class ThrowsExceptionDemo {
    // yashu
    void printing() // no exception
    {
        System.out.println("Printing java");
    }

    // avyuu
    void scanning() throws IOException
    {
        System.out.println("Device error");
    }

    // keerthana
    void verification() throws ArithmeticException, IOException, ClassNotFoundException
    {
        System.out.println("technical error");
    }

    public static void main(String[] args) {
        ThrowsExceptionDemo obj = new ThrowsExceptionDemo();

        obj.printing();
        try {
            obj.scanning();
        } catch (IOException e) {
            System.out.println(e);
        }

        try {
            obj.verification();
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
    }
}
