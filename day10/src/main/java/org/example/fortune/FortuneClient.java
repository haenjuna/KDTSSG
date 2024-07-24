package org.example.fortune;

import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.Socket;

public class FortuneClient {
    public static void main(String[] args) throws Exception{

        //연결
        Socket socket = new Socket("127.0.0.1", 5555);

        //빨대
        InputStream inputStream = socket.getInputStream();
        DataInputStream dataInputStream = new DataInputStream(inputStream);

        String fortune = dataInputStream.readUTF();
        System.out.println("Fortune is " + fortune);
        dataInputStream.close();
        socket.close();
    }
}
