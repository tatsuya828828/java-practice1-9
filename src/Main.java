import Hero.Hero;
import Villain.Matango;

public class Main {
	public static void main(String[] args) {
		// 1.勇者を作成
		Hero h = new Hero();

		// 2.勇者の名前入力とHPの設定
		System.out.println("名前を入力してください");
		h.name = new java.util.Scanner(System.in).nextLine();
		h.hp = new java.util.Random().nextInt(50)+100;
		System.out.println("勇者"+h.name+"、HP:"+h.hp+"を生み出しました");

		// モンスターの作成
		int num = new java.util.Random().nextInt(5)+1;
		int[] monster = new int[num];
		for(int i=1; i<monster.length; i++) {
			Matango m= new Matango();
			m.hp = new java.util.Random().nextInt(9)+50;
			m.suffix = i;
			System.out.println("おばけきのこ"+m.suffix+" HP:"+m.hp);
		}
		System.out.println("が現れた！");


		// 3.勇者のメソッドを呼び出していく
		h.sit(5);	// 5秒座る
		h.slip();	// 転ぶ
		h.sit(25);	// 25秒座る
		h.run();	// 逃げる
	}

}
