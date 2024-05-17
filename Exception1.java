import java.util.*;

public class Exception1 {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        int iNo1 = 0,iNo2 = 0,iAns = 0;
        System.out.println("Enter First Number");
        iNo1 = sobj.nextInt();
        System.out.println("Enter Second Number");
        iNo2 = sobj.nextInt();

        try {
            System.out.println("Inside try block");
            iAns = iNo1 / iNo2;
            System.out.println("Division is :"+iAns);
        }
        catch (ArithmeticException obj)
        {
            System.out.println("Inside catch 1");
            System.out.println(obj);
        } 
        catch (NullPointerException obj)
        {
            System.out.println("Inside catch 2");
            System.out.println(obj);
        }
        catch (Exception e) {
            System.out.println("Inside catch 3");
            System.out.println(e);
            // TODO: handle exception
        } 
        finally
        {
            System.out.println("Inside Finally Block");
            sobj.close();
        }
    }
}
