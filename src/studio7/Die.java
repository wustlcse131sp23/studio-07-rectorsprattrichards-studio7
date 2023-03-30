package studio7;

public class Die {

		private int sides;
		public Die(int numSides) {
			sides=numSides;
		}
	public int getSides() {
		return sides;
	}
	public int rollDie(int sides) {
		return(int)(sides*Math.random()+1);
	}
}
