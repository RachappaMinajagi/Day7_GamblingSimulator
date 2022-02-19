import java.util.Scanner;

public class Gambler {

	/* UC1 As a Gambler, would start with a stake
	 * 
	 */
	public static final int INITIAL_BET_STAKE = 100;
	public static final int BET_AMT = 1;
	Scanner.scanner = new Scanner (System .in);

	/* UC2 As a Gambler make bet so either win or loose
	 * 
	 */
	public void gambler_SolutionUC2() {

		double num = Math.floor(Math.random() * 10) % 2;
		int remg_amt = INITIAL_BET_STAKE;
		if (num == 0) {
			remg_amt += BET_AMT;
			System.out.println("The Gambler wins the bet and he has $" + remg_amt + " with him after one bet.");
		} else {
			remg_amt -= BET_AMT;
			System.out.println("The Gambler loses the bet and he has $" + remg_amt + " with him after one bet.");
		}
	}

	/*
	 * UC3: As a Gambler make bet so either win or loose
	 */
	public void gambler_SolutionUC3(int margin_perct) {
		double uppr_margin = INITIAL_BET_STAKE + margin_perct * INITIAL_BET_STAKE / 100;
		double lowr_margin = INITIAL_BET_STAKE - margin_perct * INITIAL_BET_STAKE / 100;
		double avail_amt = INITIAL_BET_STAKE;
		while ((avail_amt < uppr_margin) && (avail_amt > lowr_margin)) {

			double num1 = Math.floor(Math.random() * 10) % 2;

			if (num1 == 0) {
				avail_amt += BET_AMT;
			} else {
				avail_amt -= BET_AMT;
			}
		}
		System.out.println("The gambler resigns for the day after he has $" + avail_amt + " with him.");
	}

	public static void main(String[] args) {
		System.out.println("welcome to gambler simulator problem");
		Gambler game = new Gambler();

		game.gambler_SolutionUC3(10);
	}

}
