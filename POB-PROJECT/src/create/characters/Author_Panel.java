package create.characters;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;


public class Author_Panel extends Back_Panel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Author_Panel() {
		JButton Back_button = new JButton("");
		Back_button.setIcon(new ImageIcon(Author_Panel.class.getResource("/create/characters/img/Buttons/Return_off.png")));
		JLabel Information_label = new JLabel("Author: Denis  Olek");
		Information_label.setHorizontalAlignment(SwingConstants.CENTER);
		Information_label.setForeground(Color.WHITE);
		Information_label.setFont(new Font("LifeCraft", Font.BOLD, 40));
		Information_label.setBounds(0, 394, 1270, 71);
		Back_button.setBorderPainted(false); 
		Back_button.setContentAreaFilled(false); 
		Back_button.setFocusPainted(false); 
		Back_button.setOpaque(false);
		Back_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
			Back_button.setVisible(false);
			Main_Menu_Penel_object.setBounds(0, 0, 1280, 1024);	
				
			}
		});
		Back_button.setBounds(421, 632, 435, 109);
		add(Main_Menu_Penel_object);
		add(Back_button);
		add(Information_label);
		add(super.background_label);

	}
}
