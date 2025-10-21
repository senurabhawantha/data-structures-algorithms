package senura.threading;

public class Thread extends java.lang.Thread {

    String name;
    public Thread(String name) {
        this.name = name;
    }
    public void run() {
        for (int i=1; i<100 ; i++) {
            try {
                sleep(1000);
            } catch (InterruptedException ie) { }
            System.out.print(name);
        } }


}
