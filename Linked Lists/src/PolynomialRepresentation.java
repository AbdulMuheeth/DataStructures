import java.util.Scanner;

class PNode{
    int coeff,pow;
    PNode next;

    public PNode(int c , int p){
        coeff = c;
        pow = p;
        next= null;
    }
}

class PolynomialADT{
    Scanner sc;
    public PolynomialADT(){
       sc = new Scanner(System.in);
    }
    public PNode createPoly(PNode head){
        int c=1,p=1;

        while(p!=0){
            System.out.println("Enter the coeff and power ...");
            c = sc.nextInt();
            p= sc.nextInt();
            head= insert(c,p,head);
        }
        return head;
    }

    public PNode insert(int c, int p, PNode head){
        PNode t,temp;

        temp= new PNode(c,p);

        if(head==null)
            head = temp;
        else{
            t=head;
            while(t.next!=null)
                t=t.next;
            t.next = temp;
        }
        return head;
    }

    public void showPoly(PNode head){
        PNode temp=head;
        while(temp!=null){
            if(temp.pow==0)
                System.out.print("("+temp.coeff+")");
            else
                System.out.print("(" + temp.coeff + ")x^" + temp.pow + " + ");
            temp=temp.next;

        }
    }

    public PNode addPoly(PNode p,PNode q){
        PNode r= null; //reference to 3rd list

        while((p!=null) && (q!=null)){
            if(p.pow>q.pow){
                r=insert(p.coeff,p.pow,r);
                p=p.next;
            }
            else if (p.pow < q.pow){
                r = insert(q.coeff,q.pow,r);
                q=q.next;
            }
            else{
                r= insert(p.coeff+q.coeff,p.pow,r);
                p=p.next;
                q=q.next;
            }
        }

        while(p!=null) { //anything is remained in the first poly
            r=insert(p.coeff,p.pow,r);
            p= p.next;
        }
        while(q!=null){
            r=insert(q.coeff,q.pow,r);
            q=q.next;
        }
        return r;
    }

    public PNode subPoly(PNode p, PNode q){
        PNode r = null;
        PNode temp = q;

        while(temp!=null){
            temp.coeff = -1*temp.coeff;
            temp=temp.next;
        }
        r= addPoly(p,q);
        return r;
    }

    public PNode mulPoly(PNode p, PNode q){
        PNode r = null;
        PNode x=p,y=q;

        while(x!=null){
            while(y!=null){
                int coefficient,power;

                coefficient = x.coeff * y.coeff;
                power = x.pow + y.pow;

                r= insert(coefficient,power,r);

                y=y.next;
            }
            y=q;
            x=x.next;
        }
        return r;
    }
}







public class PolynomialRepresentation {
    public static void main(String args[]){
        PolynomialADT obj = new PolynomialADT();

        PNode first, second,third,fourth, fifth;

        first = second = null;


        System.out.println("\n Enter first Polynomial data ...\n");
        first  = obj.createPoly(first);
        System.out.println("\n Enter second Polynomial data ...\n");
        second = obj.createPoly(second);

        System.out.println("\n First Polynomial...\n");
        obj.showPoly(first);
        System.out.println("\n Second Polynomial...\n");
        obj.showPoly(second);

        third = obj.addPoly(first,second);
        fourth = obj.subPoly(first,second);
        fifth = obj.mulPoly(first,second);

        System.out.println("\n\nAfter adding...\n");
        obj.showPoly(third);

        System.out.println("\n\nAfter subtracting...\n");
        obj.showPoly(fourth);

        System.out.println("\n\nAfter multiplying...\n");
        obj.showPoly(fifth);
    }
}
