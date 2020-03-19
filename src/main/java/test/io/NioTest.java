package test.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.InetSocketAddress;
import java.nio.channels.Channel;
import java.nio.channels.FileChannel;
import java.nio.channels.SocketChannel;

public class NioTest {

    public static void main(String[] args) throws IOException {
        File file = new File("E:\\test\\TEST01.txt");
        RandomAccessFile rFile = new RandomAccessFile(file,"rw");
        FileChannel channel = rFile.getChannel();
        SocketChannel.open(new InetSocketAddress("127.0.0.1",9999));
        channel.transferTo(0,channel.size(),channel);
    }


}
