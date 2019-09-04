package day02.day09.Demo02;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
/*程序处于阻塞所以程序没有停下来
* */
public class DemoServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8888);
        Socket ac = server.accept();
        //创建存储的文件夹
        InputStream is = ac.getInputStream();
        File file = new File("d:\\upload");
        if (!file.exists()) {
            file.mkdirs();
        }

        FileOutputStream fos = new FileOutputStream(file+"\\1.jpg");
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = is.read(bytes)) != -1) {
            /*is.read读取不到文件结束标记，
             read方法进入阻塞状态，死循环等待结束标记*/
            fos.write(bytes,0,len);
        }
        ac.getOutputStream().write("Completed!".getBytes());
        fos.close();
        ac.close();
        server.close();
    }
}
