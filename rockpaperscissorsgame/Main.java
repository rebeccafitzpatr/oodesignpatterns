package rockpaperscissorsgame;

public class Main {
  

	private static final String WELCOME = "______           _                \n"
			+ "| ___ \\         | |               \n" + "| |_/ /___   ___| | __            \n"
			+ "|    // _ \\ / __| |/ /            \n" + "| |\\ \\ (_) | (__|   < _           \n"
			+ "\\_| \\_\\___/ \\___|_|\\_( )          \n" + "                     |/           \n"
			+ "                                  \n" + "______                            \n"
			+ "| ___ \\                           \n" + "| |_/ /_ _ _ __   ___ _ __        \n"
			+ "|  __/ _` | '_ \\ / _ \\ '__|       \n" + "| | | (_| | |_) |  __/ |_         \n"
			+ "\\_|  \\__,_| .__/ \\___|_( )        \n" + "          | |          |/         \n"
			+ "          |_|                     \n" + "                 _                \n"
			+ "                | |               \n" + "  __ _ _ __   __| |               \n"
			+ " / _` | '_ \\ / _` |               \n" + "| (_| | | | | (_| |               \n"
			+ " \\__,_|_| |_|\\__,_|               \n" + "                                  \n"
			+ "                                  \n" + " _____      _                     \n"
			+ "/  ___|    (_)                    \n" + "\\ `--.  ___ _ ___ ___  ___  _ __  \n"
			+ " `--. \\/ __| / __/ __|/ _ \\| '__| \n" + "/\\__/ / (__| \\__ \\__ \\ (_) | |    \n"
			+ "\\____/ \\___|_|___/___/\\___/|_|    \n" + "                                  \n"
			+ "                                  \n" + " _____                            \n"
			+ "|  __ \\                           \n" + "| |  \\/ __ _ _ __ ___   ___       \n"
			+ "| | __ / _` | '_ ` _ \\ / _ \\      \n" + "| |_\\ \\ (_| | | | | | |  __/      \n"
			+ " \\____/\\__,_|_| |_| |_|\\___|      \n" + "                                  \n" + "";

	public static void main(String[] args) {

		System.out.print(WELCOME);
		RockPaperScissorsGame game = new RockPaperScissorsGame();
		game.play();
	}

}
