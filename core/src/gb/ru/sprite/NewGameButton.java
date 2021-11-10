package gb.ru.sprite;

import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import gb.ru.base.BaseButton;
import gb.ru.math.Rect;
import gb.ru.screen.GameScreen;

public class NewGameButton extends BaseButton {

    public static final float HEIGHT = 0.04f;
    public static final float TOP_MARGIN = -0.01f;
    private final GameScreen gameScreen;

    public NewGameButton(TextureAtlas atlas, GameScreen gameScreen) {
        super(atlas.findRegion("button_new_game"));
        this.gameScreen = gameScreen;
    }

    @Override
    public void resize(Rect worldBounds) {
        super.resize(worldBounds);
        setHeightProportion(HEIGHT);
        setTop(TOP_MARGIN);
    }

    @Override
    public void action() {
        gameScreen.startNewGame();
    }
}
