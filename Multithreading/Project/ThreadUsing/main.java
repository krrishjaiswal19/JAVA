class MyRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Runnable Thread: " + i);
        }
    }
}

public class main {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable());
        t.start();

        System.out.println("Main Thread running...");
    }
}