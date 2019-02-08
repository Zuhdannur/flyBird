
package Model;

import javax.swing.*;
import java.awt.*;

public class ImageBackground {
    private int dy,y,x,width,height;
    private Image image;
    public ImageBackground(){
        init();
    }

    private void init(){
        ImageIcon bg =new ImageIcon("asset/background.png");
        Image resize =bg.getImage();
        Image newImg = resize.getScaledInstance(400,400, Image.SCALE_SMOOTH);
        bg = new ImageIcon(newImg);
        image = bg.getImage();
        width = bg.getIconWidth();
        height = bg.getIconHeight();
    }


    public void move(){
        y +=0;
    }

    public int getDy() {
        return dy;
    }

    public void setDy(int dy) {
        this.dy = dy;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }
}
