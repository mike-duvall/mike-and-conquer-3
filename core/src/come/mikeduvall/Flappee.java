package come.mikeduvall;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Circle;

public class Flappee {

    private static final float COLLISION_RADIUS = 24f;
    private Circle collisionCircle;
    private float x = 0;
    private float y = 0;

    private static final float DIVE_ACCEL = 0.10F;
    private static final float FLY_ACCEL = 2F;

    private float ySpeed = 0;

    public Flappee() {
        collisionCircle = new Circle(x,y, COLLISION_RADIUS);
    }

    public void drawDebug(ShapeRenderer shapeRenderer) {
        shapeRenderer.circle(collisionCircle.x, collisionCircle.y, collisionCircle.radius);
    }

    public void setPosition(float x, float y) {
        this.x = x;
        this.y = y;
        updateCollisionCircle();

    }

    private void updateCollisionCircle() {
        collisionCircle.setX(x);
        collisionCircle.setY(y);
    }

    public void flyUp() {
        ySpeed = FLY_ACCEL;
        setPosition(x, y + ySpeed);
    }

    public void update() {
        ySpeed = ySpeed - DIVE_ACCEL;
        setPosition(x, y + ySpeed);
    }

    public Circle getCollisionCircle() {
        return collisionCircle;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }
}
