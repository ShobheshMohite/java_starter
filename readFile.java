import java.io.*;

public class readFile{
    public static void main(String[] args) {
        String filePath = "example.txt";
        try {
            FileInputStream fis = new FileInputStream(filePath);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader reader = new BufferedReader(isr);

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e){
            System.out.println(e);
        }
    }
}

