package create.characters;

import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class Main_Menu_Panel extends JPanel {

	JButton Edit_Character_button = new JButton("Edit Character");
	JButton New_Character_button = new JButton("New Character");
	JButton Load_Character_button = new JButton("Load Character");
	JButton Exit_button = new JButton("EXIT");
	JButton Author_button = new JButton("Author");

	JLabel background_mario_label = new JLabel("New label");

	/**
	 * Create the panel.
	 */
	public Main_Menu_Panel() {
		setBorder(null);
		setLayout(null);
		Load_Character_button.setBounds(467, 205, 266, 60);

		Load_Character_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Load_Character_Panel Load_Character_Panel_object = new Load_Character_Panel();
				Load_Character_Panel_object.setBounds(0, 0, 800, 600);
				New_Character_button.setVisible(false);
				Exit_button.setVisible(false);
				Load_Character_button.setVisible(false);
				Author_button.setVisible(false);
				Edit_Character_button.setVisible(false);
				background_mario_label.setVisible(false);
				add(Load_Character_Panel_object);

			}
		});
		add(Load_Character_button);
		
		Exit_button.setBounds(467, 486, 266, 60);

		Exit_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		add(Exit_button);
		
		Author_button.setBounds(467, 394, 266, 63);
		Author_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Author_Panel Author_Panel_object = new Author_Panel();
				Author_Panel_object.setBounds(0, 0, 800, 600);
				New_Character_button.setVisible(false);
				Exit_button.setVisible(false);
				Load_Character_button.setVisible(false);
				Author_button.setVisible(false);
				Edit_Character_button.setVisible(false);
				background_mario_label.setVisible(false);
				add(Author_Panel_object);
			}
		});
		add(Author_button);
		
		Edit_Character_button.setBounds(467, 303, 266, 65);
		Edit_Character_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Edit_Character_Panel Edit_Character_Panel_object = new Edit_Character_Panel();
				Edit_Character_Panel_object.setBounds(0, 0, 800, 600);
				New_Character_button.setVisible(false);
				Exit_button.setVisible(false);
				Load_Character_button.setVisible(false);
				Author_button.setVisible(false);
				Edit_Character_button.setVisible(false);
				background_mario_label.setVisible(false);
				add(Edit_Character_Panel_object);
			}
		});
		add(Edit_Character_button);
		
		New_Character_button.setBounds(467, 108, 266, 60);
		New_Character_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				New_Character_Panel New_Character_panel_object = new New_Character_Panel();
				New_Character_panel_object.setBounds(0, 0, 800, 600);
				New_Character_button.setVisible(false);
				Exit_button.setVisible(false);
				Load_Character_button.setVisible(false);
				Author_button.setVisible(false);
				Edit_Character_button.setVisible(false);
				background_mario_label.setVisible(false);
				add(New_Character_panel_object);
			}
		});

		background_mario_label.setHorizontalAlignment(SwingConstants.CENTER);
		background_mario_label.setIcon(new ImageIcon(Main_Menu_Panel.class
				.getResource("/create/characters/img/background_mario.gif")));
		background_mario_label.setBounds(0, 0, 800, 600);
		add(New_Character_button);

		add(background_mario_label);

	}
}
