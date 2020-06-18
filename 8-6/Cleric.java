import java.util.Random;

public class Cleric {
	String name;
	int currentHP = 50;
	int maxHP = 50;
	int currentMP = 10;
	int maxMP =10;

	public void selfAid() {
		this.currentMP-=5;
		this.currentHP = maxHP;
	}

	public void pray(int sec) {
		int mp = new Random().nextInt(3)+sec;
		this.currentMP+=mp;
		if(this.currentMP>this.maxMP) {
			this.currentMP = this.maxMP;
		}
	}
}
