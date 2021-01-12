public class ExtendingThreadClass extends Thread{
    @Override
    public void run(){
        System.out.println("Thread Ended");
    }

    public static void main(String args[]){
        ExtendingThreadClass nr = new ExtendingThreadClass();
        nr.start();
        System.out.println("Thread started");
    }
}

