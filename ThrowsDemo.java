import java.util.*;

class Arithmetic
{
    public int Division(int A,int B)throws ArithmeticException
    {
        int iAns = 0;
        iAns = A / B;
        return iAns;
    }
}
/**
 * ThrowsDemo
 */
public class ThrowsDemo {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter First Number :");
        int iNo1 = sobj.nextInt();
        System.out.println("Enter Second Number : ");
        int iNo2 = sobj.nextInt();

        Arithmetic aobj = new Arithmetic();

        try
        {
            int iRet = aobj.Division(iNo1, iNo2);
            System.out.println("Division is: "+iRet);
        }
        catch (ArithmeticException obj)
        {
            System.out.println("Exception Occured");
            System.out.println(obj);
        }   
    }
}