package day02.day09.DemoTCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class DemoCline {
    public static void main(String[] args) throws IOException {
        //创建客户端端口号和ip地址
        Socket s = new Socket("127.0.0.1", 8888);
        //向服务器端发送数据
        OutputStream os = s.getOutputStream();
        os.write("hello".getBytes());
        //接受服务器回复
        InputStream is = s.getInputStream();
        int len = 0;
        byte[] bytes = new byte[1024];
        len = is.read(bytes);
        System.out.println("收到回复："+(new String(bytes,0,len)));
        is.close();
        os.close();
    }
}
