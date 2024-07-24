package org.example.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;


public class FileWebServer {
    public static void main(String[] args) throws Exception {
        // 서버 소켓
        ServerSocket serverSocket = new ServerSocket(5555);
        System.out.println("ready............");

        while (true) {
            // 클라이언트 접속 대기
            try (Socket socket = serverSocket.accept()) {

                // 디렉토리에서 파일 목록 가져오기
                FileWebService file = FileWebService.INSTANCE;
                file.addFile(file.file);
                File[] files = file.files;
                if (files == null || files.length == 0) {
                    System.out.println("보여드릴 이미지가 없습니다.");
                    return;
                }

                // 랜덤 파일 선택
                Random random = new Random();
                File randomFile = files[random.nextInt(files.length)];

                System.out.println("보낸 파일 : " + randomFile.getName());

                // 파일 전송
                try (FileInputStream fin = new FileInputStream(randomFile);
                     OutputStream out = socket.getOutputStream();)
                    {out.write(new String("HTTP/1.1 200 OK\r\n").getBytes());
                    out.write(new String("Cache-Control: private\r\n").getBytes());
                    out.write(new String("Content-Type: image/jpg; charset=UTF-8\r\n\r\n").getBytes());

                    byte[] buffer = new byte[1024 * 8];

                    while (true) {
                        int count = fin.read(buffer);
                        if (count == -1) {
                            break;
                        }
                        out.write(buffer, 0, count);
                    }
                    System.out.println("전송 완료.");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
