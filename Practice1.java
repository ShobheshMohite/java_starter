//fibonacci series
// public class 

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        int iNo = 0 , firstTerm = 0 , secondTerm = 1;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Number Till You Want To See Fibonacci Series : ");
        iNo = sobj.nextInt();

        System.out.println("Fibonacci Series Upto "+iNo+" : ");

        for(int iCnt = 1 ; iCnt <= iNo ; iCnt++){
            System.out.print(firstTerm);
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
            System.out.print(", ");
        }   
        


    }
}
