public class ThreadPriority extends Thread
{
    ThreadPriority(String name)
    {
        super(name);
    }

    public void run()
    {
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<1000000;j++)
            {

            }
            System.out.println(ThreadState.currentThread().getName()+" priority:"+Thread.currentThread().getPriority()+" count "+i);
        }
        try{
            Thread.sleep(100);
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }

    }


    public static void main(String[] args)
    {
        ThreadPriority t1 = new ThreadPriority("normalPriority");
        ThreadPriority t2 = new ThreadPriority("lowPriority");
        t2.setPriority(Thread.MIN_PRIORITY);

        ThreadPriority t3 = new ThreadPriority("highPriority");
        t3.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}
