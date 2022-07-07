import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.*;
import java.util.Random;
//import java.text.BreakIterator;
public class rectangle extends JPanel{
    int width;
    int height;
    Random random;
    public rectangle(){

        random = new Random();
        this.setSize(800,660);
        this.setLocation(100,0);
        width = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the Width\n\n      Range 1cm-20cm\n\n\n"));

        if(width>20){
            JOptionPane.showMessageDialog(null, "404 Error!!");
            JOptionPane.showMessageDialog(null, "Enter width in the range given");
            System.exit(0);
        }
        if(width<1){
            JOptionPane.showMessageDialog(null, "Width can't be less than one");
            System.exit(0);
        }
        height = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the Height\n\n        Range 1cm-15cm\n\n\n"));
        if(height>15){
            JOptionPane.showMessageDialog(null, "404 Error!!");
            JOptionPane.showMessageDialog(null, "Enter Height in the range given");
            System.exit(0);
        }
        if(height<1){
            JOptionPane.showMessageDialog(null, "Width can't be less than one");
            System.exit(0);
        }
        if(height==width){
            JOptionPane.showMessageDialog(null, "     WIDTH and HEIGHT of a Rectangle can't be equal");
            JOptionPane.showMessageDialog(null, "Choose the Draw SQUARE option to draw a square");
            System.exit(0);

        }
    }

    public void paint(Graphics g) {
        

        Graphics2D g2d =(Graphics2D) g;

        g2d.setFont(new Font("TimesNewFoman",Font.BOLD,25));
        g2d.drawString("YOUR RECTANGLE IS DRAWN", 200, 30);
        int r = random.nextInt(256);
        int c = random.nextInt(256);
        int b = random.nextInt(256);
        g2d.setStroke(new BasicStroke(10));
        //g2d.setPaint(new Color(r,c,b));
        g2d.setPaint(Color.BLUE);
        g2d.drawRect((785-(width*38))/2, (660-(height*38))/2,width*38,height*38);
        
    }
    
}
