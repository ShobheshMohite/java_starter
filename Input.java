//Accepting Input From User

import java.util.*;

class Input{
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        int iNo1 = 0;
        int iNo2 = 0;
        int iAns = 0;

        System.out.println("Enter First Number: ");
        iNo1 = sobj.nextInt();

        System.out.println("Enter Second Number: ");
        iNo2 = sobj.nextInt();

        iAns = iNo1 + iNo2;

        System.out.println("Addition is : "+iAns);

    }
}