//import javax.swing.Action;
import javax.swing.BorderFactory;
//import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DrawFrame extends JFrame implements ActionListener {
    DrawPanel panel;
    JButton button;
    JButton Circlebutton;
    JButton rectanglebutton;
    JButton trianglebutton;
    JButton ovalbutton;
    JButton squarebutton;
    JButton clearbutton;
    JButton exitbutton;
    circle cir;
    rectangle rec;
    triangle tri;
    oval ova;
    square sqr;

    public DrawFrame(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(900,680);
        this.setTitle("LETS DRAW SHAPES");
        this.setLayout(null);

        //ImageIcon icon = new ImageIcon("icon.png");
        button = new JButton();
        button.setText("COLOR");
        button.setSize(100,50);
        button.setLocation(0,0);
        button.setForeground(Color.WHITE);
        button.setBackground(new Color(110,255,255));
        //button.setIcon(icon);
        //button.setHorizontalTextPosition(JButton.CENTER);
        //button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFocusable(false);
        button.setBorder(BorderFactory.createEmptyBorder());
        button.addActionListener(this);


        rectanglebutton = new JButton();
        rectanglebutton = new JButton();
        rectanglebutton.setText("RECTANGLE");
        rectanglebutton.setSize(100,50);
        rectanglebutton.setLocation(0,70);
        rectanglebutton.setForeground(Color.WHITE);
        rectanglebutton.setBackground(Color.GREEN);
        rectanglebutton.setFocusable(false);
        rectanglebutton.addActionListener(this);
        
        Circlebutton = new JButton();
        Circlebutton.setText("CIRCLE");
        Circlebutton.setSize(100,50);
        Circlebutton.setLocation(0,140);
        Circlebutton.setForeground(Color.WHITE);
        Circlebutton.setBackground(Color.BLUE);
        Circlebutton.setFocusable(false);
        Circlebutton.addActionListener(this);

        trianglebutton = new JButton();
        trianglebutton.setText("TRIANGLE");
        trianglebutton.setSize(100,50);
        trianglebutton.setLocation(0,210);
        trianglebutton.setFocusable(false);
        trianglebutton.addActionListener(this);

        ovalbutton = new JButton();
        ovalbutton.setText("OVAL");
        ovalbutton.setSize(100,50);
        ovalbutton.setLocation(0,280);
        ovalbutton.setForeground(Color.WHITE);
        ovalbutton.setBackground(Color.ORANGE);
        ovalbutton.setFocusable(false);
        ovalbutton.addActionListener(this);

        squarebutton = new JButton();
        squarebutton.setText("SQUARE");
        squarebutton.setSize(100,50);
        squarebutton.setLocation(0,350);
        squarebutton.setForeground(Color.WHITE);
        squarebutton.setBackground(Color.CYAN);
        squarebutton.setFocusable(false);
        squarebutton.addActionListener(this);

        clearbutton = new JButton();
        clearbutton.setText("CLEAR");
        clearbutton.setSize(100,50);
        clearbutton.setLocation(0,420);
        clearbutton.setForeground(Color.WHITE);
        clearbutton.setBackground(Color.MAGENTA);
        clearbutton.setFocusable(false);
        clearbutton.addActionListener(this);

        exitbutton = new JButton();
        exitbutton.setText("EXIT");
        exitbutton.setSize(100,50);
        exitbutton.setLocation(0,490);
        exitbutton.setForeground(Color.WHITE);
        exitbutton.setBackground(Color.RED);
        exitbutton.setFocusable(false);
        exitbutton.addActionListener(this);

        panel = new DrawPanel();

        this.add(button);
        this.add(rectanglebutton);
        this.add(Circlebutton);
        this.add(trianglebutton);
        this.add(ovalbutton);
        this.add(squarebutton);
        this.add(clearbutton);
        this.add(exitbutton);
        this.add(panel);

        this.setVisible(true);


    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==button){
            this.remove(panel);
            panel = new DrawPanel();
            this.add(panel);
            SwingUtilities.updateComponentTreeUI(this);
        }
        else if(e.getSource()==Circlebutton){
            this.remove(panel);
            this.remove(rec);
            cir = new circle();
            this.add(cir);
            SwingUtilities.updateComponentTreeUI(this);
        }
        else if(e.getSource()==rectanglebutton){
            this.remove(panel);
            //this.remove(cir);
            rec = new rectangle();
            this.add(rec);
            SwingUtilities.updateComponentTreeUI(this);
        }
        else if(e.getSource()==trianglebutton){
            this.remove(panel);
            //this.remove(cir);
            tri = new triangle();
            this.add(tri);
            SwingUtilities.updateComponentTreeUI(this);
        }
        else if(e.getSource()==ovalbutton){
            this.remove(panel);
            //this.remove(cir);
            ova = new oval();
            this.add(ova);
            SwingUtilities.updateComponentTreeUI(this);
        }
        else if(e.getSource()==squarebutton){
            this.remove(panel);
            //this.remove(cir);
            sqr = new square();
            this.add(sqr);
            SwingUtilities.updateComponentTreeUI(this);
        }
        else if(e.getSource()==clearbutton){
            this.remove(panel);
            //this.remove(sqr);
            SwingUtilities.updateComponentTreeUI(this);
        }
        else if(e.getSource()==exitbutton){
            for(int i=0; i<6;i++){
            this.remove(panel);
            panel = new DrawPanel();
            this.add(panel);
            SwingUtilities.updateComponentTreeUI(this);
            }
            JOptionPane.showMessageDialog(null, "         BYE 👋🙋‍♂️🙋‍♀️\n   WELCOME NEXT TIME FOR FUN");
            System.exit(0);
        }
    }
    
}
