//import javax.swing.JOptionPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.*;
public class triangle extends JPanel{
    int x,y,z;
    public triangle(){
        this.setSize(800,660);
        this.setLocation(100,0);
        //JOptionPane.showMessageDialog(null, "Don't Forget to draw me prisss\n😭😭😭😭😭");
       x = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter First dimension"));
       y = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Second dimension"));
       // z = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Third dimension"));
    }
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D)g;

        g2d.setFont(new Font("TimesNewFoman",Font.BOLD,25));
        g2d.drawString("YOUR TRIANGLE IS DRAWN", 200, 30);
        g2d.setPaint(Color.BLUE);
        g2d.setStroke(new BasicStroke(5));
        //int [] xpoints ={(x*38),(x*38)/4,(y*38)};
        //int [] ypoints ={(x*38)/4,(x*38),(y*38)/2};
        int[] xpoints ={(x*38)-100,((x*38)*2)-50,(570-(y*38))*2};
        int[] ypoints ={(x*38)/2,(x*38),800-(y*38)};
        g2d.drawPolygon(xpoints,ypoints, 3);

        
    }
}
