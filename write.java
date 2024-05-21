//file handling
//create new file using prog

import java.io.*;

public class write{
    public static void main(String[] args) throws IOException{
        try{
            File fobj = new File("shobhesh.txt");
        if(fobj.createNewFile())
        {
            System.out.println("File Created Successfully...");
        } else {
            System.out.println("File Creation Failed ):");
        }

        FileWriter fileWriter = new FileWriter(fobj);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        bufferedWriter.write("Hello,this is a first line");
        bufferedWriter.newLine();
        bufferedWriter.write("Hello,this is a Second line");

        bufferedWriter.close();
        fileWriter.close();

        System.out.println("Data Written to file successfully");

    } catch(IOException e)
    {
        System.out.println(e);
    }
}
        
}
