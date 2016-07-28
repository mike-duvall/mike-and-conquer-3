package come.mikeduvall;


import com.badlogic.gdx.Game;

public class FlappeeBeeGame extends Game {

	@Override
	public void create () {
		setScreen(new GameScreen());
	}

}
