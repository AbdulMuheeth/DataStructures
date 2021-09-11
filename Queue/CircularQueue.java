import java.util.Scanner;

class Circularimple{
    int front,rear;
    int max,maxi;
    int queue[];
    Circularimple(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the queue");
        this.max = sc.nextInt();
        queue = new int[max];
        this.front=-1;
        this.rear=-1;
        maxi = this.max;
    }
    boolean isfull(){
        return (((max-1)==rear&&(front==0))||(front==rear+1))?true:false;
    }
    boolean isempty(){
        return (front==-1)?true:false;
    }
    void Enqueue(int val){
        if(!isfull()) {
            if(front == -1)
                front=0;
            rear=(rear+1)%max;
            queue[rear]=val;
            System.out.println(val +" is inserted.");
        }
        else
            System.out.println("Queue overflowed");

    }

    int Dequeue() {
        if (!isempty()){
            int val = queue[front];
            if(front==rear){
                //queue has one element,so we reset the queue after deleting it.
                front=-1;
                rear=-1;
            }
            else{
                front=(front+1)%max;
            }
            return val;
        }
        else{
            System.out.println("Queue underflowed");

            return -1;
        }

    }

    void display(){
        /* Function to display status of Circular Queue */
        int i;
        if (isempty()) {
            System.out.println("Empty Queue");
        } else {
            System.out.println("Front -> " + front);
            System.out.println("Items -> ");
            for (i = front; i != rear; i = (i + 1) % max)
                System.out.print(queue[i] + " ");
            System.out.println(queue[i]);
            System.out.println("Rear -> " + rear);
        }


    }

}




public class CircularQueue {
    public static void main (String args[]){
        Circularimple que = new Circularimple();
        que.Enqueue(1);
        que.Enqueue(2);
        que.Enqueue(3);
        que.Enqueue(4);
        que.Enqueue(5);
        que.display();
        que.Dequeue();
        que.Dequeue();
        que.Dequeue();
        que.display();
        que.Dequeue();
        que.Dequeue();
        que.display();
    }
}
