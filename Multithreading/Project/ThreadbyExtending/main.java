class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread-1: " + i);
        }
    }
}

public class main {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start(); // new thread

        for (int i = 1; i <= 5; i++) {
            System.out.println("Main Thread: " + i);
        }
    }
}