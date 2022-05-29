import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random.*;

 class Game {
    int flag=0;
    JFrame f = new JFrame("SNAKE GAME");
    JButton easy = new JButton("Easy");
    JButton medium = new JButton("Medium");
    JButton hard = new JButton("Hard");


    Game() {

        f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        f.getContentPane().add(easy);

        easy.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                f.dispose();
                new GameFrame();
            }
        });
        f.setSize(100, 100);
        f.setVisible(true);
    }

}
public class SnakeGame {

    public static void main(String[] args) {

        new Game();
    }
}
