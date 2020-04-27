package icu.mianshi.main;

public class SynchronizedDemo implements ISynchronizible {

    @AnnotationFieldDouble
    private long lvalue1 = 19840428l;
    private final static double dvalue1 = 19840428.0d;
    private long minlvalue1 = 1l;
    private double mindvalue1 = 2.0d;

    @AnnotationMethod
     public synchronized void f () {// This is a synchronized method

         System.out.println ("Hello world" + lvalue1 + "," + minlvalue1);

     }

     public void g () {

         synchronized (this) {// This is a synchronized code block

             System.out.println ("Hello world" + dvalue1 +"," + mindvalue1);

         }

     }

     public static void main (String [] args) {

     }

    @Override
    public boolean isSyncing() {
        return true;
    }
}