public class Postfix_Eval {
    public static void main(String arg[]){
       String postfix = "231*+9-";
       Eval(postfix);
    }

    public static void Eval (String exp){
        int top= -1;

        double [] stk= new double[exp.length()];

        for(int i=0;i<exp.length();i++){

            char c = exp.charAt(i);

            if(Character.isDigit(c)){ //imp
                stk[++top]=c-'0'; //imp
            }
            else{

                double a= stk[top--];
                double b= stk[top--];

                if(c=='+')
                    stk[++top]=a+b;
                else if(c=='-')
                    stk[++top]=b-a;
                else if(c=='*')
                    stk[++top]=b*a;
                else if(c=='/')
                    stk[++top]=b/a;
                else
                    System.out.println("invalid character");
            }
        }
        System.out.println("Evaluated value= "+ stk[top]);
    }
}
