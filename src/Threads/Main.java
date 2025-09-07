package Threads;

public class Main {
    public static void main(String[] args) {


        Runnable Thread1 = new Runnable() {
            public void run() {
                System.out.println("Thread1");
            }
        };
        new Thread(Thread1).start();

    }


}
