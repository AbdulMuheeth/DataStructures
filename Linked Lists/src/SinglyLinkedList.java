import java.util.Scanner;

class Node{
    String data;
    Node next;
    public Node(String nm){
        data = nm;
        next = null;
    }
}

class LinkedList{
    Node head;
    Scanner sc;

    public LinkedList(){
        head = null;
        sc = new Scanner(System.in);
    }
    public void CreateList(){
        while(true) {
            System.out.print("Enter the data:\t");
            String k = sc.next();

            insert(k);

            System.out.print("Wish to enter another:\t");
            String v = sc.next();

            if (v.equals("no"))
                return; //returns the void hi
        }

    }
    public void insert(String data){
        Node temp,t;
        temp=new Node(data);
        if (head==null){
            head=temp;
        }
        else{
            t=head;
            while(t.next != null)
                t=t.next;
            t.next=temp;
        }
    }

    public void insertAt(int pos,String data){
        Node temp,t;
        temp = new Node(data);
        t=head;
        if(pos==0){
            head=temp;
            head.next=t;
        }
        else if(pos == this.size()){
            while(t!=null)
                t=t.next;
            t.next=temp;
        }
        else{
            for(int i=1;i<pos;i++){
                t=t.next;
            }
            t.next=temp;
            t=t.next;
            temp.next=t.next;
        }


    }

    public void RemoveAt(int pos){
        Node t= head;
        if(pos==0){
            head=t.next;
        }
        else if(pos == this.size()){
            while(t.next!=null){
                t=t.next;
            }
            t=null;
        }
        else{
            Node t2;
            for(int i=1;i<pos-1;i++){
                t=t.next;
            }
            t2=t.next;
            t.next=null;
            t.next=t2.next;
        }

    }
    public int  size(){
        Node t;
        t=head;
        int c=0;
        while(t!=null) {
            c++;
            t=t.next;
        }
        return c;
    }
    void ViewLinkedList(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("null");
    }

}

public class SinglyLinkedList {
    public static void main(String [] args) {
        LinkedList Llist = new LinkedList();

        Llist.ViewLinkedList();

        Llist.CreateList();
        Llist.ViewLinkedList();
        Llist.insertAt(3,"new");
        Llist.ViewLinkedList();
    }
}
