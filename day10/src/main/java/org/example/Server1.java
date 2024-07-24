package org.example;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Random;

public class Server1 {

    //bad code
    public static void main(String[] args) throws Exception{
        //서버 소켓 5555
        ServerSocket serverSocket = new ServerSocket(5555);
        System.out.println("Ready...............");


        while (true) {
            try(Socket socket = serverSocket.accept();
                OutputStream out = socket.getOutputStream();
                FileInputStream fin = new FileInputStream("bbb.jpg");)
            {
                String msg = "<h1>Hello World"+System.currentTimeMillis()+"</h1>";
                out.write(new String("HTTP/1.1 200 OK\r\n").getBytes());
                out.write(new String("Cache-Control: private\r\n").getBytes());
                out.write(new String("Content-Type: image/jpg; charset=UTF-8\r\n\r\n").getBytes());

                //byte[] 내용물을 담는 용도
                byte[] buffer = new byte[1024 *8];

                while(true){

                    int count = fin.read(buffer);

                    System.out.println(count);

                    if(count == -1) break;

                    out.write(buffer,0,count); //새로 채운 만큼만 써라
                }

                out.write(msg.getBytes(StandardCharsets.UTF_8));
            }catch(Exception e){
                e.printStackTrace();
                continue;
            }
            //연결 accept()



        }

    }
}
