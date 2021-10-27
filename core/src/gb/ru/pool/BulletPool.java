package gb.ru.pool;


import gb.ru.base.SpritesPool;
import gb.ru.sprite.Bullet;

public class BulletPool extends SpritesPool<Bullet> {
    @Override
    protected Bullet newObject() {
        return new Bullet();
    }
}
