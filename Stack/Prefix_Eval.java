public class Prefix_Eval {
    public static void main (String args[]){
        String prefix = "-+8/632";
        Evaluate(prefix);
    }

    public static void Evaluate(String prefix){
        int top=-1;
        int max=prefix.length();
        double stk[]= new double[max];
        for(int i=max-1;i>=0;i--){
            char c = prefix.charAt(i);
            if(Character.isDigit(c)){
                stk[++top]= c-'0';
            }
            else{
                double a=stk[top--];
                double b=stk[top--];
                if(c=='+')
                    stk[++top]= (a+b) ;
                else if(c=='*')
                    stk[++top]= (a*b);
                else if(c=='-')
                    stk[++top]=(a-b);
                else if(c=='/')
                    stk[++top]=a/b;
            }
        }
        System.out.println(stk[top]);
    }
}
