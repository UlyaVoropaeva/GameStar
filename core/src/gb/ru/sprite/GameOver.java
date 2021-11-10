package gb.ru.sprite;

import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import gb.ru.base.Sprite;
import gb.ru.math.Rect;

public class GameOver extends Sprite {

    private static final float HEIGHT = 0.09f;
    private static final float BOTTOM_MARGIN = 0.01f;

    public GameOver(TextureAtlas atlas) {
        super(atlas.findRegion("message_game_over"));
    }

    @Override
    public void resize(Rect worldBounds) {
        super.resize(worldBounds);
        setHeightProportion(HEIGHT);
        setBottom(BOTTOM_MARGIN);
    }
}