public class Infix_prefix {
    public static void main(String args[]){
        String inf="A+B*C-D/E*H";
        Convert(inf);
    }

    static void Convert(String inf){
        String res="";
        int max=inf.length(),top=-1;
        char stk[] = new char[max];
        for(int i=max-1;i>=0;i--){
            char c = inf.charAt(i);
            if(Character.isLetterOrDigit(c))
                res += c;
            else if(c==')')
                stk[++top] = c;
            else if(c=='(')
                while (stk[top]!=')' && top>0) {
                    res+=stk[top--];
                    top--;
                }
            else{
                while(top!=-1 && prec(c)<=prec(stk[top]))
                    res+=stk[top--];
                stk[++top]=c;
            }
        }
        while(top!=-1)
            res+=stk[top--];
        char[] result= res.toCharArray();
        for(int i=result.length-1;i>=0;i--)
            System.out.print(result[i]);
    }

    public static int prec(char ch){
        if(ch=='^')  	// assume that '^' indicates power (Ex.a^b)
            return 5;
        else
        if((ch=='*') || (ch=='/') || (ch=='%'))
            return 4;
        else
        if((ch=='+') || (ch=='-'))
            return 3;
        else
        if(ch=='=')
            return 1;
        else
            return -1;
    }

}
