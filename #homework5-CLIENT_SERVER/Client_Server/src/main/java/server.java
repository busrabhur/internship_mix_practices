
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.*;

 class server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(4999);
        Socket s=ss.accept();
        System.out.println("client connected");
        
        InputStreamReader in=new InputStreamReader(s.getInputStream());
        BufferedReader bf=new BufferedReader(in);
        String str=bf.readLine();
        System.out.println("CLIENT:"+str);//server is reading the client's massage and printing it.
        
        PrintWriter pr=new PrintWriter(s.getOutputStream());
        pr.println("Hello!!! Yes,it is working. ");
        pr.flush();
        
   
}
}
