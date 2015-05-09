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
import javax.swing.JOptionPane;
import java.awt.Panel;
import java.awt.Color;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.ImageIcon;

public class Main_menu extends JFrame {

	private JPanel contentPane;
	// OBIEKT CLASY ZAINICJOWAÆ NA POCZATKU
	JLabel background_mario_label = DefaultComponentFactory.getInstance().createTitle("New JGoodies title");

	Main_Menu_Panel main_panel_object = new Main_Menu_Panel();
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
		setBounds(100, 100, 800, 600);
		// TUTAJ TRZEBA DODAC CONENT PANE
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		// ////////////////
		setContentPane(contentPane);

		JButton Start_Button = new JButton(
				"COŒ W STYLU  KLIKNIJ ABY PRZEJSC DO TWORZENIA POSTACI");
		Start_Button.setBounds(105, 179, 588, 163);
		Start_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				main_panel_object.setBounds(0, 0, 800, 600);
				Start_Button.setVisible(false);
				

			}
		});
		contentPane.setLayout(null);
		contentPane.add(Start_Button);
		contentPane.add(main_panel_object);
		
		JLabel background_mario_label = DefaultComponentFactory.getInstance().createTitle("New JGoodies title");
		background_mario_label.setIcon(new ImageIcon(Main_menu.class.getResource("/create/characters/img/background_mario.gif")));
		background_mario_label.setBounds(-6, 0, 800, 600);
		contentPane.add(background_mario_label);
		// WA¯NE CONTENT PANE.ADD JPANEL
		
		
	}
}
