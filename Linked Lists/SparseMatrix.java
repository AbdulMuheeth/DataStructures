
class MyNode{
    int row,col,val;
    MyNode next;
}

public class SparseMatrix {

    public static void main(String args[]){
        int s[][] = {{0,0,2},{0,0,0},{3,0,0}};
        MyNode head=null;
        MyNode last = null;
        MyNode temp;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(s[i][j]!=0){
                    temp = new MyNode();
                    temp.row=i;temp.col=j;temp.val=s[i][j];
                    temp.next = null;
                    if(head == null) {
                        head=last= temp;
                    }
                    else{
                        last.next=temp;
                        last = temp;
                    }

                }
            }
        }
        for(temp = head;temp!=null;temp=temp.next)
            System.out.print(temp.row+"|"+temp.col+"||"+temp.val+"->   ");
        System.out.println("null");

    }
}
