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

public class Main_menu extends JFrame {

	private JPanel contentPane;
	
	//OBIEKT CLASY ZAINICJOWA� NA POCZATKU
	Main_Menu_Panel main_panel_object = new  Main_Menu_Panel();
	
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
		//TUTAJ TRZEBA DODAC CONENT PANE
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		//////////////////
		setContentPane(contentPane);
		
		JButton Start_Button = new JButton("CO\u015A W STYLU  KLIKNIJ ABY PRZEJSC DO TWORZENIA POSTACI");
		Start_Button.setBounds(105, 179, 588, 163);
		Start_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				
			
				/*
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							New_Character_Menu frame = new New_Character_Menu();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
				
			*/	
				//W BUTTONIE USTAWIC BOUNDS ORAZ USUNAC STARY BUTTON
				main_panel_object.setBounds(0, 0, 800, 600);
				Start_Button.setVisible(false);
				
				
				
			}
		});
		contentPane.setLayout(null);
		contentPane.add(Start_Button);
	
		
		//WA�NE  CONTENT PANE.ADD JPANEL
		contentPane.add(main_panel_object);
		
		
		
	}
}