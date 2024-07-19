package org.example.lotto;

import java.util.Arrays;
import java.util.Scanner;

public class LottoUI {

    public LottoUI(LottoMachine machine) {
        this.machine = machine;
    }

    private LottoMachine machine;

    public void run(){

        Scanner in = new Scanner(System.in);
        System.out.println("1판에 천원입니다. 금액을 입력하세요");
        int money = in.nextInt();
        if(money % 1000 !=0){
            System.out.println("천 단위로 입력하시오");
            return;
        }
        int count = money / 1000;

        for(int i = 0; i < count; i++){
            int[] paper = this.machine.selectBalls();
            System.out.println(Arrays.toString(paper));
        }
    }

}
