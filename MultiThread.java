class DemoThread implements Runnable
{
    public static void main(String[] args) 
      {
        Thread DemoThread1 = new Thread("First");
        Thread DemoThread2 = new Thread("Second");
        DemoThread1.start();
        DemoThread2.start();
        System.out.println("Thread names are following:");
        System.out.println(DemoThread1.getName());
        System.out.println(DemoThread2.getName());
    }
    @Override
    public void run() 
     {
     }

}