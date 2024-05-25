import java.util.Scanner;

public class palindrome{
    public static void main(String[] args) {
        String str ="" ;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter String To Check : ");
        str = sobj.nextLine();

        String lowerString = str.toLowerCase();
        
        String reverseString = new StringBuilder(lowerString).reverse().toString();

        if(lowerString.equals(reverseString)){
            System.out.println("It is Palindrome String..");
        } else {
            System.out.println("It is not Palindrome String..");
        }

        System.out.println(lowerString);
        sobj.close();

    }
}
