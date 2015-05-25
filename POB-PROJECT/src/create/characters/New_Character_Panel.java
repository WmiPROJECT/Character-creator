package create.characters;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;


public class New_Character_Panel extends Back_Panel {
	
	JButton Knight_button = new JButton("KNIGHT");


	public New_Character_Panel() {
		Knight_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Knight_Panel Knight_Panel_Object = new Knight_Panel();
				Knight_Panel_Object.setBounds(0, 0, 800, 600);
				Knight_button.setVisible(false);
				
			}
		});
	
		
		Knight_button.setBounds(41, 215, 118, 67);
		add(Knight_button);
		
		add(super.background_label);

	}
}
