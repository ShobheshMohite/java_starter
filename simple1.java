//file handling
//create new file using prog

import java.io.*;

public class simple1{
    public static void main(String[] args) throws IOException{
        File fobj = new File("shobhesh.txt");
        if(fobj.createNewFile())
        {
            System.out.println("File Created Successfully...");
        } else {
            System.out.println("File Creation Failed ):");
        }
    }
}
