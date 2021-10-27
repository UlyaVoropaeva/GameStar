package gb.ru;

import com.badlogic.gdx.Game;
import gb.ru.screen.MenuScreen;


public class GameStar extends Game {

	
	@Override
	public void create () {
		setScreen(
				new MenuScreen(this));
	}


}
