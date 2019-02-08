package Utils;

import java.awt.*;

public class Util {

    public Image scaleImage(Image image,int w, int h){
        Image scaled = image.getScaledInstance(w,h,Image.SCALE_SMOOTH);
        return scaled;
    }
}
