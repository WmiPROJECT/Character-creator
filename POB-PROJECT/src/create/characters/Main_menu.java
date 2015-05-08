package create.characters;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Main_menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main_menu frame = new Main_menu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main_menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 651, 463);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton New_Character_Button = new JButton("New Character");
		New_Character_Button.setBounds(200, 48, 220, 76);
		New_Character_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		contentPane.setLayout(null);
		contentPane.add(New_Character_Button);
		
		JButton Load_Character_Button = new JButton("Load Character");
		Load_Character_Button.setBounds(200, 135, 220, 76);
		contentPane.add(Load_Character_Button);
		
		JButton Edit_Character_Button = new JButton("Edit Character");
		Edit_Character_Button.setBounds(200, 222, 220, 76);
		contentPane.add(Edit_Character_Button);
		
		JButton Exit_Button = new JButton("Exit");
		Exit_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Exit_Button.setBounds(200, 309, 220, 76);
		contentPane.add(Exit_Button);
	}
}
