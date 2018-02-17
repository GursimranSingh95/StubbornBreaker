import java.applet.*;
import java.awt.*;
/*<applet code="circle" height=250 width=300>
</applet>*/
public class circle extends Applet
{
    public void paint(Graphics g)
    {
        int x=50,y=50,height=150,width=150;
        g.setColor(Color.GREEN);
        g.drawOval(x,y,height,width);
        do
        {
            x=x+10;
            y=y+10;
            height=height-20;
            width=width-20;
            g.drawOval(x,y,height,width);
        }
        while(x!=150);
    }
}
