package kunal;

/**
 * Created by kunal on 22-07-2017.
 */
public class Main {
    public static void main(String args[])
    {
        System.out.println("Waiting for the client to be connected.");
        Thread1 thread1=new Thread1();
        Thread2 thread2=new Thread2();
        thread1.start();
        thread2.start();
    }
}
