package gb.ru;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class GameStar extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	Texture background;
	int x;
	int y;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("nemo.png");
		background = new Texture("fon.jpg");
	}

	@Override
	public void render () {
		ScreenUtils.clear(1, 0, 0, 1);
		batch.begin();
		batch.draw(background,0,0,800,480);
		batch.draw(img, x, y);
		x++;
		y++;
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
