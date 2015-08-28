package in.jaxa.displayimg;


import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
/**
 * Created by Guu on 28/8/15.
 */
public class DisplayIMG {
    public static void main(String[] args) {
        Frame myframe=new MyFrame();
    }
}

class MyPanel extends Panel{
    private final Image screenImage=new BufferedImage(640,640,2);
    private final Graphics2D screenGraphics=(Graphics2D)screenImage.getGraphics();
    private Image backgroundImage;

    public MyPanel(){
        loadImage();
        setFocusable(true);
        setPreferredSize(new Dimension(640, 640));
        drawView();
    }

    private void loadImage(){
        ImageIcon icon=new ImageIcon(getClass().getResource("1.jpg"));
        backgroundImage=icon.getImage();
    }
    private void drawView(){
        screenGraphics.drawImage(backgroundImage,0,0,null);
    }
    public void paint(Graphics g){
        g.drawImage(screenImage,0,0,null);
    }
}

class MyFrame extends Frame{
    public MyFrame(){
        this.setTitle("Display an image");
        MyPanel panel=new MyPanel();
        this.add(panel);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        this.pack();
        this.setVisible(true);
    }
}