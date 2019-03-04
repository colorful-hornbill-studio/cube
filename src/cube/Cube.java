package cube;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.geom.GeneralPath;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Cube extends JPanel {
    private static final GeneralPath CUBE_1 = new GeneralPath();
    private static final GeneralPath CUBE_2 = new GeneralPath();
    private static final GeneralPath CUBE_3 = new GeneralPath();
    private static final GeneralPath CUBE_4 = new GeneralPath();
    private static final GeneralPath CUBE_5 = new GeneralPath();
    private static final GeneralPath CUBE_6 = new GeneralPath();
    
    public Cube() {
        this.setPreferredSize(new Dimension(1200, 700));
    }

    protected void paintComponent(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;
        
        g2D.setColor(Color.RED);
        
        CUBE_1.moveTo(100, 500);
        CUBE_1.lineTo(100, 200);
        CUBE_1.lineTo(500, 200);
        CUBE_1.lineTo(500, 500);
        CUBE_1.closePath();
        
        g2D.fill(CUBE_1);

        g2D.setColor(Color.ORANGE);
        CUBE_2.moveTo(100, 200);
        CUBE_2.lineTo(200, 100);
        CUBE_2.lineTo(600, 100);
        CUBE_2.lineTo(500, 200);
        CUBE_2.closePath();
        
        g2D.fill(CUBE_2);
        
        g2D.setColor(Color.YELLOW);
        
        CUBE_3.moveTo(500, 200);
        CUBE_3.lineTo(600, 100);
        CUBE_3.lineTo(600, 400);
        CUBE_3.lineTo(500, 500);
        CUBE_3.closePath();
        
        g2D.fill(CUBE_3);

        g2D.setColor(Color.BLUE);
        
        CUBE_4.moveTo(700, 200);
        CUBE_4.lineTo(900, 400);
        CUBE_4.lineTo(900, 700);
        CUBE_4.lineTo(700, 500);
        CUBE_4.closePath();
        
        g2D.fill(CUBE_4);

        g2D.setColor(Color.CYAN);
        
        CUBE_5.moveTo(700, 200);
        CUBE_5.lineTo(900, 0);
        CUBE_5.lineTo(1100, 200);
        CUBE_5.lineTo(900, 400);
        CUBE_5.closePath();

        g2D.fill(CUBE_5);
        
        g2D.setColor(Color.GREEN);
        
        CUBE_6.moveTo(900, 400);
        CUBE_6.lineTo(1100, 200);
        CUBE_6.lineTo(1100, 500);
        CUBE_6.lineTo(900, 700);
        CUBE_6.closePath();

        g2D.fill(CUBE_6);
    }

    public static void main(String[] args) {
        JFrame window = new JFrame();
        
        window.setContentPane(new Cube());
        window.pack();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
}
