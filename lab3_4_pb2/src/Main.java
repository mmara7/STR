public class Main {
    public static void main(String[] args) {

        Integer monitor1 = Integer.valueOf(1);
        Integer monitor2 = Integer.valueOf(1);


        new ExecutionThread(monitor1, 0,2, 4, 0, 0).start();
        new ExecutionThread(monitor1, monitor2,3, 5, 0, 0).start();
        new ExecutionThread(0, monitor2,2, 5, 0, 0).start();
}
}