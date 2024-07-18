package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        PiggySave ps = new PiggySave();
        ps.deposit(100);
        int money = ps.withdraw();

//        Player player = new Player("아서왕",80);
//
//        Monster monster = new Monster(3);
//
//        int effect = player.attack();
//        System.out.println("용사의 딜량"+effect);
//        System.out.println("남은 몬스터의 피 :"+monster.damage(effect));
//
//        int monsterEffect = monster.attack();
//        System.out.println("몹의 딜량"+monsterEffect);
//        System.out.println(player.defense(monsterEffect));
    }
}