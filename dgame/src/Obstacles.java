import java.util.ArrayList;
import java.util.Random;

public class Obstacles extends GameObject{

    private ArrayList<String> obstaclePaths = new ArrayList<>();

    public Obstacles(){
        super(Game.GAME_WIDTH, Game.GAME_HEIGHT);

        obstaclePaths.add("assets/assets/cactus1.png");
        obstaclePaths.add("assets/assets/cactus2.png");
        obstaclePaths.add("assets/assets/cactus3.png");

        sprite = loadSprite(obstaclePaths.get(new Random().nextInt(obstaclePaths.size())));

    }
}
