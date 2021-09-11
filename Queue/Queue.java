import java.util.Scanner;

class imple{
    int front,rear;
    int max;
    int queue[];
    imple(){
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
//            queue[front] = 0;
//            front++;
//            for(int i=front;i!=(rear-1);i++){
//                try {
//                    queue[i] = queue[i + 1];
//                }
//                catch (ArrayIndexOutOfBoundsException AIOE){
//                    System.out.println(AIOE);
//                }
//            }
//            front++;
//            queue[max-1]=0;
//            max = rear-1;
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




public class Queue {
    public static void main (String args[]){
        imple que = new imple();
        que.Enqueue(1);
        que.Enqueue(2);
        que.Enqueue(3);
        que.Enqueue(4);
        que.Enqueue(5);
        que.display();
        que.Dequeue();
        que.Dequeue();
        que.Dequeue();
        que.Dequeue();
        que.Dequeue();
        que.display();
    }
}
