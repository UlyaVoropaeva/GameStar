package gb.ru.sprite;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import gb.ru.base.Sprite;
import gb.ru.math.Rect;

public class Background extends Sprite {

    public Background(Texture texture) {

        super(new TextureRegion(texture));
    }

    @Override
    public void resize(Rect worldBounds) {
        setHeightProportion(worldBounds.getHeight());
        this.pos.set(worldBounds.pos);
    }
}
