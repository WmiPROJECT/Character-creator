package create.characters;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import java.io.*;
public class Load_Character_Panel extends Back_Panel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		

	public Load_Character_Panel() throws FileNotFoundException, IOException, ClassNotFoundException {
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Characters.dat"));
		Orc_Warrior test_orc = ( Orc_Warrior )ois.readObject();	
		ois.close();
		test_orc.ShowInfo();
		
//		Load_Character test_load = ( Load_Character )ois.readObject();
//		ois.close();
//		test_load.ShowInfo();
		JButton Back_button = new JButton("Back to MENU");
		Back_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
			Back_button.setVisible(false);
			Main_Menu_Penel_object.setBounds(0, 0, 800, 600);	
				
			}
		});
		Back_button.setBounds(468, 438, 240, 93);
		add(Main_Menu_Penel_object);
		add(Back_button);
		add(super.background_label);
	}

}
