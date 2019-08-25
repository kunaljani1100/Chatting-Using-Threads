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
public class Thread2 extends Thread{
    @Override
    public void run() {
        try
        {
            Scanner scanner = new Scanner(System.in);
            ServerSocket server = new ServerSocket(2501);
            Socket socket=server.accept();
            System.out.println("You can now receive messages from the client.");
            BufferedReader input=new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter output=new PrintWriter(socket.getOutputStream());
            String response="";
            while(true)
            {
                response=input.readLine();
                System.out.println(response);
            }
        }
        catch (IOException e)
        {
            System.out.println("Not connected to client.");
        }
    }
}
