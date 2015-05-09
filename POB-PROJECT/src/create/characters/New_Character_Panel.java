package create.characters;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenu;
import java.awt.Label;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.ImageIcon;

public class New_Character_Panel extends JPanel {
	private JTextField Name_textfiled;

	/**
	 * Create the panel.
	 */
	public New_Character_Panel() {
		setLayout(null);
		
		
		Name_textfiled = new JTextField();
		Name_textfiled.setFont(new Font("Tahoma", Font.BOLD, 10));
		Name_textfiled.setBounds(361, 523, 91, 20);
		add(Name_textfiled);
		Name_textfiled.setColumns(10);
		
		JButton Save_button = new JButton("SAVE");
		Save_button.setFont(new Font("Tahoma", Font.PLAIN, 9));
		Save_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		Save_button.setBounds(684, 525, 87, 12);
		add(Save_button);
		
		JLabel lblNewJgoodiesLabel = DefaultComponentFactory.getInstance().createLabel("New JGoodies label");
		lblNewJgoodiesLabel.setIcon(new ImageIcon(New_Character_Panel.class.getResource("/create/characters/img/background_WoW_8x6.jpg")));
		lblNewJgoodiesLabel.setBounds(0, 0, 800, 578);
		add(lblNewJgoodiesLabel);

	}
}