import java.util.Random;
import java.util.Scanner;

import job.Hero;
import job.Warrior;
import job.Wizard;
import villain.Matango;
import weapon.Axe;
import weapon.Sword;


public class Main {
	public static void main(String[] args) {

		// 武器を作成
		Sword s = new Sword();
		s.name = "炎の剣";
		s.attack = 10;

		Axe a = new Axe();
		a.name = "しょぼい斧";
		a.attack = 20;

		// 勇者を作成
		Hero h = new Hero();

		// 勇者の名前入力とHPの設定
		System.out.println("名前を入力してください");
		h.name = new Scanner(System.in).nextLine();
		h.hp = new Random().nextInt(50)+100;
		System.out.println("勇者"+h.name+"、HP:"+h.hp+"を生み出しました");

		h.sword = s;
		System.out.println(h.sword.name+"を装備しました");

		// 戦士の作成
		Warrior warrior = new Warrior();
		warrior.name = "たかし";
		warrior.hp = 200;
		warrior.axe = a;

		// 魔法使いの作成
		Wizard w = new Wizard();
		w.name = "ウィッチ";
		w.hp = 50;

		System.out.println("戦士"+warrior.name+"と、魔法使い"+w.name+"が仲間になった！");

		// モンスターの作成
		int num = new Random().nextInt(5)+1;
		int[] monster = new int[num];
		for(int i=1; i<monster.length; i++) {
			Matango m= new Matango();
			m.hp = new Random().nextInt(9)+50;
			m.suffix = i;
			System.out.println("おばけきのこ"+m.suffix+" HP:"+m.hp);
		}
		System.out.println("が現れた！");


		// 3.勇者のメソッドを呼び出していく
		int attackNum = new Random().nextInt(num)+1;
		System.out.println("おばけきのこ"+attackNum+"に攻撃した！");
		System.out.println(h.sword.attack+"のダメージを与えた！");
		System.out.println(warrior.name+"は、"+warrior.axe.name+"で攻撃した！");
		System.out.println(warrior.axe.attack+"のダメージを与えた！");
		h.sit(5);	// 5秒座る
		h.slip();	// 転ぶ
		w.heal(h);
		h.sit(25);	// 25秒座る
		h.run();	// 逃げる
	}

}
