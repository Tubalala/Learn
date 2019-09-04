package day02.day09.Demo03;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

/*程序处于阻塞所以程序没有停下来
* */
public class DemoServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8888);
        while (true) {
            Socket ac = server.accept();
            /*使用多线程提高效率
            * */
            new Thread(new Runnable() {
                @Override
                public void run() {
                   try{
                       //创建存储的文件夹
                       InputStream is = ac.getInputStream();
                       File file = new File("d:\\upload");
                       if (!file.exists()) {
                           file.mkdirs();
                       }
                       String fileName = "itcast"+System.currentTimeMillis()+new Random().nextInt(999999)+".jpg";
                       FileOutputStream fos = new FileOutputStream(file+"\\"+fileName);
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
                   }catch (IOException e){
                       System.out.println(e);
                   }
                }
            }).start();

        }

        //server.close();
    }
}
