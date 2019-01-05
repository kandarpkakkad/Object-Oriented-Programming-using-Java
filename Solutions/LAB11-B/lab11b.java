import java.awt.*;
import java.applet.*;

public class lab11b extends Applet {
	Color colors[]={ Color.blue, Color.cyan, Color.yellow, Color.red, Color.darkGray, Color.gray, Color.lightGray, Color.magenta, Color.orange, Color.pink, Color.white, Color.black};

        public void paint(Graphics g){
		Dimension d = getSize();
             	int x = d.width/colors.length;
             	setBackground(Color.lightGray);
             	for (int i=0; i<colors.length ; i++ )
             	{
             		g.setColor(colors[i]);
             	      	g.fillRect(i*x, 0, (i+1) * x, d.height);
             	}
        }
}
