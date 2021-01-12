import java.util.Scanner;

class Robinimple{
    int front,rear;
    int max;
    int queue[];
    Robinimple(){
        Scanner sc = new Scanner(System.in);
        this.max = sc.nextInt();
        System.out.println("Enter the size of the queue");
        queue = new int[max];
        this.front=0;
        this.rear=0;
    }
    boolean isfull(){
        return (max-1)==front?true:false;
    }
    boolean isempty(){
        return (rear==0 && front==0)?true:false;
    }
    void Enqueue(int val){
        if(!isfull())
            queue[rear++]=val;
        else
            System.out.println("Queue overflowed");

    }

    int Dequeue() {
        if (!isempty()){
            int vl = queue[front];
            queue[front]=0;
            front++;
            return vl;
        }
        else{
            System.out.println("Queue underflowed");

            return -1;
        }

    }

    void display(){
        System.out.println();
        if(!isempty()){
            for(int i=0;i<max;i++){
                System.out.print(queue[i]+"->");
            }
            System.out.print("null");
        }
        else{
            System.out.print("queue underflowed");
        }

    }

}

public class RoundRobinQueue {

    public static void main(String args[]){
//        System.out.println("Enter the no.of process");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        String process[] = new String[n];
//        int bursttime[] = new int[n];
        Robinimple q= new Robinimple();

        int process[] = {1,2,3};
        int bursttime[] ={10,5,8};
        int quantum = 2;
        int val=0;
        int waitingtime=0;

        while(true){
            for(int i=0;i<bursttime.length;i++){
                if(bursttime[i]!=0) {
                    if(bursttime[i]>=quantum) {
                        waitingtime +=quantum;
                        bursttime[i] -= quantum;
                    }
                    else if(bursttime[i]<quantum){
                        waitingtime += bursttime[i];
                        bursttime[i]=0;
                    }
                    q.Enqueue(process[i]);
                }
                else{
                    ++val;
                }
            }
            if(val==bursttime.length)
                break;
        }
        q.display();
        System.out.println(waitingtime);

    }
}
