import java.awt.*;

public class Game extends Canvas{

    public static final int GAME_WIDTH = 800;
    public static final int GAME_HEIGHT = 400;
    public static final int GROUND_HEIGHT = 250;

    private boolean running = false;

    public Game (){
        // initially empty constructor
    }

    public static void main(String[] args) {
        new GameWindow(GAME_WIDTH, GAME_HEIGHT, "Dino Game", new Game());
    }

    public void start(){
        
    }


}
