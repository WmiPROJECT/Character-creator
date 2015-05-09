package create.characters;

import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Main_Menu_Panel extends JPanel {
	
	New_Character_Panel New_Character_panel_object = new New_Character_Panel();
	/**
	 * Create the panel.
	 */
	public Main_Menu_Panel() {
		setLayout(null);
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_1.setBounds(317, 216, 266, 102);
		add(btnNewButton_1);
		
		JButton Exit_button = new JButton("EXIT");
		Exit_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		Exit_button.setBounds(317, 358, 266, 102);
		add(Exit_button);
		
		JButton New_Character_button = new JButton("New Character");
		New_Character_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				New_Character_panel_object.setBounds(0, 0, 800, 600);
				New_Character_button.setVisible(false);
				Exit_button.setVisible(false);
				btnNewButton_1.setVisible(false);
				
				
			}
		});
		New_Character_button.setBounds(317, 76, 266, 102);
		add(New_Character_button);
		
		
		
		
		
		
		add(New_Character_panel_object);

	}
}
