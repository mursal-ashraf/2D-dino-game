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
        long lastTime = System.nanoTime();
        double amountOfTicks = 100.0;
        double ns = 1000000000 / amountOfTicks;
        double delta = 0;
        long timer = System.currentTimeMillis();
        int updates = 0;
        int frames = 0;

        running = true;

        while (running) {
            long now = System.nanoTime();
            delta += (now - lastTime) / ns;
            lastTime = now;

            while (delta >= 1) {
                tick();
                updates++;
                delta--;
            }
            render();
            frames++;

            // this prints the tick and frame rate to the console
            if (System.currentTimeMillis() - timer > 1000) {
                timer += 1000;
                System.out.println("fps: " + frames + " ticks: " + updates);
                frames = 0;
                updates = 0;
            }
        }
    }

    public void tick(){

    }

    public void render(){

    }


}
