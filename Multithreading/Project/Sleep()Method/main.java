class SleepDemo extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Count: " + i);
            try {
                Thread.sleep(1000); // 1 second pause
            } catch (InterruptedException e) {
                System.out.println("Interrupted!");
            }
        }
    }
}

public class main {
    public static void main(String[] args) {
        SleepDemo t = new SleepDemo();
        t.start();
    }
}