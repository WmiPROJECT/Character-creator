package create.characters;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class Edit_Character_Panel extends Back_Panel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField NameField;

	public Edit_Character_Panel() throws IOException {
		
		JLabel lblNickname = new JLabel("");
		lblNickname.setHorizontalAlignment(SwingConstants.CENTER);
		lblNickname.setFont(new Font("Century Gothic", Font.BOLD, 15));	
		JLabel lblWeapon = new JLabel("");
		lblWeapon.setHorizontalAlignment(SwingConstants.CENTER);
		lblWeapon.setFont(new Font("Century Gothic", Font.BOLD, 15));
		JLabel lblArmor = new JLabel("");
		lblArmor.setHorizontalAlignment(SwingConstants.CENTER);
		lblArmor.setFont(new Font("Century Gothic", Font.BOLD, 15));
		JLabel lblSkill = new JLabel("");
		lblSkill.setHorizontalAlignment(SwingConstants.CENTER);
		lblSkill.setFont(new Font("Century Gothic", Font.BOLD, 15));
		JLabel lblNickname_1 = new JLabel("Name:");
		JLabel lblWeapon_1 = new JLabel("Weapon:");
		JLabel lblArmor_1 = new JLabel("Armor:");
		JLabel lblSkill_1 = new JLabel("Skill:");
		JButton btnWeaponPrev = new JButton("<");

		JButton btnSelectedValueJList = new JButton("Select");
		
		BufferedReader in = null;
		String line;
		DefaultListModel listModel = new DefaultListModel();
		try {
			in = new BufferedReader(new FileReader("characters.txt"));
			while ((line = in.readLine()) != null) {
				listModel.addElement(line);
			}
		} catch (IOException ex) {
			System.out.println("IOException");
		} finally {
			if (in != null) {
				in.close();
			}
		}

		JList list = new JList(listModel);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setBounds(10, 11, 187, 578);

		add(list);

		btnSelectedValueJList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String selected = (String) list.getSelectedValue();
				String selected_class = "";
				String selected_race = "";
				// --------------------------------------------------------
				// Class
				boolean check = false;
				int firstspace = 0;
				for (int i = selected.length() - 1; i > 0; i--) {
					char c = selected.charAt(i);
					if (c == ' ' && check == true) {
						for (int j = i + 1; j < firstspace; j++) {
							c = selected.charAt(j);
							selected_race = selected_race + c;
						}
						break;
					}
					if (c == ' ') {
						check = true;
						firstspace = i;
					}
				}
				// --------------------------------------------------------
				// Class
				for (int i = selected.length() - 1; i > 0; i--) {
					char c = selected.charAt(i);
					if (c == ' ') {
						for (int j = i + 1; j < selected.length(); j++) {
							c = selected.charAt(j);
							selected_class = selected_class + c;
						}
						break;
					}
				}
				// --------------------------------------------------------
				// Nick
				String nick = "";
				for (int i = 0; i < selected.length(); i++) {
					char c = selected.charAt(i);
					if (selected.charAt(i) == ' ' && selected.charAt(i+1) == '-')
						break;
					nick = nick + c;
				}
				// --------------------------------------------------------
				// main loop
				if (selected_class.equals("Warrior")
						&& selected_race.equals("Orc")) {
					ObjectInputStream ois;
					try {
						ois = new ObjectInputStream(new FileInputStream(
								"CharactersDB\\" + nick + ".dat"));
						Orc_Warrior test_orc = (Orc_Warrior) ois.readObject();
						ois.close();
						lblNickname.setText(test_orc.nickname);
						lblWeapon.setText(test_orc.weapon);
						lblArmor.setText(test_orc.armor);
						lblSkill.setText(test_orc.skill);
					} catch (FileNotFoundException e) {
						System.out.println("not found");
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						System.out.println("IOE");

						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						System.out.println("Classnotfound");

						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				} else if (selected_class.equals("Mage")
						&& selected_race.equals("Orc")) {
					ObjectInputStream ois;
					try {
						ois = new ObjectInputStream(new FileInputStream(
								"CharactersDB\\" + nick + ".dat"));
						Orc_Mage test_orc = (Orc_Mage) ois.readObject();
						ois.close();
						lblNickname.setText(test_orc.nickname);
						lblWeapon.setText(test_orc.weapon);
						lblArmor.setText(test_orc.armor);
						lblSkill.setText(test_orc.skill);
	
					} catch (FileNotFoundException e) {
						System.out.println("not found");
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						System.out.println("IOE");

						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						System.out.println("Classnotfound");

						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} else if (selected_class.equals("Ranger")
						&& selected_race.equals("Orc")) {
					ObjectInputStream ois;
					try {
						ois = new ObjectInputStream(new FileInputStream(
								"CharactersDB\\" + nick + ".dat"));
						Orc_Ranger test_orc = (Orc_Ranger) ois.readObject();
						ois.close();
						lblNickname.setText(test_orc.nickname);
						lblWeapon.setText(test_orc.weapon);
						lblArmor.setText(test_orc.armor);
						lblSkill.setText(test_orc.skill);
					} catch (FileNotFoundException e) {
						System.out.println("not found");
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						System.out.println("IOE");

						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						System.out.println("Classnotfound");

						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				} else if (selected_class.equals("Warrior")
						&& selected_race.equals("Human")) {
					ObjectInputStream ois;
					try {
						ois = new ObjectInputStream(new FileInputStream(
								"CharactersDB\\" + nick + ".dat"));
						Human_Warrior test_orc = (Human_Warrior) ois
								.readObject();
						ois.close();
						lblNickname.setText(test_orc.nickname);
						lblWeapon.setText(test_orc.weapon);
						lblArmor.setText(test_orc.armor);
						lblSkill.setText(test_orc.skill);

					} catch (FileNotFoundException e) {
						System.out.println("not found");
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						System.out.println("IOE");

						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						System.out.println("Classnotfound");

						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				} else if (selected_class.equals("Mage")
						&& selected_race.equals("Human")) {
					ObjectInputStream ois;
					try {
						ois = new ObjectInputStream(new FileInputStream(
								"CharactersDB\\" + nick + ".dat"));
						Human_Mage test_orc = (Human_Mage) ois.readObject();
						ois.close();
						lblNickname.setText(test_orc.nickname);
						lblWeapon.setText(test_orc.weapon);
						lblArmor.setText(test_orc.armor);
						lblSkill.setText(test_orc.skill);

					} catch (FileNotFoundException e) {
						System.out.println("not found");
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						System.out.println("IOE");

						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						System.out.println("Classnotfound");

						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} else if (selected_class.equals("Ranger")
						&& selected_race.equals("Human")) {
					ObjectInputStream ois;
					try {
						ois = new ObjectInputStream(new FileInputStream(
								"CharactersDB\\" + nick + ".dat"));
						Human_Ranger test_orc = (Human_Ranger) ois.readObject();
						ois.close();
						lblNickname.setText(test_orc.nickname);
						lblWeapon.setText(test_orc.weapon);
						lblArmor.setText(test_orc.armor);
						lblSkill.setText(test_orc.skill);

					} catch (FileNotFoundException e) {
						System.out.println("not found");
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						System.out.println("IOE");

						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						System.out.println("Classnotfound");

						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				} else {
					System.out.println("ERROR");
				}

			}

		});
		btnSelectedValueJList.setBounds(513, 506, 277, 36);
		add(btnSelectedValueJList);

		lblNickname.setForeground(Color.WHITE);
		lblNickname.setBounds(335, 208, 176, 22);
		add(lblNickname);

		lblWeapon.setForeground(Color.WHITE);
		lblWeapon.setBounds(335, 241, 176, 22);
		add(lblWeapon);

		lblArmor.setForeground(Color.WHITE);
		lblArmor.setBounds(335, 274, 176, 22);
		add(lblArmor);

		lblSkill.setForeground(Color.WHITE);
		lblSkill.setBounds(335, 307, 176, 22);
		add(lblSkill);


		lblNickname_1.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		lblNickname_1.setForeground(Color.WHITE);
		lblNickname_1.setBounds(229, 208, 109, 22);
		add(lblNickname_1);

		lblWeapon_1.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		lblWeapon_1.setForeground(Color.WHITE);
		lblWeapon_1.setBounds(229, 241, 109, 22);
		add(lblWeapon_1);

		lblArmor_1.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		lblArmor_1.setForeground(Color.WHITE);
		lblArmor_1.setBounds(229, 274, 109, 22);
		add(lblArmor_1);

		lblSkill_1.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		lblSkill_1.setForeground(Color.WHITE);
		lblSkill_1.setBounds(229, 307, 109, 22);
		add(lblSkill_1);

	

		NameField = new JTextField();
		NameField.setBounds(547, 208, 122, 20);
		add(NameField);
		NameField.setColumns(10);
		
		JButton btnChangeName = new JButton("Change");
		btnChangeName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNickname.setText(NameField.getText());
			}
		});
		btnChangeName.setBounds(679, 208, 82, 22);
		add(btnChangeName);
		
		JButton btnSave = new JButton("SAVE");
		btnSave.setBounds(513, 459, 277, 36);
		add(btnSave);
		
		btnWeaponPrev.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (lblWeapon.getText().equals("Sword")) {
					lblWeapon.setText("Axe");
				} else if (lblWeapon.getText().equals("Axe")) {
					lblWeapon.setText("Club");
				} else if (lblWeapon.getText().equals("Club")) {
					lblWeapon.setText("Sword");
				} else if (lblWeapon.getText().equals("Wand")) {
					lblWeapon.setText("Staff");
				} else if (lblWeapon.getText().equals("Staff")) {
					lblWeapon.setText("Rod");
				} else if (lblWeapon.getText().equals("Rod")) {
					lblWeapon.setText("Wand");
				} else if (lblWeapon.getText().equals("Crossbow")) {
					lblWeapon.setText("Bow");
				} else if (lblWeapon.getText().equals("Bow")) {
					lblWeapon.setText("Spear");
				} else if (lblWeapon.getText().equals("Spear")) {
					lblWeapon.setText("Crossbow");
				}
			}
		});
		btnWeaponPrev.setBounds(547, 241, 56, 22);
		add(btnWeaponPrev);
		
		JButton btnArmorPrev = new JButton("<");
		btnArmorPrev.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (lblArmor.getText().equals("Plate")) {
					lblArmor.setText("Dark");
				} else if (lblArmor.getText().equals("Dark")) {
					lblArmor.setText("Golden");
				} else if (lblArmor.getText().equals("Golden")) {
					lblArmor.setText("Plate");
				} else if (lblArmor.getText().equals("Robe")) {
					lblArmor.setText("Coat");
				} else if (lblArmor.getText().equals("Coat")) {
					lblArmor.setText("Cape");
				} else if (lblArmor.getText().equals("Cape")) {
					lblArmor.setText("Robe");
				} else if (lblArmor.getText().equals("Paladin")) {
					lblArmor.setText("Yalahar");
				} else if (lblArmor.getText().equals("Yalahar")) {
					lblArmor.setText("Master Archer's");
				} else if (lblArmor.getText().equals("Master Archer's")) {
					lblArmor.setText("Paladin");
				}
			}
		});
		btnArmorPrev.setBounds(547, 274, 56, 22);
		add(btnArmorPrev);
		
		JButton btnSkillPrev = new JButton("<");
		btnSkillPrev.setBounds(547, 307, 56, 22);
		add(btnSkillPrev);
		
		JButton btnWeaponNext = new JButton(">");
		btnWeaponNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (lblWeapon.getText().equals("Sword")) {
					lblWeapon.setText("Club");
				} else if (lblWeapon.getText().equals("Club")) {
					lblWeapon.setText("Axe");
				} else if (lblWeapon.getText().equals("Axe")) {
					lblWeapon.setText("Sword");
				}else if (lblWeapon.getText().equals("Wand")) {
					lblWeapon.setText("Rod");
				} else if (lblWeapon.getText().equals("Rod")) {
					lblWeapon.setText("Staff");
				} else if (lblWeapon.getText().equals("Staff")) {
					lblWeapon.setText("Wand");
				} else if (lblWeapon.getText().equals("Crossbow")) {
					lblWeapon.setText("Spear");
				} else if (lblWeapon.getText().equals("Spear")) {
					lblWeapon.setText("Bow");
				} else if (lblWeapon.getText().equals("Bow")) {
					lblWeapon.setText("Crossbow");
				}
			}
		});
		btnWeaponNext.setBounds(613, 241, 56, 22);
		add(btnWeaponNext);
		
		JButton btnArmorNext = new JButton(">");
		btnArmorNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (lblArmor.getText().equals("Plate")) {
					lblArmor.setText("Golden");
				} else if (lblArmor.getText().equals("Golden")) {
					lblArmor.setText("Dark");
				} else if (lblArmor.getText().equals("Dark")) {
					lblArmor.setText("Plate");
				} else if (lblArmor.getText().equals("Robe")) {
					lblArmor.setText("Cape");
				} else if (lblArmor.getText().equals("Cape")) {
					lblArmor.setText("Coat");
				} else if (lblArmor.getText().equals("Coat")) {
					lblArmor.setText("Robe");
				} else if (lblArmor.getText().equals("Paladin")) {
					lblArmor.setText("Master Archer's");
				} else if (lblArmor.getText().equals("Master Archer's")) {
					lblArmor.setText("Yalahar");
				} else if (lblArmor.getText() == "Yalahar") {
					lblArmor.setText("Paladin");
				}
			}
		});
		btnArmorNext.setBounds(613, 274, 56, 22);
		add(btnArmorNext);
		
		JButton btnSkillNext = new JButton(">");
		btnSkillNext.setBounds(613, 307, 56, 22);
		add(btnSkillNext);
		
		JButton Back_button = new JButton("Back to MENU");
		Back_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			btnWeaponPrev.setVisible(false);
			btnWeaponNext.setVisible(false);
			btnArmorPrev.setVisible(false);
			btnArmorNext.setVisible(false);
			btnSkillPrev.setVisible(false);
			btnSkillNext.setVisible(false);
			Back_button.setVisible(false);
			list.setVisible(false);
			btnChangeName.setVisible(false);
			btnSave.setVisible(false);
			btnSelectedValueJList.setVisible(false);
			NameField.setVisible(false);
			lblNickname.setVisible(false);
			lblWeapon.setVisible(false);
			lblArmor.setVisible(false);
			lblSkill.setVisible(false);
			lblNickname_1.setVisible(false);
			lblWeapon_1.setVisible(false);
			lblArmor_1.setVisible(false);
			lblSkill_1.setVisible(false);
			
			Main_Menu_Penel_object.setBounds(0, 0, 800, 600);	
				
			}
		});
		Back_button.setBounds(513, 553, 277, 36);
		add(Main_Menu_Penel_object);
		add(Back_button);
		
		add(super.background_label);

	}
}
