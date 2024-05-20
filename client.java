import java.io.*;
import java.net.*;


public class client {
    public static void main(String[] args) {
        String hostname = "localhost";
        int port = 12345;

        try(Socket socket = new Socket(hostname,port)){
            
            OutputStream output = socket.getOutputStream();
            PrintWriter writer = new PrintWriter(output,true);

            InputStream input = socket.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));

            writer.println("Hello Server");

            String response = reader.readLine();
            System.out.println("Server Responded: "+response);
        } catch(UnknownHostException ex)
        {
            System.out.println("Server not found: " + ex.getMessage());
        } catch(IOException ex) {
            System.out.println("I/O Error : "+ex.getMessage());
        }
    }
}
