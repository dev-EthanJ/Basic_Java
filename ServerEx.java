import java.io.*;
import java.net.*;
import java.util.*;

public class ServerEx {
    public static void main(String[] args) {
        BufferedReader in = null;
        BufferedWriter out = null;
        
        ServerSocket listener = null;
        Socket socket = null;

        Scanner scanner = new Scanner(System.in);

        try {
            listener = new ServerSocket(9999);
            System.out.println("Waiting for connection...");
            socket = listener.accept();
            System.out.println("Connected");

            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            while(true) {
                String inputMessage = in.readLine();
                if(inputMessage.equalsIgnoreCase("bye")) {
                    System.out.println("Client terminate connection by \"bye\"");
                    break;
                }
                System.out.println("Client: " + inputMessage);
                System.out.print("Send>>");
                String outputMessage = scanner.nextLine();
                out.write(outputMessage + "\n");
                out.flush();
            }
        } catch (IOException e) { System.out.println("IOException occurs."); }
        finally {
            try {
                scanner.close();
                socket.close();
                listener.close();
            } catch (IOException e) {
                System.out.println("Error occurs.");
            }
        }
    }
}