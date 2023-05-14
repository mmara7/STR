package org.example;

public class Main {
    public static void main(String[] args) {

        Integer monitor1 = Integer.valueOf(1);
        new ExecutionThread(monitor1,3, 6, 0, 0,5).start();
        new ExecutionThread(monitor1,4, 7, 0, 0, 3).start();
        new ExecutionThread(monitor1,5, 7, 0, 0, 6).start();
        //Integer monitor2 = new Integer(1);

        //new ExecutionThread2(monitor1,monitor2,2, 4, 4, 6).start();
        //new ExecutionThread2(monitor1, monitor2,3, 5, 5, 7).start();
        /*
        new ExecutionThread(monitor1, 0,2, 4, 0, 0).start();
        new ExecutionThread(monitor1, monitor2,3, 5, 0, 0).start();
        new ExecutionThread(0, monitor2,2, 5, 0, 0).start();
        */

}
}