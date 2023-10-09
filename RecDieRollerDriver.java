
/**
 * @author sam58
 * @Version 1.0
 *
 */
public class RecDieRollerDriver {

	public static void main(String[] args) {
		
		RecDieRoller roll = new RecDieRoller();
		
		System.out.println(roll.rollDice());
		roll.rollDice(1000);
	}
}
