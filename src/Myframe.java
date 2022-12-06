import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Myframe extends JFrame implements KeyListener {
    JLabel label;
    ImageIcon icon;

    Myframe(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);
        this.addKeyListener(this);
        this.setVisible(true);
        icon= new ImageIcon("roket.jpg");
        label =new JLabel();
        label.setBounds(0,0,100,100);
        this.getContentPane().setBackground(Color.black);
        label.setIcon(icon);
       // label.setBackground(Color.BLACK);
        //label.setOpaque(true);
        this.add(label);

    }



    @Override
    public void keyTyped(KeyEvent e) {

        switch (e.getKeyChar()){
            case 'a': label.setLocation(label.getX()-10,label.getY());
            break;
            case 'w': label.setLocation(label.getX(),label.getY()-10);
            break;
            case 's': label.setLocation(label.getX(),label.getY()+10);
            break;
            case 'd':label.setLocation(label.getX()+10,label.getY());
        }

    }

    @Override
    public void keyPressed(KeyEvent e) {


        switch (e.getKeyCode()){
            case 37: label.setLocation(label.getX()-10,label.getY());
                break;
            case 38: label.setLocation(label.getX(),label.getY()-10);
                break;
            case 39: label.setLocation(label.getX(),label.getY()+10);
                break;
            case 40:label.setLocation(label.getX()+10,label.getY());
        }


    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
