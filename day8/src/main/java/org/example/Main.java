package org.example;

import org.example.salary.CalcSalary;
import org.example.salary.ContractWorker;
import org.example.salary.Freelancer;
import org.example.salary.PartTimer;
import org.example.vend.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Map<String, Msg> langMap = new HashMap<>();
        langMap.put("ko", new KoreanMsg());
        langMap.put("fr",new CongoMsg());
        langMap.put("it",new ItalianMsg());
        langMap.put("th",new ThaiMsg());
        langMap.put("ge",new GermanMsg());

        Scanner scanner = new Scanner(System.in);
        System.out.println("언어를 선택하세요");

        Msg msg = langMap.get(scanner.nextLine());

        VendingMachine machine = new VendingMachine(msg);

        machine.start();


//        File file = new File("list.txt");
//        Scanner scanner = new Scanner(file);
//
//        java.util.List<CalcSalary> empList = new ArrayList<CalcSalary>();
//
//        while (scanner.hasNextLine()) {
//            String line = scanner.nextLine();
//            System.out.println(line);
//
//            //split - 배열로
//            String[] arr = line.split(",");
//
//            if(arr[0].equals("A")){ //이 직원 파트타이머
//
//            }else if(arr[0].equals("C")){
//
//            }else if(arr[0].equals("F")){
//
//            }
//
//        }//while true
//        scanner.close(); //파일 연결 끝
//
//        System.out.println("--------------------------------");
//
//        empList.forEach( emp -> System.out.println( emp.getName()+": " + emp.calcMonth()) );
//

    }
}