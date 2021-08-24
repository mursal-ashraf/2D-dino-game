import java.awt.*;
import java.awt.image.ImageObserver;
import java.util.ArrayList;
import java.util.Random;

public class ObstacleHandler {

    private ArrayList<Obstacles> obstacleList = new ArrayList<>();

    private float dx = -3f;
    private float ddx = -0.001f;

    private long lastOb;
    private Random random = new Random();

    public void tick(){
        double rand = random.nextDouble();

        if (rand < 0.01 && System.currentTimeMillis() - lastOb > 700) {
            obstacleList.add(new Obstacles());
            lastOb = System.currentTimeMillis();
        }

        for (Obstacles obstacle: obstacleList) {
            obstacle.dx = dx;
            obstacle.tick();

            if (obstacle.x < -100) {
                obstacleList.remove(obstacle);
                break;
            }
        }
        dx += ddx;
    }

    public void render(Graphics g, ImageObserver observer){
        for (Obstacles obstacle: obstacleList){
            obstacle.render(g, observer);
        }
    }

    public ArrayList<Obstacles> getObstacleList(){
        return new ArrayList<>(obstacleList);
    }
}
