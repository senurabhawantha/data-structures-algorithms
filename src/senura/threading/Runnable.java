package senura.threading;

public class Runnable implements java.lang.Runnable {
    String name;
    public Runnable(String name) {
        this.name = name;
    }
    public void run() {
        for (int i=1; i<100 ; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie) { }
            System.out.print(name);
        } }
}
