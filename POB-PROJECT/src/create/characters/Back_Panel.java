package create.characters;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.SwingConstants;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import com.jgoodies.forms.factories.DefaultComponentFactory;

import javax.swing.ImageIcon;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Back_Panel extends JPanel {
	JLabel background_label = new JLabel("New label");

	Main_Menu_Panel Main_Menu_Penel_object = new Main_Menu_Panel();

	public Back_Panel() {
		setLayout(null);

		JButton Back_button = new JButton("MENU");
		Back_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Back_button.setVisible(false);
				Main_Menu_Penel_object.setBounds(0, 0, 800, 600);

			}
		});

		Back_button.setBounds(543, 487, 225, 62);
		add(Back_button);
		add(Main_Menu_Penel_object);

		background_label.setIcon(new ImageIcon(Author_Panel.class
				.getResource("/create/characters/img/background_mario.gif")));
		background_label.setBounds(-6, 0, 800, 600);

	}
}
