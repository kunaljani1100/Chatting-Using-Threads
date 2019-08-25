package kunal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by kunal on 22-07-2017.
 */
public class Thread1 extends Thread {
     int x;
     int y;
    @Override
    public void run() {
        try
        {
            Scanner scanner=new Scanner(System.in);
            ServerSocket server = new ServerSocket(2500);
            Socket socket=server.accept();
            System.out.println("You can now send messages to the client.");
            System.out.println("Start typing messages in the box. Press \"enter\" to send " +
                            "messages. Type \"exit\" to leave.");
            BufferedReader input=new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter output=new PrintWriter(socket.getOutputStream(),true);
            String response;
            String message="";
            while(!message.equals("exit"))
            {
                message=scanner.nextLine();
                if(message.equals("exit"))
                    System.exit(0);
                output.println("Server:"+message);
            }
        }
        catch (IOException e)
        {
            System.out.println("Not connected to client.");
            System.exit(0);
        }
    }
}
