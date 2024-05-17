import java.util.*;

class AgeInvalidException extends Exception
{
    AgeInvalidException(String str)
    {
        super(str); //to invoke the constructor of the parent class  i.e,Exception class
    }
}

public class UserDefinedExept {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the age : ");
        int iAge = sobj.nextInt();

        try
        {
            if(iAge < 15)
            {
                throw new AgeInvalidException("Your Age Is Less Than Required Age");
    
            } else
            {
                System.out.println("Age is valid");
            }
        } 
        catch(AgeInvalidException A) 
        {
            System.out.println(A);
        }
    }
}
