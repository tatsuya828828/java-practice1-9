package job;

public class Wizard {
	public String name;
	public int hp;

	public void heal(Hero h) {
		h.hp+=10;
		System.out.println(h.name+"のHPを10回復した");
	}
}
