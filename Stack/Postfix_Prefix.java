public class Postfix_Prefix {
    public static void main(String args[]){
        String postfix = "ABC/-AK/L-*";
        prefix(postfix);
    }

    public static void prefix(String postfix){
        int max = postfix.length();
        int top=-1;
        String stk[]=new String[max];
        for(int i=0;i<=max-1;i++){
            char c=postfix.charAt(i);
            if(Character.isLetterOrDigit(c)){
                stk[++top]= c+"";
            }
            else{
                String a=stk[top--];
                String b=stk[top--];
                stk[++top]=c+b+a;
            }
        }
        System.out.println(stk[top]);
    }
}
