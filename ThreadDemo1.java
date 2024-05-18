class Demo extends Thread
{
    public void run()
    {
        int i = 0;
        for(i = 0;i<=20;i++)
        {
            try
            {
                System.out.println(Thread.currentThread().getName()+"."+i);
                Thread.sleep(500);
            }
            catch(InterruptedException e)
            {

            }
        }
    }
}

public class ThreadDemo1 {
    public static void main(String[] args) throws InterruptedException
    {
        System.out.println("Inside Main Thread");

        Demo dobj1 = new Demo();
        Demo dobj2 = new Demo();

        Thread t1 = new Thread(dobj1);
        Thread t2 = new Thread(dobj2);

        t1.setName("First");
        t2.setName("Second");

        t1.start();
        t2.start();
        
        t1.join();
        t2.join();

        System.out.println("End Of Main");


    }
}
