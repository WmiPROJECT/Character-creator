package create.characters;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JSlider;
import javax.swing.JSeparator;
import javax.swing.JTree;
import javax.swing.JScrollBar;
import javax.swing.JList;

public class Author_Panel extends Back_Panel {

	public Author_Panel() {

		JLabel Information_label = new JLabel("Authors: SMOCZY & ORTE");
		Information_label.setForeground(Color.MAGENTA);
		Information_label.setFont(new Font("Tahoma", Font.BOLD, 25));
		Information_label.setBounds(225, 199, 420, 71);
		add(Information_label);
		add(super.background_label);
	}
}