package senura;

import senura.threading.Runnable;
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

//        Thread a = new Thread("*");
//        Thread b = new Thread("-");
//        Thread c = new Thread("+");
//
//        a.start();  //
//        b.start();  //
//        c.start();  //

//        Runnable a = new Runnable("*");
//        Runnable b = new Runnable("-");
//        Runnable c = new Runnable("=");
        Thread ta = new Thread("*");
        Thread tb = new Thread("=");
        Thread tc = new Thread("-");
        ta.start();
        tb.start();
        tc.start();

    }
}