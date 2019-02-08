package Model;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class ObstacelsClass {
    private int y,x,dy,dx,tinggi,width;
    private Image image;

    public ObstacelsClass(){
        init();
    }

    public void init(){

        int random = (int)(Math.random() * 2 + 1);

        if(random == 1){
            ImageIcon ob = new ImageIcon("asset/rintangan.png");
            image = ob.getImage();
            tinggi = ob.getIconHeight();
            width = ob.getIconWidth();
            y = 0;
            x = 400;
        }
       else{
            ImageIcon ob = new ImageIcon("asset/rintangan2.png");
            image = ob.getImage();
            tinggi = ob.getIconHeight();
            width = ob.getIconWidth();
            y = 400 - tinggi;
            x = 400;
        }

    }

    public int getWidth(){
        return width;
    }

    public void move(){
        x -= 5;
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

    public int getDy() {
        return dy;
    }

    public void setDy(int dy) {
        this.dy = dy;
    }

    public int getDx() {
        return dx;
    }

    public void setDx(int dx) {
        this.dx = dx;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public Rectangle getBounds(){
        return new Rectangle(x,y,width,tinggi);
    }
}
