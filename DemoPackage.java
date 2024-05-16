import java.util.*;
import Marvellous.Arithmetic;

class DemoPackage{
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int iNo1 = sobj.nextInt();
        System.out.println("Enter second number : ");
        int iNo2 = sobj.nextInt();

        Arithmetic aobj = new Arithmetic(iNo1, iNo2);
        int iRet = aobj.Addition();
        System.out.println("Addition is : "+iRet);
    }
}
