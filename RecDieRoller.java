import java.util.ArrayList;
import java.util.Random;

/**
 * @author Sam Kauffman
 * @Version 1.0
 *
 */
public class RecDieRoller {

	private Random random = new Random();
	int roll = 0;

	/**
	 * @return number for how many rolls
	 */
	public int rollDice() {

		roll = random.nextInt(6) + 1;
		System.out.println(roll);

		if (roll == 2) {
			return 1;
		}
		return rollDice() + 1;
	}

	/**
	 * @param times you roll the dice
	 */
	public void rollDice(int timesRolled) {

		int totalRolls = 0;
		System.out.println(roll);

		for (int i = 0; i < timesRolled; i++) {
			totalRolls += rollDice();
		}
		double mean = totalRolls / 1000.0;
		System.out.println("The mean is: " + mean);
	}
}
