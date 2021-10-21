package gb.ru.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;
import gb.ru.base.BaseScreen;

public class MenuScreen extends BaseScreen {
    private Texture img;
    private Texture background;
    private Vector2 touch;
    private Vector2 pos;
    private Vector2 v;
    private Vector2 tmp;
    private static final float V_LENGHT = 2.0f;

    @Override
    public void show(){
        super.show();
        img = new Texture("nemo.png");
        background = new Texture("fon.jpg");
        touch = new Vector2();
        pos = new Vector2();
        v = new Vector2();
        tmp = new Vector2();

    }

    @Override
    public void render (float delta){
        super.render(delta);
        tmp.set(touch);
        if(tmp.sub(pos).len() > V_LENGHT){
            pos.add(v);
        } else {
            pos.set(touch);
        }
        batch.begin();
        batch.draw(background,0,0,800,480);
        batch.draw(img, pos.x, pos.y);
        batch.end();


    }
    @Override
    public void dispose(){
        super.dispose();
        img.dispose();
        background.dispose();
    }


    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button){
        touch.set(screenX, Gdx.graphics.getHeight() - screenY);
        v.set(touch.cpy().sub(pos)).setLength(V_LENGHT);
        return super.touchDown(screenX,screenY,pointer,button);
    }

}