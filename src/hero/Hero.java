package hero;

import weapon.Sword;

public class Hero {
	public String name;
	public int hp;
	public Sword sword;

	public void sleep() {
		this.hp = 100;
		System.out.println(this.name+"は、眠って回復した！");
	}

	public void sit (int sec) {
		this.hp += sec;
		System.out.println(this.name+"は、"+sec+"秒間座った！");
		System.out.println("HPが、"+sec*2+"回復した");
	}

	public void slip() {
		this.hp -= 5;
		System.out.println(this.name+"は、転んだ！");
		System.out.println("5のダメージ！");
	}

	public void run() {
		System.out.println(this.name+"は、逃走した");
		System.out.println("うまく逃げ切れた");
		System.out.println("残りのHP:"+this.hp);
	}

}