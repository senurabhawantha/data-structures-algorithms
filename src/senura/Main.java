package senura;

import senura.threading.Thread;

public class Main {
    public static void main(String[] args) {
        //ExceptionsDemo.show();

//        for (int i = 0; i <= 3; i++) {
//            Multithreading multithreading = new Multithreading(i);
//            Thread myThread = new Thread(multithreading);
//            myThread.start();
//        }
//        throw new RuntimeException();

        Thread a = new Thread("*");
        Thread b = new Thread("-");
        Thread c = new Thread("+");

        a.start();  //
        b.start();  //
        c.start();

    }
}