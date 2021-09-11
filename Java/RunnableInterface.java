public class RunnableInterface implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread has ended");
    }

    public static void main(String[] args) {
        RunnableInterface ex = new RunnableInterface();
        Thread t1= new Thread(ex);
        System.out.println("Hi");
        t1.start();
    }
}