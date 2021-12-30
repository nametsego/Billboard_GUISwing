package AntiElite.com;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;


public class Main {

    public static void main(String[] args) {
	// write your code here
        ImageIcon image = new ImageIcon("coffee.png");
        Border border = BorderFactory.createLineBorder(Color.blue,3);

        JLabel label = new JLabel();
        label.setText("I love Java beyond measure!");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(new Color(0x00FF00));
        label.setFont(new Font("MV Boli",Font.PLAIN,20));
        label.setIconTextGap(30);
        label.setBackground(Color.gray);
        label.setOpaque(true);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(100,100,350,350);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);
    }
}
