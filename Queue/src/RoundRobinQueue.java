class Queue_new{
    int front,rear;
    int max = 40;
    int queue[];
    Queue_new(){
        this.front=0;
        this.rear=0;
        queue =  new int[40];
    }

    public boolean queueFull(){
        return rear==max-1;
    }
    public boolean queueEmpty(){
        return rear==front;
    }

    public void enqueue(int data){
        if(!queueFull())
            queue[rear++]=data;
        else
            System.out.println("Queue overflowed");

    }

    public int dequeue(){
        if(!queueEmpty()) {
            int val = queue[front++];
            return val;
        }
        else {
            System.out.println("Queue Underflowed");
            return -1;
        }
    }
}

public class RoundRobinQueue{
    public static void main(String args[]) {
        Queue_new q = new Queue_new();
        int burst_time[] = {3, 7, 4, 3, 8, 12};
        int quantum = 3;
        System.out.println("The process of the execution is :");
        for(int i=0;i<6;i++)
            q.enqueue(i);
        while(!q.queueEmpty()){
            int pid = q.dequeue();
            System.out.print("p"+pid+"  ");
            burst_time[pid]-=quantum;
            if(burst_time[pid]>0)
                q.enqueue(pid);

        }
        for(int i=0;i<40;i++){
            System.out.println(q.queue[i]);
        }
    }
}