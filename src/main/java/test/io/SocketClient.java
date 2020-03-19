package test.io;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketClient {

    public static void main(String[] args) throws IOException {
        Socket client = new Socket(InetAddress.getByName("127.0.0.1"),9999);
        OutputStream outputStream = client.getOutputStream();
        outputStream.write("数据测试".getBytes());
        outputStream.flush();
        outputStream.close();
    }

}
