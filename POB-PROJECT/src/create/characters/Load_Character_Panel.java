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
	 public static void main(String[] args){

	ObjectInputStream lc;
	try {
		lc = new ObjectInputStream(new FileInputStream("Characters.dat"));
		try {
			System.out.println(lc.readObject());
			System.out.println(lc.readObject().getClass());
			Orc_Warrior character = ( Orc_Warrior ) lc.readObject();
			character.ShowInfo();
			lc.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	//Load_Character character = ( Load_Character ) lc.readObject();
//	character.ShowInfo();
}
		

	public Load_Character_Panel() {
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
