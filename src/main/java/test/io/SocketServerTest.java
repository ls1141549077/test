package test.io;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServerTest {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(9999);
        while(true){
            Socket accept = server.accept(); // 阻塞式读取
            BufferedReader reader = new BufferedReader(new InputStreamReader(accept.getInputStream()));
            String line = reader.readLine();
            System.out.println(line);
            System.out.println("Host " + accept.getRemoteSocketAddress());
            System.out.println("Host " + accept.getPort());
        }

    }
}
