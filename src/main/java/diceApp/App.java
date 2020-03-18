package diceApp;

import diceApp.io.github.Julienchilhagopian.TripletOfDice;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
	@SuppressWarnings("unused")
	private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

	public static void main(String[] args) throws Exception {
		TripletOfDice triplet = new TripletOfDice(4);

		System.out.println("get value " + triplet.getDice1());
	}

	public void proceed() {
		LOGGER.info("Hello World!");
	}
}
