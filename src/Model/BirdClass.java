package Model;

import Utils.Util;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class BirdClass {
    private int dy,y,x,width,height;
    private Image image;
    private Util utilities;
    public BirdClass(){
        init();
    }

    public int getDy() {
        return dy;
    }

    private void init(){
        ImageIcon bird =new ImageIcon("asset/birds.png");
        image =bird.getImage();
        width = bird.getIconWidth();
        height = bird.getIconHeight();
        y = 60;
        x = 40;
    }


    public void setDy(int dy) {
        this.dy = dy;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void move(){
        y += dy;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public void keyPressed(KeyEvent e){
        int key = e.getKeyCode();
        if(key == KeyEvent.VK_UP){
                dy = -5;
        }
    }

    public void keyRelesed(KeyEvent e){
        int key = e.getKeyCode();
        if(key == KeyEvent.VK_UP){
            dy = 2;
        }
        if(key == KeyEvent.VK_DOWN){
            dy = 2;
        }
    }

    public Rectangle getBounds(){
        return new Rectangle(x,y,width,height);
    }
}
