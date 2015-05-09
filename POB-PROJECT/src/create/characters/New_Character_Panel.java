package create.characters;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class New_Character_Panel extends JPanel {
	private JTextField Name_textfiled;

	/**
	 * Create the panel.
	 */
	public New_Character_Panel() {
		setLayout(null);
		
		Name_textfiled = new JTextField();
		Name_textfiled.setBounds(354, 52, 189, 42);
		add(Name_textfiled);
		Name_textfiled.setColumns(10);
		
		JButton Save_button = new JButton("SAVE");
		Save_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		Save_button.setBounds(151, 515, 565, 55);
		add(Save_button);
		
		JLabel Name_label = new JLabel("Name:");
		Name_label.setFont(new Font("Tahoma", Font.PLAIN, 19));
		Name_label.setHorizontalAlignment(SwingConstants.RIGHT);
		Name_label.setBounds(251, 55, 93, 28);
		add(Name_label);

	}

}
