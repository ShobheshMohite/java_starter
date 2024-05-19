
//to accept number from user and see the number is even or odd

import java.util.Scanner;

class CheckEvenOdd
{
    public int iNo;
    public CheckEvenOdd(int A){
        iNo = A;
    }
    void Check()
    {
        if(iNo % 2 == 0)
        {
            System.out.println("Even Number");
        }
        else if(iNo % 2 != 0) {
            System.out.println("It Is Odd Number");
        } else {
            System.out.println("Invalid Input");
        }

    }
}

public class Practice2{
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Any Number : ");
        int iNo = sobj.nextInt();
        CheckEvenOdd obj = new CheckEvenOdd(iNo);
        obj.Check();
    }

}
