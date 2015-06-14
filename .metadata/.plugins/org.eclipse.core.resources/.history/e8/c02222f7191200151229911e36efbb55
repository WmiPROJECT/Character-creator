package create.characters;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import java.io.*;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.ListSelectionModel;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.SystemColor;

public class Load_Character_Panel extends Back_Panel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Load_Character_Panel() throws FileNotFoundException, IOException,
			ClassNotFoundException {
		setForeground(Color.WHITE);

		JButton btnSelectedValueJList = new JButton("");
		btnSelectedValueJList.setIcon(new ImageIcon(Load_Character_Panel.class.getResource("/create/characters/img/Buttons/SelectOFF.png")));
		JLabel lblNickname = new JLabel("");
		lblNickname.setHorizontalAlignment(SwingConstants.CENTER);
		lblNickname.setFont(new Font("Century Gothic", Font.BOLD, 15));
		JLabel lblRace = new JLabel("");
		lblRace.setHorizontalAlignment(SwingConstants.CENTER);
		lblRace.setFont(new Font("Century Gothic", Font.BOLD, 15));
		JLabel lblClass = new JLabel("");
		lblClass.setHorizontalAlignment(SwingConstants.CENTER);
		lblClass.setFont(new Font("Century Gothic", Font.BOLD, 15));
		JLabel lblWeapon = new JLabel("");
		lblWeapon.setHorizontalAlignment(SwingConstants.CENTER);
		lblWeapon.setFont(new Font("Century Gothic", Font.BOLD, 15));
		JLabel lblArmor = new JLabel("");
		lblArmor.setHorizontalAlignment(SwingConstants.CENTER);
		lblArmor.setFont(new Font("Century Gothic", Font.BOLD, 15));
		JLabel lblSkill = new JLabel("");
		lblSkill.setHorizontalAlignment(SwingConstants.CENTER);
		lblSkill.setFont(new Font("Century Gothic", Font.BOLD, 15));
		JLabel lblMelee = new JLabel("");
		lblMelee.setHorizontalAlignment(SwingConstants.CENTER);
		lblMelee.setFont(new Font("Century Gothic", Font.BOLD, 15));
		JLabel lblMagic = new JLabel("");
		lblMagic.setHorizontalAlignment(SwingConstants.CENTER);
		lblMagic.setFont(new Font("Century Gothic", Font.BOLD, 15));
		JLabel lblRanged = new JLabel("");
		lblRanged.setHorizontalAlignment(SwingConstants.CENTER);
		lblRanged.setFont(new Font("Century Gothic", Font.BOLD, 15));
		JLabel lblVitality = new JLabel("");
		lblVitality.setHorizontalAlignment(SwingConstants.CENTER);
		lblVitality.setFont(new Font("Century Gothic", Font.BOLD, 15));
		JLabel lblAttackSpeed = new JLabel("");
		lblAttackSpeed.setHorizontalAlignment(SwingConstants.CENTER);
		lblAttackSpeed.setFont(new Font("Century Gothic", Font.BOLD, 15));
		JLabel lblNickname_1 = new JLabel("Name:");
		JLabel lblRace_1 = new JLabel("Race:");
		JLabel lblClass_1 = new JLabel("Class:");
		JLabel lblWeapon_1 = new JLabel("Weapon:");
		JLabel lblArmor_1 = new JLabel("Armor:");
		JLabel lblSkill_1 = new JLabel("Skill:");
		JLabel lblMeleeAttack = new JLabel("Melee Attack:");
		JLabel lblMagicAttack = new JLabel("Magic attack:");
		JLabel lblRangedAttack = new JLabel("Ranged Attack:");
		JLabel lblVitality_1 = new JLabel("Vitality:");
		JLabel lblAttackSpeed_1 = new JLabel("Attack Speed:");

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
	list.setBackground(new Color(0, 0, 0, 0));
		list.setForeground(Color.WHITE);
		list.setFont(new Font("LifeCraft", Font.PLAIN, 35));
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setBounds(297, 187, 470, 666);
	
		list.setOpaque(false);
		add(list);

		JButton Back_button = new JButton("");
		Back_button.setIcon(new ImageIcon(Load_Character_Panel.class.getResource("/create/characters/img/Buttons/Return_off.png")));
		Back_button.setBorderPainted(false); 
		Back_button.setContentAreaFilled(false); 
		Back_button.setFocusPainted(false); 
		Back_button.setOpaque(false);
		Back_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				list.setVisible(false);
				Back_button.setVisible(false);
				btnSelectedValueJList.setVisible(false);
				Main_Menu_Penel_object.setBounds(0, 0, 800, 600);

			}
		});

		Back_button.setBounds(845, 807, 435, 109);
		add(Main_Menu_Penel_object);
		add(Back_button);
		btnSelectedValueJList.setBorderPainted(false); 
		btnSelectedValueJList.setContentAreaFilled(false); 
		btnSelectedValueJList.setFocusPainted(false); 
		btnSelectedValueJList.setOpaque(false);
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
						lblRace.setText("Orc");
						lblClass.setText(test_orc.race_class);
						lblWeapon.setText(test_orc.weapon);
						lblArmor.setText(test_orc.armor);
						lblSkill.setText(test_orc.skill);
						lblMelee.setText(String.valueOf(test_orc.melee_attack));
						lblMagic.setText(String.valueOf(test_orc.magic_attack));
						lblRanged.setText(String
								.valueOf(test_orc.ranged_attack));
						lblVitality.setText(String.valueOf(test_orc.vitality));
						lblAttackSpeed.setText(String
								.valueOf(test_orc.attack_speed));
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
						lblRace.setText("Orc");
						lblClass.setText(test_orc.race_class);
						lblWeapon.setText(test_orc.weapon);
						lblArmor.setText(test_orc.armor);
						lblSkill.setText(test_orc.skill);
						lblMelee.setText(String.valueOf(test_orc.melee_attack));
						lblMagic.setText(String.valueOf(test_orc.magic_attack));
						lblRanged.setText(String
								.valueOf(test_orc.ranged_attack));
						lblVitality.setText(String.valueOf(test_orc.vitality));
						lblAttackSpeed.setText(String
								.valueOf(test_orc.attack_speed));
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
						lblRace.setText("Orc");
						lblClass.setText(test_orc.race_class);
						lblWeapon.setText(test_orc.weapon);
						lblArmor.setText(test_orc.armor);
						lblSkill.setText(test_orc.skill);
						lblMelee.setText(String.valueOf(test_orc.melee_attack));
						lblMagic.setText(String.valueOf(test_orc.magic_attack));
						lblRanged.setText(String
								.valueOf(test_orc.ranged_attack));
						lblVitality.setText(String.valueOf(test_orc.vitality));
						lblAttackSpeed.setText(String
								.valueOf(test_orc.attack_speed));
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
						lblRace.setText("Human");
						lblClass.setText(test_orc.race_class);
						lblWeapon.setText(test_orc.weapon);
						lblArmor.setText(test_orc.armor);
						lblSkill.setText(test_orc.skill);
						lblMelee.setText(String.valueOf(test_orc.melee_attack));
						lblMagic.setText(String.valueOf(test_orc.magic_attack));
						lblRanged.setText(String
								.valueOf(test_orc.ranged_attack));
						lblVitality.setText(String.valueOf(test_orc.vitality));
						lblAttackSpeed.setText(String
								.valueOf(test_orc.attack_speed));
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
						lblRace.setText("Human");
						lblClass.setText(test_orc.race_class);
						lblWeapon.setText(test_orc.weapon);
						lblArmor.setText(test_orc.armor);
						lblSkill.setText(test_orc.skill);
						lblMelee.setText(String.valueOf(test_orc.melee_attack));
						lblMagic.setText(String.valueOf(test_orc.magic_attack));
						lblRanged.setText(String
								.valueOf(test_orc.ranged_attack));
						lblVitality.setText(String.valueOf(test_orc.vitality));
						lblAttackSpeed.setText(String
								.valueOf(test_orc.attack_speed));
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
						lblRace.setText("Human");
						lblClass.setText(test_orc.race_class);
						lblWeapon.setText(test_orc.weapon);
						lblArmor.setText(test_orc.armor);
						lblSkill.setText(test_orc.skill);
						lblMelee.setText(String.valueOf(test_orc.melee_attack));
						lblMagic.setText(String.valueOf(test_orc.magic_attack));
						lblRanged.setText(String
								.valueOf(test_orc.ranged_attack));
						lblVitality.setText(String.valueOf(test_orc.vitality));
						lblAttackSpeed.setText(String
								.valueOf(test_orc.attack_speed));
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
		btnSelectedValueJList.setBounds(845, 687, 435, 109);
		add(btnSelectedValueJList);

		lblNickname.setForeground(Color.WHITE);
		lblNickname.setBounds(1064, 97, 206, 22);
		add(lblNickname);

		lblRace.setForeground(Color.WHITE);
		lblRace.setBounds(1064, 129, 206, 22);
		add(lblRace);

		lblClass.setForeground(Color.WHITE);
		lblClass.setBounds(1064, 162, 206, 22);
		add(lblClass);

		lblWeapon.setForeground(Color.WHITE);
		lblWeapon.setBounds(1064, 195, 206, 22);
		add(lblWeapon);

		lblArmor.setForeground(Color.WHITE);
		lblArmor.setBounds(1064, 228, 206, 22);
		add(lblArmor);

		lblSkill.setForeground(Color.WHITE);
		lblSkill.setBounds(1064, 261, 206, 22);
		add(lblSkill);

		lblMelee.setForeground(Color.WHITE);
		lblMelee.setBounds(1064, 294, 206, 22);
		add(lblMelee);

		lblMagic.setForeground(Color.WHITE);
		lblMagic.setBounds(1064, 327, 206, 22);
		add(lblMagic);

		lblRanged.setForeground(Color.WHITE);
		lblRanged.setBounds(1064, 394, 206, 22);
		add(lblRanged);

		lblVitality.setForeground(Color.WHITE);
		lblVitality.setBounds(1064, 360, 206, 22);
		add(lblVitality);

		lblAttackSpeed.setForeground(Color.WHITE);
		lblAttackSpeed.setBounds(1064, 427, 206, 22);
		add(lblAttackSpeed);

		lblNickname_1.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		lblNickname_1.setForeground(Color.WHITE);
		lblNickname_1.setBounds(994, 97, 109, 22);
		add(lblNickname_1);

		lblRace_1.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		lblRace_1.setForeground(Color.WHITE);
		lblRace_1.setBounds(994, 129, 109, 22);
		add(lblRace_1);

		lblClass_1.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		lblClass_1.setForeground(Color.WHITE);
		lblClass_1.setBounds(994, 162, 109, 22);
		add(lblClass_1);

		lblWeapon_1.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		lblWeapon_1.setForeground(Color.WHITE);
		lblWeapon_1.setBounds(994, 195, 109, 22);
		add(lblWeapon_1);

		lblArmor_1.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		lblArmor_1.setForeground(Color.WHITE);
		lblArmor_1.setBounds(994, 228, 109, 22);
		add(lblArmor_1);

		lblSkill_1.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		lblSkill_1.setForeground(Color.WHITE);
		lblSkill_1.setBounds(994, 261, 109, 22);
		add(lblSkill_1);

		lblMeleeAttack.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		lblMeleeAttack.setForeground(Color.WHITE);
		lblMeleeAttack.setBounds(994, 294, 109, 22);
		add(lblMeleeAttack);

		lblMagicAttack.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		lblMagicAttack.setForeground(Color.WHITE);
		lblMagicAttack.setBounds(994, 327, 109, 22);
		add(lblMagicAttack);

		lblRangedAttack.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		lblRangedAttack.setForeground(Color.WHITE);
		lblRangedAttack.setBounds(994, 360, 109, 22);
		add(lblRangedAttack);

		lblVitality_1.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		lblVitality_1.setForeground(Color.WHITE);
		lblVitality_1.setBounds(993, 394, 110, 22);
		add(lblVitality_1);

		lblAttackSpeed_1.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		lblAttackSpeed_1.setForeground(Color.WHITE);
		lblAttackSpeed_1.setBounds(994, 427, 109, 22);
		add(lblAttackSpeed_1);

		
		
		JLabel lblLoadTable = new JLabel("");
		lblLoadTable.setIcon(new ImageIcon(Load_Character_Panel.class.getResource("/create/characters/img/Load_bg.png")));
		lblLoadTable.setBounds(127, 97, 831, 1011);
		add(lblLoadTable);
		add(super.background_label);
	}
}
