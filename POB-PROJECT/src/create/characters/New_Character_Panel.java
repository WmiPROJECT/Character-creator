package create.characters;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class New_Character_Panel extends Back_Panel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public New_Character_Panel() {

		Main_Menu_Panel Main_Menu_Penel_object = new Main_Menu_Panel();
		JButton Back_button = new JButton("Back to MENU");
		JButton btnOrc = new JButton("ORC");
		JButton btnHuman = new JButton("HUMAN");

		btnOrc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				New_Orc_Panel New_Orc_Panel_object = new New_Orc_Panel();
				New_Orc_Panel_object.setBounds(0, 0, 800, 600);

				btnOrc.setVisible(false);
				Back_button.setVisible(false);
				btnHuman.setVisible(false);

				background_label.setVisible(false);

				add(New_Orc_Panel_object);

			}
		});
		btnOrc.setBounds(95, 229, 150, 100);

		btnHuman.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				New_Human_Panel New_Human_Panel_object = new New_Human_Panel();
				New_Human_Panel_object.setBounds(0, 0, 800, 600);
				
				btnOrc.setVisible(false);
				btnHuman.setVisible(false);
				Back_button.setVisible(false);
				
				background_label.setVisible(false);
				
				add(New_Human_Panel_object);

			}
		});
		btnHuman.setBounds(530, 229, 150, 100);

		Back_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnOrc.setVisible(false);
				btnHuman.setVisible(false);
				Back_button.setVisible(false);
				background_label.setVisible(false);
				Main_Menu_Penel_object.setBounds(0, 0, 800, 600);

			}
		});
		Back_button.setBounds(468, 438, 240, 93);

		add(Back_button);
		add(btnOrc);
		add(btnHuman);
		add(Main_Menu_Penel_object);
		add(super.background_label);

	}
}
