package create.characters;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JSlider;
import javax.swing.JSeparator;
import javax.swing.JTree;
import javax.swing.JScrollBar;
import javax.swing.JList;

public class Author_Panel extends Back_Panel {

	public Author_Panel() {
		JButton Back_button = new JButton("Back to MENU");
		JLabel Information_label = new JLabel("Authors: SMOCZY & ORTE");
		Information_label.setForeground(Color.MAGENTA);
		Information_label.setFont(new Font("Tahoma", Font.BOLD, 25));
		Information_label.setBounds(225, 199, 420, 71);
		Back_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
			Back_button.setVisible(false);
			Main_Menu_Penel_object.setBounds(0, 0, 800, 600);	
				
			}
		});
		Back_button.setBounds(468, 438, 240, 93);
		add(Main_Menu_Penel_object);
		add(Back_button);
		add(Information_label);
		add(super.background_label);

	}
}
