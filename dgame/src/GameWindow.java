import javax.swing.*;
import java.awt.*;

public class GameWindow {

    public GameWindow (int w, int h, String title, Game newGame) {
        newGame.setPreferredSize(new Dimension(w, h));

        JFrame frame = new JFrame(title);
        frame.add(newGame);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        // calls start method
        newGame.start();
    }
}
