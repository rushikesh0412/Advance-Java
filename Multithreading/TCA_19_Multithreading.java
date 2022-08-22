public class TCA_19_Multithreading {
    public static void main(String args[])
    {
        Thread t = Thread.currentThread();

        System.out.println(t);

        t.setPriority(10);
        t.setName("RUSHI");

        System.out.println(t.isAlive());
        System.out.println(t.getName());
        System.out.println(t.getPriority());
        System.out.println(t.getThreadGroup());

        //Thread priority range between 1 to 10
        System.out.println(Thread.MIN_PRIORITY);
        System.out.println(Thread.MAX_PRIORITY);
        System.out.println(Thread.NORM_PRIORITY);


        ///Daemon Thread:           --> Low priority it mainly use for garbage collector System.gc();
    }
}
