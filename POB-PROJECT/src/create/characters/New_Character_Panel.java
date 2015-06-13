package create.characters;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.ImageIcon;

public class New_Character_Panel extends Back_Panel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public New_Character_Panel() {

		Main_Menu_Panel Main_Menu_Penel_object = new Main_Menu_Panel();
		JButton Back_button = new JButton("");
		Back_button.setIcon(new ImageIcon(New_Character_Panel.class.getResource("/create/characters/img/Buttons/Return_off.png")));
		JButton btnOrc = new JButton("");
		btnOrc.setIcon(new ImageIcon(New_Character_Panel.class.getResource("/create/characters/img/3D-Orc.png")));
		JButton btnHuman = new JButton("");
		btnHuman.setIcon(new ImageIcon(New_Character_Panel.class.getResource("/create/characters/img/3D-Elf.png")));

		btnOrc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				New_Orc_Panel New_Orc_Panel_object = new New_Orc_Panel();
				New_Orc_Panel_object.setBounds(0, 0, 1280, 1024);

				btnOrc.setVisible(false);
				Back_button.setVisible(false);
				btnHuman.setVisible(false);

				background_label.setVisible(false);

				add(New_Orc_Panel_object);

			}
		});
		Back_button.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	Back_button.setIcon(new ImageIcon(New_Character_Panel.class.getResource("/create/characters/img/Buttons/Return_on.png")));
		    }

		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    	Back_button.setIcon(new ImageIcon(New_Character_Panel.class.getResource("/create/characters/img/Buttons/Return_off.png")));
		    }
		});
		Back_button.setBorderPainted(false); 
		Back_button.setContentAreaFilled(false); 
		Back_button.setFocusPainted(false); 
		Back_button.setOpaque(false);

		btnOrc.setBounds(40, 73, 551, 767);

		btnHuman.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				New_Human_Panel New_Human_Panel_object = new New_Human_Panel();
				New_Human_Panel_object.setBounds(0, 0, 1280, 1024);
				
				btnOrc.setVisible(false);
				btnHuman.setVisible(false);
				Back_button.setVisible(false);
				
				background_label.setVisible(false);
				
				add(New_Human_Panel_object);

			}
		});
		btnHuman.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	btnHuman.setIcon(new ImageIcon(New_Character_Panel.class.getResource("/create/characters/img/3D-ElfON.png")));
		    }

		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    	btnHuman.setIcon(new ImageIcon(New_Character_Panel.class.getResource("/create/characters/img/3D-Elf.png")));
		    }
		});
		btnHuman.setBorderPainted(false); 
		btnHuman.setContentAreaFilled(false); 
		btnHuman.setFocusPainted(false); 
		btnHuman.setOpaque(false);

		btnHuman.setBounds(600, 87, 551, 767);

		Back_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnOrc.setVisible(false);
				btnHuman.setVisible(false);
				Back_button.setVisible(false);
				background_label.setVisible(false);
				Main_Menu_Penel_object.setBounds(0, 0, 1280, 1024);

			}
		});
		btnOrc.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	btnOrc.setIcon(new ImageIcon(New_Character_Panel.class.getResource("/create/characters/img/3D-OrcON.png")));
		    }

		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    	btnOrc.setIcon(new ImageIcon(New_Character_Panel.class.getResource("/create/characters/img/3D-Orc.png")));
		    }
		});
		btnOrc.setBorderPainted(false); 
		btnOrc.setContentAreaFilled(false); 
		btnOrc.setFocusPainted(false); 
		btnOrc.setOpaque(false);
		Back_button.setBounds(880, 816, 400, 109);

		add(Back_button);
		add(btnOrc);
		add(btnHuman);
		add(Main_Menu_Penel_object);
		add(super.background_label);

	}
}
