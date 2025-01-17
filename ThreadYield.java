public class ThreadYield extends Thread
{
    @Override
    public void run() {
        try{
            for(int i=0;i<5;i++)
            {
                System.out.println(Thread.currentThread().getName()+" is running");
                Thread.yield();
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        ThreadYield t1 = new ThreadYield();
        ThreadYield t2 = new ThreadYield();
        t1.start();
        t2.start();
    }
}
