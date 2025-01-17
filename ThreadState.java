public class ThreadState extends Thread {
    @Override
    public void run() {
        System.out.println("Running");
        try {
            sleep(2000); // Sleep for 2 seconds
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println(Thread.currentThread().getName()); // Main thread name

        ThreadState t1 = new ThreadState();
        System.out.println(t1.getState()); // NEW (Thread not started yet)

        t1.start(); // Start the thread
        System.out.println(t1.getState()); // RUNNABLE (Thread is active and ready to run)

        Thread.sleep(100); // Allow some time for the thread to transition
        System.out.println(t1.getState()); // TIMED_WAITING (Thread sleeping inside `run`)

        t1.join(); // Wait for the thread `t1` to complete
        System.out.println(t1.getState()); // TERMINATED (Thread finished execution)
    }
}
