import Model.BirdClass;
import Model.ImageBackground;
import Model.ObstacelsClass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.TimerTask;

public class PlayBoard extends JPanel implements ActionListener{

    private Timer timer;
    private BirdClass birdClass;
    private ObstacelsClass obstacelsClass;
    private static int DELAY = 10;
    private boolean playing = true;
    private JLabel time;
    private JFrame frames;
    private JPanel jPanel;
    private ImageBackground bg;
    static int timeStack = 0;
    public PlayBoard() {
        this.setSize(400,400);
        init();
    }

    private void init() {

        addKeyListener(new Adapter());
        setFocusable(true);

        obstacelsClass = new ObstacelsClass();
        birdClass = new BirdClass();
        bg = new ImageBackground();

        timer = new Timer(DELAY, this);
        timer.start();

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
        Toolkit.getDefaultToolkit().sync();

    }
    int i  = 0;
    private void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(bg.getImage(), 0,0, this);
        g2d.drawImage(birdClass.getImage(), birdClass.getX(), birdClass.getY(), this);
        g2d.drawImage(obstacelsClass.getImage(),obstacelsClass.getX(),obstacelsClass.getY(),this);
    }

    int score = 0;
    @Override
    public void actionPerformed(ActionEvent e) {

        birdClass.move();
        obstacelsClass.move();
       if(obstacelsClass.getX() <= (0 - obstacelsClass.getWidth())){
           obstacelsClass = new ObstacelsClass();
           score++;
       }

       if(birdClass.getX() == obstacelsClass.getX() && birdClass.getY() == obstacelsClass.getY()){

       }

        cekCollision();
        repaint();
    }

    private void cekCollision(){
        Rectangle r2 = obstacelsClass.getBounds();
        Rectangle r3 = birdClass.getBounds();
        if(r3.intersects(r2)){
            timer.stop();
            System.out.println("hitted");
            ScoreForm fm = new ScoreForm(score);
            fm.setVisible(true);
        }
       if(obstacelsClass.getX() < birdClass.getX()){
           System.out.println("Scored");
       }

    }

    private class Adapter extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            birdClass.keyPressed(e);
        }

        @Override
        public void keyReleased(KeyEvent e) {
            birdClass.keyRelesed(e);
        }
    }
    static java.util.Timer tim;
    int nilai = 0;


}
