package org.example;

import java.io.FileInputStream;
import java.io.FileOutputStream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    //bad code
    public static void main(String[] args) throws Exception{

        FileInputStream fin = new FileInputStream("target.jpg");
        FileOutputStream fout = new FileOutputStream("copy.jpg");

        System.out.println(fin);

        byte[] buffer = new byte[1024 *8];

        long start = System.currentTimeMillis();

        while(true){

            int count = fin.read(buffer);

            System.out.println(count);

            if(count == -1) break;

            fout.write(buffer,0,count); //새로 채운 만큼만 써라
        }

        long end = System.currentTimeMillis();

        System.out.println("Time : "+(end-start));

    }
}