public class Player extends GameObject{

    private boolean jumping = false;

    public Player(){
        super(50, Game.GROUND_HEIGHT);
        sprite = loadSprite("assets/assets/dino.png");
    }

    @Override
    public void tick(){
        if (jumping && y + dy > 250){
            // stop when dino reaches ground
            y = 250;
            dy = 0;
            jumping = false;
        } else if (jumping){
            // gravity motion
            dy += 0.3f;
        }
        y += dy;
        x += dx;
    }

    public void jumpAction(){
        if (!jumping){
            jumping = true;
            dy = -8;
        }
    }
}
