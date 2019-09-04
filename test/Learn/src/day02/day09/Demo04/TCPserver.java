package day02.day09.Demo04;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPserver {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8088);
        Socket socket = serverSocket.accept();
        InputStream is = socket.getInputStream();
        /*int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = is.read()) != -1) {
            System.out.println(new String(bytes,0,len));
        }*/
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String line = br.readLine();
        System.out.println(line);
        String[] arr = line.split(" ");
        String htmlpath = arr[1].substring(1);

        FileInputStream fis = new FileInputStream(htmlpath);
        OutputStream os = socket.getOutputStream();

        os.write("HTTP/1.1 200 OK\r\n".getBytes());
        os.write("Content-Type:text/html\r\n".getBytes());
        os.write("\r\n".getBytes());

        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = fis.read(bytes)) != -1) {
            os.write(bytes,0,len);
        }

        fis.close();
        socket.close();
        serverSocket.close();
    }
}
