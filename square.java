import java.awt.*;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class square extends JPanel{
    int length;

    public square(){

        this.setSize(800,660);
        this.setLocation(100,0);

     
        length = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the LENGTH\n\n      Range 1cm-15cm\n\n\n"));

        if(length>15){
            JOptionPane.showMessageDialog(null, "404 Error!!");
            JOptionPane.showMessageDialog(null, "Enter LENGTH in the range given");
            System.exit(0);
        }
        if(length<1){
            JOptionPane.showMessageDialog(null, "Width can't be less than one");
            System.exit(0);
        }
    }
    public void paint(Graphics g) {

        Graphics2D g2d =(Graphics2D) g;

        g2d.setFont(new Font("TimesNewFoman",Font.BOLD,25));
        g2d.drawString("YOUR SQUARE IS DRAWN", 200, 30);

        g2d.setStroke(new BasicStroke(10));
        g2d.setPaint(Color.BLUE);
        g2d.drawRect((785-(length*38))/2, (660-(length*38))/2,length*38,length*38);
        
    }
    
}
