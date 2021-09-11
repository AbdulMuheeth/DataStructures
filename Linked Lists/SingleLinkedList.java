import java.util.Scanner;

class Node1{
    String data;
    Node1 next;
    public Node1(String nm){
        data = nm;
        next = null;
    }
}

class LinkedList1{
    Node1 head;
    Scanner sc;

    public LinkedList1(){
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
        Node1 temp,t;
        temp=new Node1(data);
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

    void ViewLinkedList(){
        Node1 temp=head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("null");
    }

}

public class SingleLinkedList {
    public static void main(String [] args) {
        LinkedList1 Llist = new LinkedList1();

        Llist.ViewLinkedList();
        Llist.CreateList();
        Llist.ViewLinkedList();

    }
}
