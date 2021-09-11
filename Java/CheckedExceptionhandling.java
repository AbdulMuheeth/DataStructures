import java.util.Scanner;

//import static com.sun.tools.classfile.Attribute.Exceptions;

public class CheckedExceptionhandling{
    static void avg(int number) throws InvalidInputException{
        if(number>100){
            throw new InvalidInputException("Exception new");
        }

        System.out.println("valid Input");
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        try {
            avg(n);
        }
        catch (InvalidInputException e){
            System.out.println("exception got is "+ e);
        }
    }
}

class InvalidInputException extends Exception{
    InvalidInputException(String ExceptionText){
        super(ExceptionText);
    }
}