import java.util.Scanner;

public class Balanced {

    public static boolean isBalance(String str) {
        if (str.length() == 0)
            return true;
        int top = -1;
        int max = str.length();
        char stk[] = new char[max];
        for (int i = 0; i < max; i++) {
            char c = str.charAt(i);
            if (c == '(' || c == '{' || c == '[')
                stk[++top] = c;
            if (c == '}' || c == ')' || c == ']') {
                if(top==-1)
                    return false;
                char last = stk[top];
                if (c == '}' && last == '{' || c == ')' && last == '(' || c == ']' && last == '[')
                    --top;
                else
                    return false;
            }
        }
        return top==-1;
    }

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the Expression");
        String str = sc.nextLine();
        if(isBalance(str))
            System.out.println("The expression is balanced");
        else
            System.out.println("The expression is not balanced");
    }
}
