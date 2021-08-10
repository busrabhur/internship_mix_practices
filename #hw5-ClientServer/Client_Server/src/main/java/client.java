
import java.io.IOException;
import java.net.*;
import java.io.*;



public class client {
    
    public static void main(String[] args) throws IOException {
        Socket s=new Socket("localhost",4999);
        //to send massage to SERVER
        PrintWriter pr=new PrintWriter(s.getOutputStream());
        pr.println("HELLO!!! Is it working?");
        pr.flush();
        
        //to read server's massage
        InputStreamReader in=new InputStreamReader(s.getInputStream());
        BufferedReader bf=new BufferedReader(in);
        String str=bf.readLine();
        System.out.println("SERVER:"+str);
    }
    
    
    
}
