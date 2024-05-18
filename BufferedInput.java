import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class BufferedInput {
    public static void main(String[] args) {
        InputStreamReader iobj = new InputStreamReader(System.in);
        BufferedReader bobj = new BufferedReader(iobj);

        String Name = null;
        int Age = 0;
        float marks = 0.0f;

        try
        {
            System.out.println("Enter Your Name: ");
            Name = bobj.readLine();

            System.out.println("Enter Your Age");
            Age = Integer.parseInt(bobj.readLine());

            System.out.println("Enter Your Marks");
            marks = Float.parseFloat(bobj.readLine());
        } catch(IOException e) {
            System.out.println("Error Occured"+e);
        }
        System.out.println("Name: "+Name);
        System.out.println("Age: "+Age);
        System.out.println("Marks: "+marks);
    }
}
