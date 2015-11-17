package praktikum1;


import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class AkenNaidis {
    
    public static void main(String[] args) {
        
        JFrame aken = new JFrame("Naidis");
        aken.setSize(300, 200);
        aken.setLayout(new GridLayout(2, 1));
        aken.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      

        JTextField vali = new JTextField();
        vali.setText("Tere!");
        vali.setFont(new Font(Font.MONOSPACED, Font.ITALIC, 30));
        aken.add(vali);
        
        JButton nupp = new JButton("Kasva suureks!");
        aken.add(nupp);
        aken.setVisible(true);
        nupp.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
//        		vali.getText().toUpperCase();
        		vali.setText(vali.getText().toUpperCase());
        		Font font = vali.getFont();
        		vali.setFont(new Font(font.getName(), font.getStyle(), font.getSize() + 1));
        	}
        });
        
    }
}