package org.example.str;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DataOut {
    //bad code
    public static void main(String[] args) throws Exception{

        FileOutputStream fos =  new FileOutputStream("temp.txt");
        DataOutputStream dos = new DataOutputStream(fos);

        dos.writeUTF("홍길동"); //구성정보2byte 알파벳 1byte


    }
}
