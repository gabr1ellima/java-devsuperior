package entities;

public class Champion {
	public String name;
	public int life;
	public int attack;
	public int armor;
	
	public Champion(String name, int life, int attack, int armor) {
		this.name = name;
		this.life = life;
		this.attack = attack;
		this.armor = armor;
	}
	
	public void takeDamage(int damage) {
		if (armor >= damage) {
			life -= 1;
		} else {
			life = life + armor - damage;
		}
		
	}
	
	public String status() {
		if (life < 0) {
			life = 0;
			return name
					+ ": "
					+ String.format("%d de vida (morreu)", life);
		} else {
			return name
					+ ": "
					+ String.format("%d de vida", life);
		}

	}
}
