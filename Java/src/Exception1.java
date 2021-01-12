public class Exception1 {
    public static void main(String args[]){
        try{
            // int a=5/0;
            int a= 5/1 ;
            try{

                //int n = Integer.parseInt("string");
                int n = Integer.parseInt("23");
                try{
                    int b[] = new int[5];
                    b[7] = 10;
                }
                catch(ArrayIndexOutOfBoundsException aiob){
                    System.out.println(aiob);
                }
            }
            catch(NumberFormatException nfe){
                System.out.println(nfe);
            }
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
    }
}
