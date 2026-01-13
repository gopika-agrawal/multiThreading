package multiThreading;

public class Test{
    public static void main(String[] args){
        // System.out.println("Hello World!!");

        // // to know which thread is running currently... 
        // System.out.println(Thread.currentThread().getName());

        // the case when we extend Thread class... 
        // World world = new World();   // RUN
        // world.start();   // RUNNABLE


        // the case when we implement Runnable interface... 
        World world = new World();
        Thread t1 = new Thread(world);
        t1.start();

        for(int i=0;i<10000;i++){
            System.out.println("Hello");
        }
    }
}

// A new class World is created that extends Thread.
// The run method is overridden to define the code that constitutes the new thread.
// start method is called to intiate the new thread.


// A new class World is created that implements Runnable.
// The run method is overridden to define the code that constitutes the new thread.
// A Thread object is created by passing an instance of MyRunnable.
// start method is called on the Thread object to initiate the new Thread.