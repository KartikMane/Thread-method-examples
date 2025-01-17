public class ThreadInterrrupt extends Thread
{
    public void run()
    {
        try{
            Thread.sleep(1000);
            System.out.println("Thread is running");
        }
        catch (InterruptedException e)
        {
            System.out.println("Execution is interrupted "+e);
        }
    }

    public static void main(String[] args)
    {
        ThreadInterrrupt t =new ThreadInterrrupt();
        t.start();
        t.interrupt();
    }
}
