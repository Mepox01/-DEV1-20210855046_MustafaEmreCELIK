package tetris;

import javax.swing.JOptionPane;

public class Tetris {
    private static GameForm gf;
    private static StartupForm sf;

    public static void start() {
        gf.setVisible(true);
        gf.startGame();
    }

    public static void showStartup() {
        sf.setVisible(true);
    }

    public static void gameOver(int score) {
       JOptionPane.showMessageDialog(null, 
        "Game Over","Game over",JOptionPane.ERROR_MESSAGE
       );
        gf.setVisible(true);
        sf.setVisible(false);
        

    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                gf = new GameForm();
                sf = new StartupForm();
                sf.setVisible(true);
            }
        });
    }
}
