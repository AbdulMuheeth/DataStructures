package trees;
import java.util.Scanner;

class BTnode{
    int data;
    BTnode right,left;
}

class Btree{
    Scanner sc = new Scanner(System.in);
    BTnode insert(int val){
        BTnode b = new BTnode();
        BTnode root = new BTnode();
        b.data= val;
        b.right=null;b.left=null;

        if( root == null)
            root=null;
        else{
            System.out.println("Enter the Parent Node");
            int p = sc.nextInt();
            BTnode parent = Bsearch(root,p);
        }

    }

    BTnode Bsearch(BTnode root, int key){
        BTnode stk[] = new BTnode[20];
        int top=-1;
        stk[++top] = root;
        if(root== null) {
            System.out.println("No parent found");
            return null;
        }
        else{
            while(true){


                    while(root!=null){
                        stk[++top] = root;
                        root=root.left;
                    }
                    if(top ==-1){
                        return null;
                    }
                    else{
                        root=stk[top--];
                        if(root.data ==  key)
                            return root;
                        root=root.right;
                    }


            }
        }
    }
}


public class BinaryTree {

}
