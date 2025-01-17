public class DaemonThread extends Thread
{
    @Override
    public void run() {
        for (;;)
        {
            System.out.println("Hello");
        }
    }

    public static void main(String[] args) {
        DaemonThread t1 = new DaemonThread();
        t1.setDaemon(true);
        t1.start();
        System.out.println("Main Done");
    }
}
