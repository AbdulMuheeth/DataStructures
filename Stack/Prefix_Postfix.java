public class Prefix_Postfix {
    public static void main(String args[]){
        String  prefix ="*-A/BC-/AKL";
        Postfix(prefix);
    }
    public static void Postfix(String prefix){
        int max= prefix.length();
        int top=-1;
        String stk[]= new String[max];
        for(int i=max-1;i>=0;i--){
            char c= prefix.charAt(i);
            if(Character.isLetterOrDigit(c)){
                stk[++top]=c+"";
            }
            else{
                String  a = stk[top--];
                String  b = stk[top--];
                stk[++top] = a+b+c;
            }
        }
        System.out.println(stk[top]);
    }
}
