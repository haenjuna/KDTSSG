package org.example;

import org.example.lotto.LottoBall;
import org.example.lotto.LottoMachine;
import org.example.weather.Weather;
import org.example.weather.WeatherMachine;

import java.util.ArrayList;
import java.util.Arrays;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        ArrayList<Weather> list = new ArrayList<Weather>();

        list.add(new Weather("1",1,1,""));
        list.add(new Weather("2",1,1,""));
        list.add(new Weather("3",1,1,""));
        list.add(new Weather("4",1,1,""));
        list.add(new Weather("5",1,1,""));
        list.add(new Weather("6",1,1,""));
        list.add(new Weather("7",1,1,""));
        list.add(new Weather("8",1,1,""));
        list.add(new Weather("9",1,1,""));
        list.add(new Weather("10",1,1,""));
        WeatherMachine weatherMachine = new WeatherMachine(list);
        System.out.println(Arrays.toString(weatherMachine.select_Weather()));

// ArrayList<LottoBall> list = new ArrayList<LottoBall>();
// for (int i = 1; i < 45; i++) {
// LottoBall ball = new LottoBall(i);
// list.add(ball);
// }
// LottoMachine lottoMachine = new LottoMachine(list);
//TIP 캐럿을 강조 표시된 텍스트에 놓고 <shortcut actionId="ShowIntentionActions"/>을(를) 누르면
// IntelliJ IDEA이(가) 수정을 제안하는 것을 확인할 수 있습니다.
// BMIUI ui = new BMIUI();
// ui.run();

    }
}