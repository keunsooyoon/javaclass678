package java;

public class Fighter extends Unit implements Fightable {

	@Override
	public void move(int x, int y) {
		// Movable
	}

	@Override
	public void attack(Unit u) {
		// Attackable
		
	}
	
	Fightable method() {
		Fighter f = new Fighter();
		return f;
	}

}
