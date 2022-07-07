
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.*;
import java.util.Random;

public class oval extends JPanel {
    int Hradius;
    int Vradius;
    Random random;

    public oval() {
        random = new Random();
        this.setSize(800, 660);
        this.setLocation(100, 0);

        Hradius = Integer.parseInt(
                JOptionPane.showInputDialog(null, "    Enter the Horizontal Radius\n\n  Range 1cm - 20cm\n\n"));
        if (Hradius > 20) {

            JOptionPane.showMessageDialog(null, "404 Error!!");
            JOptionPane.showMessageDialog(null, "\nEnter Horizontal Radius in the given range!!\n\n");
            System.exit(0);

        }
        if (Hradius < 1) {

            JOptionPane.showMessageDialog(null, "HORIZONTAL radius cannot be less than 1\n\n");
            System.exit(0);

        }

        Vradius = Integer
                .parseInt(JOptionPane.showInputDialog(null, "    Enter the Vertical Radius\n\n  Range 1cm - 15cm\n\n"));
        if (Vradius > 15) {

            JOptionPane.showMessageDialog(null, "404 Error!!");
            JOptionPane.showMessageDialog(null, "\nEnter Vertical Radius in the given range!!\n\n");
            System.exit(0);

        }
        if (Vradius < 1) {

            JOptionPane.showMessageDialog(null, "VERTICAL radius cannot be less than 1\n\n");
            System.exit(0);

        }
        if (Hradius == Vradius) {

            JOptionPane.showMessageDialog(null, "\n    An OVAL does not have equal RADIUS\n\n");
            JOptionPane.showMessageDialog(null,
                    "\n    Choose the Draw Circle option to draw a Circle\nWith equal Radius\n\n");
            System.exit(0);
        }

    }

    public void paint(Graphics g){
        Graphics2D g2d =(Graphics2D) g;

        g2d.setFont(new Font("TimesNewRoman",Font.BOLD,25));
        g2d.drawString("YOUR OVAL IS DRAWN", 200, 30);
        //int r = random.nextInt(256);
        //int c = random.nextInt(256);
        //int b = random.nextInt(256);

        g2d.setStroke(new BasicStroke(10));
       // g2d.setPaint(new Color(r,c,b));
       g2d.setPaint(Color.BLUE);
        g2d.drawOval(390-(Hradius*38)/2,325-(Vradius*38)/2, Hradius*38, Vradius*38);
    }

}
