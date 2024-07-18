package org.example;

import java.util.Random;
import java.util.Scanner;

public class RSPGame {
    public static void main(String[] args) {

        int wincnt = 0;
        for(;;) {
            Scanner sc = new Scanner(System.in);
            System.out.println("0(가위),1(바워),2(보) 중에 하나를 입력하라");

            int user = sc.nextInt();

            Random random = new Random();
            int com = random.nextInt(3);
            System.out.println("com : " + com +" : "+ user + " : user");

            if (com < user) {
                com += 3;
            }
            int result = com - user;
            //승리시
            if (result == 2) {
                System.out.println("승리하였습니다!");
                //승리횟수 추가
                wincnt += 1;
            }
            //패배시
            else if (result == 1) {
                System.out.println("패배하였습니다..");
                //승리횟수 초기화
                wincnt =0;
            }
            //비길시
            else {
                System.out.println("비겼습니다.");
            }
            //현재 승리 횟수 추가
            System.out.println("현재 연속 승리 횟수 : "+ wincnt);

            //연승 3회시 종료
            if(wincnt==3){
                System.out.println("승리 횟수 충족 완료 프로그램을 종료합니다.");
                break;
            }
        }
    }
}
