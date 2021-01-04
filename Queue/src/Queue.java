
class Imple_Queue{
    int rare=-1;
    int front=-1;
    int top=-1;
    int max;
    int arr[];
    public Imple_Queue(int mx){
        max = mx;
        arr= new int [max];
    }

    public boolean isFull(){
        return max==top;
    }
    public boolean isEmpty(){
        return top==-1;
    }

    public void enQueue(int inpt){
        if(!isFull()){
            rare=(rare+1)%max;
            arr[rare]=inpt;

            top++;
        }
        else{

            System.out.println("Queue OverFlow");
        }
    }

    public int deQueue(){
        if(!isEmpty()){
            front=(front+1)%max;
            int data = arr[front];

            top--;
            return data;
        }
        else{
            System.out.println("queue underflow");
            return -1;
        }
    }

    public void viewQueue(){
        for(int i=0;i<top;i++){
            System.out.print(i+" "+arr[i]);
        }
        System.out.println();
    }


}
public class Queue {
    public static void main(String args[]){
        Imple_Queue Qe = new Imple_Queue(4);
        Qe.enQueue(1);
        Qe.enQueue(2);
        Qe.enQueue(3);
        Qe.enQueue(4);
        Qe.viewQueue();
        Qe.deQueue();
        Qe.viewQueue();
    }
}
