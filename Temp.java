import java.awt.*;
import java.applet.*;
// g.drawLine(10,10,20,20);
public class Temp extends Applet{
    public void paint(Graphics g){


        int x = 20;
        int y = 20;
        int width = 50;
        int height = 50;
        for(int k = 0; k < 50; k++){
            g.drawOval(x,y,width,height);
            x+=50;
            y+=50;



        }




    }


}
