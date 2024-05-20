import java.io.*;
import java.net.*;

public class server {

    public static void main(String[] args) {
        int port = 12345;

        try(ServerSocket serverSocket = new ServerSocket(port))
        {
            System.out.println("Server Is Running On Port: "+port);
            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("New Client Connected..");
                

                //create input output stream 
                InputStream input = socket.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(input));

                OutputStream output = socket.getOutputStream();
                PrintWriter writer = new PrintWriter(output,true);
                
                String text;
                while ((text = reader.readLine()) != null) {
                    System.out.println("Client: " + text);  
                    writer.println("Server: "+text);
                }

                socket.close();
                System.out.println("Client Disconnected");

            }
        } catch(IOException obj)
        {
            obj.printStackTrace();
        }
    }
}