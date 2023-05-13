package rockpaperscissorsgame;

public class CPU {

	public Action play() {
		
    Action action = new RandomStrategy().decideAction();
    return action;
	}

}
