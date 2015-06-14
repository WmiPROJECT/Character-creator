package create.characters;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import java.io.*;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
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
	JLabel lblNickname = new JLabel("");
	JLabel lblMagic = new JLabel("");
	JLabel lblArmor = new JLabel("");
	JLabel lblWeapon = new JLabel("");
	JLabel lblMelee = new JLabel("");
	JLabel lblSkill = new JLabel("");
	JLabel lblClass = new JLabel("");
	JLabel lblRace = new JLabel("");
	JLabel lblAttackSpeed = new JLabel("");
	JLabel lblVitality = new JLabel("");
	JLabel lblRanged = new JLabel("");
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
	JLabel lblLoadTable = new JLabel("");
	JLabel lblCharacter_Load = new JLabel("");
	JLabel lblTabela2 = new JLabel("");
	JLabel lblShowIcon = new JLabel("");

	public Load_Character_Panel() throws FileNotFoundException, IOException,
			ClassNotFoundException {
		setForeground(Color.WHITE);

		JButton btnSelectedValueJList = new JButton("");
		btnSelectedValueJList.setIcon(new ImageIcon(Load_Character_Panel.class
				.getResource("/create/characters/img/Buttons/SelectOFF.png")));

		lblNickname.setHorizontalAlignment(SwingConstants.CENTER);
		lblNickname.setFont(new Font("LifeCraft", Font.PLAIN, 30));

		lblRace.setHorizontalAlignment(SwingConstants.CENTER);
		lblRace.setFont(new Font("LifeCraft", Font.PLAIN, 30));

		lblClass.setHorizontalAlignment(SwingConstants.CENTER);
		lblClass.setFont(new Font("LifeCraft", Font.PLAIN, 30));

		lblWeapon.setHorizontalAlignment(SwingConstants.CENTER);
		lblWeapon.setFont(new Font("LifeCraft", Font.PLAIN, 30));

		lblArmor.setHorizontalAlignment(SwingConstants.CENTER);
		lblArmor.setFont(new Font("LifeCraft", Font.PLAIN, 30));

		lblSkill.setHorizontalAlignment(SwingConstants.CENTER);
		lblSkill.setFont(new Font("LifeCraft", Font.PLAIN, 30));

		lblMelee.setHorizontalAlignment(SwingConstants.CENTER);
		lblMelee.setFont(new Font("LifeCraft", Font.PLAIN, 30));

		lblMagic.setHorizontalAlignment(SwingConstants.CENTER);
		lblMagic.setFont(new Font("LifeCraft", Font.PLAIN, 30));

		lblRanged.setHorizontalAlignment(SwingConstants.CENTER);
		lblRanged.setFont(new Font("LifeCraft", Font.PLAIN, 30));

		lblVitality.setHorizontalAlignment(SwingConstants.CENTER);
		lblVitality.setFont(new Font("LifeCraft", Font.PLAIN, 30));

		lblAttackSpeed.setHorizontalAlignment(SwingConstants.CENTER);
		lblAttackSpeed.setFont(new Font("LifeCraft", Font.PLAIN, 30));
		lblNickname_1.setVisible(false);
		lblRace_1.setVisible(false);
		lblClass_1.setVisible(false);
		lblWeapon_1.setVisible(false);
		lblArmor_1.setVisible(false);
		lblSkill_1.setVisible(false);
		lblMeleeAttack.setHorizontalAlignment(SwingConstants.LEFT);
		lblMeleeAttack.setVisible(false);
		lblMagicAttack.setHorizontalAlignment(SwingConstants.LEFT);
		lblMagicAttack.setVisible(false);
		lblRangedAttack.setHorizontalAlignment(SwingConstants.LEFT);
		lblRangedAttack.setVisible(false);
		lblVitality_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblVitality_1.setVisible(false);
		lblAttackSpeed_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblAttackSpeed_1.setVisible(false);
		lblLoadTable.setVisible(true);
		lblNickname.setVisible(false);
		lblRace.setVisible(false);
		lblClass.setVisible(false);
		lblWeapon.setVisible(false);
		lblArmor.setVisible(false);
		lblSkill.setVisible(false);
		lblMelee.setVisible(false);
		lblMagic.setVisible(false);
		lblRanged.setVisible(false);
		lblVitality.setVisible(false);
		lblAttackSpeed.setVisible(false);
		DefaultListModel listModel = new DefaultListModel();
		JList list = new JList(listModel);
		BufferedReader in = null;
		String line;
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
		list.setBackground(new Color(0, 0, 0, 0));
		list.setForeground(Color.WHITE);
		list.setFont(new Font("LifeCraft", Font.PLAIN, 35));
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setBounds(297, 187, 470, 666);
		list.setOpaque(false);
		add(list);
		JButton Back_button = new JButton("");
		Back_button.setIcon(new ImageIcon(Load_Character_Panel.class
				.getResource("/create/characters/img/Buttons/Return_off.png")));
		Back_button.setBorderPainted(false);
		Back_button.setContentAreaFilled(false);
		Back_button.setFocusPainted(false);
		Back_button.setOpaque(false);
		Back_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				list.setVisible(false);
				Back_button.setVisible(false);
				btnSelectedValueJList.setVisible(false);
				Main_Menu_Penel_object.setBounds(0, 0, 1280, 1024);
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
				lblNickname_1.setVisible(true);
				lblRace_1.setVisible(true);
				lblClass_1.setVisible(true);
				lblWeapon_1.setVisible(true);
				lblArmor_1.setVisible(true);
				lblSkill_1.setVisible(true);
				lblMeleeAttack.setVisible(true);
				lblMagicAttack.setVisible(true);
				lblRangedAttack.setVisible(true);
				lblVitality_1.setVisible(true);
				lblAttackSpeed_1.setVisible(true);
				lblLoadTable.setVisible(false);
				lblNickname.setVisible(true);
				lblRace.setVisible(true);
				lblClass.setVisible(true);
				lblWeapon.setVisible(true);
				lblArmor.setVisible(true);
				lblSkill.setVisible(true);
				lblMelee.setVisible(true);
				lblMagic.setVisible(true);
				lblRanged.setVisible(true);
				lblVitality.setVisible(true);
				lblAttackSpeed.setVisible(true);
				Back_button.setIcon(new ImageIcon(
						Load_Character_Panel.class
								.getResource("/create/characters/img/Buttons/Return_small_off.png")));
				list.setVisible(false);
				Back_button.setVisible(true);
				btnSelectedValueJList.setVisible(false);
				background_label.setVisible(false);
				lblLoadTable.setVisible(false);

				lblTabela2.setVisible(true);
				String selected = (String) list.getSelectedValue();
				String selected_class = "";
				String selected_race = "";
				// --------------------------------------------------------
				//
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
					if (selected.charAt(i) == ' '
							&& selected.charAt(i + 1) == '-')
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
						e.printStackTrace();
					} catch (IOException e) {
						System.out.println("IOE");
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						System.out.println("Classnotfound");

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
						e.printStackTrace();
					} catch (IOException e) {
						System.out.println("IOE");

						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						System.out.println("Classnotfound");
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
						e.printStackTrace();
					} catch (IOException e) {
						System.out.println("IOE");
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						System.out.println("Classnotfound");

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
						e.printStackTrace();
					} catch (IOException e) {
						System.out.println("IOE");

						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						System.out.println("Classnotfound");

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
						e.printStackTrace();
					} catch (IOException e) {
						System.out.println("IOE");

						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						System.out.println("Classnotfound");

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
						e.printStackTrace();
					} catch (IOException e) {
						System.out.println("IOE");

						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						System.out.println("Classnotfound");

						e.printStackTrace();
					}

				} else {
					System.out.println("ERROR");
				}
				if (lblRace.getText().equals("Human")) {
					lblRace.setText("BloodElf");
				}
				if (lblArmor.getText().equals("Master")) {
					lblArmor.setText("Master");
				}
				lblCharacter_Load.setIcon(new ImageIcon(
						Load_Character_Panel.class
								.getResource("/create/characters/img/"
										+ lblRace.getText() + "-"
										+ lblClass.getText() + "/"
										+ lblRace.getText() + "-"
										+ lblWeapon.getText() + "-"
										+ lblArmor.getText() + ".gif")));
				lblShowIcon.setIcon(new ImageIcon(Load_Character_Panel.class.getResource("/create/characters/img/Skills/"+ lblClass.getText() +  "_" + lblSkill.getText() + ".png")));
			}
		});
		btnSelectedValueJList.setBounds(845, 687, 435, 109);
		add(btnSelectedValueJList);

		lblNickname.setForeground(Color.WHITE);
		lblNickname.setBounds(152, 212, 206, 36);
		add(lblNickname);

		lblRace.setForeground(Color.WHITE);
		lblRace.setBounds(152, 244, 206, 36);
		add(lblRace);

		lblClass.setForeground(Color.WHITE);
		lblClass.setBounds(152, 280, 206, 33);
		add(lblClass);

		lblWeapon.setForeground(Color.WHITE);
		lblWeapon.setBounds(152, 315, 206, 31);
		add(lblWeapon);

		lblArmor.setForeground(Color.WHITE);
		lblArmor.setBounds(152, 357, 206, 36);
		add(lblArmor);

		lblSkill.setForeground(Color.WHITE);
		lblSkill.setBounds(152, 400, 206, 36);
		add(lblSkill);

		lblMelee.setForeground(Color.WHITE);
		lblMelee.setBounds(220, 437, 206, 36);
		add(lblMelee);

		lblMagic.setForeground(Color.WHITE);
		lblMagic.setBounds(220, 484, 206, 36);
		add(lblMagic);

		lblRanged.setForeground(Color.WHITE);
		lblRanged.setBounds(220, 578, 206, 36);
		add(lblRanged);

		lblVitality.setForeground(Color.WHITE);
		lblVitality.setBounds(220, 531, 206, 36);
		add(lblVitality);

		lblAttackSpeed.setForeground(Color.WHITE);
		lblAttackSpeed.setBounds(220, 625, 206, 36);
		add(lblAttackSpeed);

		lblNickname_1.setFont(new Font("LifeCraft", Font.PLAIN, 35));
		lblNickname_1.setForeground(SystemColor.inactiveCaptionBorder);
		lblNickname_1.setBounds(62, 212, 71, 36);
		add(lblNickname_1);

		lblRace_1.setFont(new Font("LifeCraft", Font.PLAIN, 35));
		lblRace_1.setForeground(SystemColor.inactiveCaptionBorder);
		lblRace_1.setBounds(62, 244, 63, 36);
		add(lblRace_1);

		lblClass_1.setFont(new Font("LifeCraft", Font.PLAIN, 35));
		lblClass_1.setForeground(SystemColor.inactiveCaptionBorder);
		lblClass_1.setBounds(62, 280, 77, 36);
		add(lblClass_1);

		lblWeapon_1.setFont(new Font("LifeCraft", Font.PLAIN, 35));
		lblWeapon_1.setForeground(SystemColor.inactiveCaptionBorder);
		lblWeapon_1.setBounds(62, 315, 102, 36);
		add(lblWeapon_1);

		lblArmor_1.setFont(new Font("LifeCraft", Font.PLAIN, 35));
		lblArmor_1.setForeground(SystemColor.inactiveCaptionBorder);
		lblArmor_1.setBounds(62, 357, 87, 36);
		add(lblArmor_1);

		lblSkill_1.setFont(new Font("LifeCraft", Font.PLAIN, 35));
		lblSkill_1.setForeground(SystemColor.inactiveCaptionBorder);
		lblSkill_1.setBounds(62, 400, 75, 36);
		add(lblSkill_1);

		lblMeleeAttack.setFont(new Font("LifeCraft", Font.PLAIN, 35));
		lblMeleeAttack.setForeground(SystemColor.inactiveCaptionBorder);
		lblMeleeAttack.setBounds(62, 437, 172, 36);
		add(lblMeleeAttack);

		lblMagicAttack.setFont(new Font("LifeCraft", Font.PLAIN, 35));
		lblMagicAttack.setForeground(SystemColor.inactiveCaptionBorder);
		lblMagicAttack.setBounds(62, 484, 168, 36);
		add(lblMagicAttack);

		lblRangedAttack.setFont(new Font("LifeCraft", Font.PLAIN, 35));
		lblRangedAttack.setForeground(SystemColor.inactiveCaptionBorder);
		lblRangedAttack.setBounds(62, 531, 189, 36);
		add(lblRangedAttack);

		lblVitality_1.setFont(new Font("LifeCraft", Font.PLAIN, 35));
		lblVitality_1.setForeground(SystemColor.inactiveCaptionBorder);
		lblVitality_1.setBounds(62, 578, 113, 36);
		add(lblVitality_1);

		lblAttackSpeed_1.setFont(new Font("LifeCraft", Font.PLAIN, 35));
		lblAttackSpeed_1.setForeground(SystemColor.inactiveCaptionBorder);
		lblAttackSpeed_1.setBounds(62, 625, 170, 36);
		add(lblAttackSpeed_1);

		lblLoadTable.setIcon(new ImageIcon(Load_Character_Panel.class
				.getResource("/create/characters/img/Load_bg.png")));
		lblLoadTable.setBounds(127, 97, 1000, 1024);
		add(lblLoadTable);
		lblTabela2.setVisible(false);
		lblTabela2.setIcon(new ImageIcon(Load_Character_Panel.class
				.getResource("/create/characters/img/tabela.png")));
		lblTabela2.setBounds(10, 50, 400, 800);

		add(lblTabela2);
		
		lblShowIcon.setIcon(null);
		lblShowIcon.setBounds(37, 645, 356, 319);
		add(lblShowIcon);

		lblCharacter_Load.setBounds(0, 0, 1280, 1024);

		add(lblCharacter_Load);
		add(super.background_label);
	}
}
