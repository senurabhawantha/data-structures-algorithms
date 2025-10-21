package senura;

import senura.exceptions.ExceptionsDemo;
import senura.threading.Multithreading;

public class Main {
    public static void main(String[] args) {
        //ExceptionsDemo.show();

        for (int i = 0; i <= 3; i++) {
            Multithreading multithreading = new Multithreading(i);
            Thread myThread = new Thread(multithreading);
            myThread.start();
        }
//        throw new RuntimeException();

    }
}