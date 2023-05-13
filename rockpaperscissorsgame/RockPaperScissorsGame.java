package rockpaperscissorsgame;

import java.util.Scanner;

public class RockPaperScissorsGame {

	public static Scanner scanner = new Scanner(System.in);

	private void printReady() {
		System.out.print("Ready?");
		try {
			Thread.sleep(50);
			for (int i = 1; i <= 3; i++) {
				System.out.print(i);
				Thread.sleep(50);
				for (int k = 0; k < 5; k++) {
					System.out.print(".");
					Thread.sleep(50);
				}
			}
			System.out.println("GO!");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private int getResult(Action human, Action cpu) {
		System.out.println();
		System.out.println("YOU : " + human.toString() + "   <->   " + cpu.toString() + " : CPU");
		System.out.println();

		if (human.equals(cpu)) {
			System.out.println("TIE :|");
			return 0;
		}

		if (human == Action.ROCK && cpu == Action.SCISSORS //
				|| human == Action.SCISSORS && cpu == Action.PAPER //
				|| human == Action.PAPER && cpu == Action.ROCK) {
			System.out.println("YOU WON :)");
			return 1;
		}

		System.out.println("YOU LOST :(");
		return 2;
	}

	public void play() {

		CPU cpu = new CPU();
		Human player = new Human();
		String res;
		do {
			Action choiceHuman = player.play();
			Action choiceCPU = cpu.play();
			printReady();
			getResult(choiceHuman, choiceCPU);
			System.out.println("Do you want to play again?");
			res = scanner.next();
			while (!res.equals("yes") && !res.equals("no")) {
				System.out.println("Wrong input! please type either \"yes\" or \"no\"");
				res = scanner.next();
			}
		} while (res.equals("yes"));
		scanner.close();
	}

}
