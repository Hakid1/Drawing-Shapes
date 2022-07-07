import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.*;

public class circle extends JPanel {
    int radius;

    public circle(){
        this.setSize(800,660);
        this.setLocation(100,0);

        radius = Integer.parseInt(JOptionPane.showInputDialog(null, "    Enter the DIAMETER\n\n  Range 1cm - 15cm\n\n"));
        if(radius>15){

            JOptionPane.showMessageDialog(null, "404 Error!!");
            JOptionPane.showMessageDialog(null, "\nEnter DIAMETER in the given range!!\n\n");
            System.exit(0);

        }
        if(radius<1){

            JOptionPane.showMessageDialog(null, " DIAMETER cannot be less than 1\n\n");
            System.exit(0);

        }


    }

    public void paint(Graphics g){
        Graphics2D g2d =(Graphics2D) g;

        g2d.setFont(new Font("TimesNewRoman",Font.BOLD,25));
        g2d.drawString("YOUR CIRCLE IS DRAWN", 200, 30);

        g2d.setStroke(new BasicStroke(10));
        g2d.setPaint(Color.BLUE);
        g2d.drawOval(390-(radius*38)/2,325-(radius*38)/2, radius*38, radius*38);
    }
    
}
