package day02.day09.DemoTCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class DemoServer {
    public static void main(String[] args) throws IOException {
        //创建服务器端口号
        ServerSocket server = new ServerSocket(8888);
        Socket socket = server.accept();
        InputStream is = socket.getInputStream();
        int len = 0;
        byte[] bytes = new byte[1024];
        len = is.read(bytes);
        System.out.println("收到客户端消息: "+(new String(bytes,0,len)));
        //回复客户端
        OutputStream os = socket.getOutputStream();
        os.write("received ,fine".getBytes());

        is.close();
        os.close();
    }
}
