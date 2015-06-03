package create.characters;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;

public class New_Human_Panel extends Back_Panel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public New_Human_Panel() {
		// ----------------------------------------------------------------------------------------------------------
		// OBIEKTY
		JButton btnHumanWarrior = new JButton("Warrior");
		btnHumanWarrior.setBackground(Color.LIGHT_GRAY);
		JButton btnHumanMage = new JButton("Mage");
		btnHumanMage.setBackground(Color.LIGHT_GRAY);
		JButton BtnHumanRanger = new JButton("Ranger");
		BtnHumanRanger.setBackground(Color.LIGHT_GRAY);
		JLabel lblClass = new JLabel("Default Class");
		lblClass.setForeground(Color.WHITE);
		lblClass.setFont(new Font("Tahoma", Font.PLAIN, 25));
		JLabel lblName = new JLabel("NAME");
		JTextField NameField = new JTextField();
		JButton btnCreate = new JButton("CREATE");
		JButton Back_button = new JButton("Back to MENU");
		// ------------------------------------------------ Weapon
		JLabel lblWeapon = new JLabel("Weapon");
		JLabel lblSelectedWeapon = new JLabel("None");
		JButton btnWeaponPrev = new JButton("<");
		JButton btnWeaponNext = new JButton(">");
		JLabel lblShowWeapon = new JLabel("Default Weapon");
		lblShowWeapon.setFont(new Font("Tahoma", Font.PLAIN, 15));
		// ------------------------------------------------ Armor
		JLabel lblArmor = new JLabel("Armor");
		JLabel lblSelectedArmor = new JLabel("None");
		JButton btnArmorPrev = new JButton("<");
		JButton btnArmorNext = new JButton(">");
		JLabel lblShowArmor = new JLabel("Default Armor");
		lblShowArmor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		// ------------------------------------------------ Skill
		JLabel lblSkills = new JLabel("Skills");
		JLabel lblSelectedSkills = new JLabel("None");
		JButton btnSkillsPrev = new JButton("<");
		JButton btnSkillsNext = new JButton(">");
		JLabel lblShowSkills = new JLabel("Default Skill");
		lblShowSkills.setFont(new Font("Tahoma", Font.PLAIN, 15));


		// ----------------------------------------------------------------------------------------------------------
		// CREATE BUTTON
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (btnHumanWarrior.getBackground() == Color.GREEN) {
					Human_Warrior test_human = new Human_Warrior(NameField.getText(),
							lblShowWeapon.getText(), lblShowArmor.getText(),
							lblShowSkills.getText());
					test_human.ShowInfo();
					btnHumanWarrior.setVisible(false);
					btnHumanMage.setVisible(false);
					BtnHumanRanger.setVisible(false);
					lblClass.setVisible(false);
					lblWeapon.setVisible(false);
					lblSelectedWeapon.setVisible(false);
					btnWeaponPrev.setVisible(false);
					btnWeaponNext.setVisible(false);
					lblShowWeapon.setVisible(false);
					Back_button.setVisible(false);
					lblName.setVisible(false);
					NameField.setVisible(false);
					btnCreate.setVisible(false);
					Main_Menu_Penel_object.setBounds(0, 0, 800, 600);
				} else if (btnHumanMage.getBackground() == Color.GREEN) {
					Human_Mage test_human = new Human_Mage(NameField.getText(),
							lblShowWeapon.getText(), lblShowArmor.getText(),
							lblShowSkills.getText());
					test_human.ShowInfo();
					btnHumanWarrior.setVisible(false);
					btnHumanMage.setVisible(false);
					BtnHumanRanger.setVisible(false);
					lblClass.setVisible(false);
					lblWeapon.setVisible(false);
					lblSelectedWeapon.setVisible(false);
					btnWeaponPrev.setVisible(false);
					btnWeaponNext.setVisible(false);
					lblShowWeapon.setVisible(false);
					Back_button.setVisible(false);
					lblName.setVisible(false);
					NameField.setVisible(false);
					btnCreate.setVisible(false);
					Main_Menu_Penel_object.setBounds(0, 0, 800, 600);
				} else if (BtnHumanRanger.getBackground() == Color.GREEN) {
					Human_Ranger test_human = new Human_Ranger(NameField.getText(),
							lblShowWeapon.getText(), lblShowArmor.getText(),
							lblShowSkills.getText());
					test_human.ShowInfo();
					btnHumanWarrior.setVisible(false);
					btnHumanMage.setVisible(false);
					BtnHumanRanger.setVisible(false);
					lblClass.setVisible(false);
					lblWeapon.setVisible(false);
					lblSelectedWeapon.setVisible(false);
					btnWeaponPrev.setVisible(false);
					btnWeaponNext.setVisible(false);
					lblShowWeapon.setVisible(false);
					Back_button.setVisible(false);
					lblName.setVisible(false);
					NameField.setVisible(false);
					btnCreate.setVisible(false);
					Main_Menu_Penel_object.setBounds(0, 0, 800, 600);
				} else if (btnHumanWarrior.getBackground() != Color.GREEN
						&& btnHumanMage.getBackground() != Color.GREEN
						&& BtnHumanRanger.getBackground() != Color.GREEN) {
					lblShowWeapon.setText("Error");
					lblClass.setText("ERROR");
				}

			}
		});
		btnCreate.setBounds(607, 408, 183, 75);
		add(btnCreate);

		// ----------------------------------------------------------------------------------------------------------
		// BACK_BUTTON I NICKNAME
		Back_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnHumanWarrior.setVisible(false);
				btnHumanMage.setVisible(false);
				BtnHumanRanger.setVisible(false);
				lblClass.setVisible(false);
				lblWeapon.setVisible(false);
				lblSelectedWeapon.setVisible(false);
				btnWeaponPrev.setVisible(false);
				btnWeaponNext.setVisible(false);
				lblShowWeapon.setVisible(false);
				Back_button.setVisible(false);
				lblName.setVisible(false);
				NameField.setVisible(false);
				btnCreate.setVisible(false);
				Main_Menu_Penel_object.setBounds(0, 0, 800, 600);
			}
		});
		Back_button.setBounds(607, 494, 183, 62);

		add(Main_Menu_Penel_object);
		add(Back_button);

		NameField.setText("");
		NameField.setBounds(299, 505, 167, 34);
		add(NameField);
		NameField.setColumns(10);

		lblName.setForeground(Color.WHITE);
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblName.setBounds(208, 507, 70, 24);
		add(lblName);

		// ----------------------------------------------------------------------------------------------------------
		// BUTTONY KLAS
		btnHumanWarrior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnHumanWarrior.setBackground(Color.GREEN);
				btnHumanMage.setBackground(Color.LIGHT_GRAY);
				BtnHumanRanger.setBackground(Color.LIGHT_GRAY);
				lblClass.setText("Warrior");
				lblSelectedWeapon.setText("Sword");
				lblSelectedArmor.setText("Plate");
				lblSelectedSkills.setText("Exori");
				lblShowWeapon.setText(lblSelectedWeapon.getText());
				lblShowArmor.setText(lblSelectedArmor.getText());
				lblShowSkills.setText(lblSelectedSkills.getText());
			}
		});
		btnHumanWarrior.setBounds(13, 59, 81, 62);
		add(btnHumanWarrior);

		btnHumanMage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnHumanMage.setBackground(Color.GREEN);
				btnHumanWarrior.setBackground(Color.LIGHT_GRAY);
				BtnHumanRanger.setBackground(Color.LIGHT_GRAY);
				lblClass.setText("Mage");
				lblSelectedWeapon.setText("Wand");
				lblSelectedArmor.setText("Robe");
				lblSelectedSkills.setText("Exevo Gran Mas Vis");
				lblShowWeapon.setText(lblSelectedWeapon.getText());
				lblShowArmor.setText(lblSelectedArmor.getText());
				lblShowSkills.setText(lblSelectedSkills.getText());
			}
		});
		btnHumanMage.setBounds(104, 59, 81, 62);
		add(btnHumanMage);

		BtnHumanRanger.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BtnHumanRanger.setBackground(Color.GREEN);
				btnHumanWarrior.setBackground(Color.LIGHT_GRAY);
				btnHumanMage.setBackground(Color.LIGHT_GRAY);
				lblClass.setText("Ranger");
				lblSelectedWeapon.setText("Crossbow");
				lblSelectedArmor.setText("Paladin");
				lblSelectedSkills.setText("Exevo Mas San");
				lblShowWeapon.setText(lblSelectedWeapon.getText());
				lblShowArmor.setText(lblSelectedArmor.getText());
				lblShowSkills.setText(lblSelectedSkills.getText());
			}
		});
		BtnHumanRanger.setBounds(195, 59, 83, 62);
		add(BtnHumanRanger);

		// ----------------------------------------------------------------------------------------------------------
		// POKAZYWANIE POSTACI
		lblClass.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblClass.setHorizontalAlignment(SwingConstants.CENTER);
		lblClass.setBounds(453, 25, 271, 34);
		add(lblClass);

		lblShowWeapon.setForeground(Color.WHITE);
		lblShowWeapon.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblShowWeapon.setHorizontalAlignment(SwingConstants.CENTER);
		lblShowWeapon.setBounds(453, 80, 271, 38);
		add(lblShowWeapon);

		lblShowArmor.setHorizontalAlignment(SwingConstants.CENTER);
		lblShowArmor.setForeground(Color.WHITE);
		lblShowArmor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblShowArmor.setBounds(453, 120, 271, 38);
		add(lblShowArmor);
		
		lblShowSkills.setHorizontalAlignment(SwingConstants.CENTER);
		lblShowSkills.setForeground(Color.WHITE);
		lblShowSkills.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblShowSkills.setBounds(453, 160, 271, 38);
		add(lblShowSkills);

		// ----------------------------------------------------------------------------------------------------------
		// WEAPON
		lblWeapon.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblWeapon.setForeground(Color.WHITE);
		lblWeapon.setHorizontalAlignment(SwingConstants.CENTER);
		lblWeapon.setBounds(104, 165, 93, 24);
		add(lblWeapon);

		lblSelectedWeapon.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSelectedWeapon.setForeground(Color.WHITE);
		lblSelectedWeapon.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelectedWeapon.setBounds(55, 200, 183, 24);
		add(lblSelectedWeapon);

		btnWeaponPrev.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btnHumanWarrior.getBackground() == Color.GREEN) {
					if (lblSelectedWeapon.getText() == "Sword") {
						lblSelectedWeapon.setText("Axe");
					} else if (lblSelectedWeapon.getText() == "Axe") {
						lblSelectedWeapon.setText("Club");
					} else if (lblSelectedWeapon.getText() == "Club") {
						lblSelectedWeapon.setText("Sword");
					}
					lblShowWeapon.setText(lblSelectedWeapon.getText());
				} 
				else if (btnHumanMage.getBackground() == Color.GREEN) {
					if (lblSelectedWeapon.getText() == "Wand") {
						lblSelectedWeapon.setText("Staff");
					} else if (lblSelectedWeapon.getText() == "Staff") {
						lblSelectedWeapon.setText("Rod");
					} else if (lblSelectedWeapon.getText() == "Rod") {
						lblSelectedWeapon.setText("Wand");
					}
					lblShowWeapon.setText(lblSelectedWeapon.getText());
				} 
				else if (BtnHumanRanger.getBackground() == Color.GREEN) {
					if (lblSelectedWeapon.getText() == "Crossbow") {
						lblSelectedWeapon.setText("Bow");
					} else if (lblSelectedWeapon.getText() == "Bow") {
						lblSelectedWeapon.setText("Spear");
					} else if (lblSelectedWeapon.getText() == "Spear") {
						lblSelectedWeapon.setText("Crossbow");
					}
					lblShowWeapon.setText(lblSelectedWeapon.getText());
				}
			}
		});
		btnWeaponPrev.setBackground(Color.ORANGE);
		btnWeaponPrev.setBounds(0, 201, 45, 23);
		add(btnWeaponPrev);

		btnWeaponNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btnHumanWarrior.getBackground() == Color.GREEN) {
					if (lblSelectedWeapon.getText() == "Sword") {
						lblSelectedWeapon.setText("Club");
					} else if (lblSelectedWeapon.getText() == "Club") {
						lblSelectedWeapon.setText("Axe");
					} else if (lblSelectedWeapon.getText() == "Axe") {
						lblSelectedWeapon.setText("Sword");
					}
					lblShowWeapon.setText(lblSelectedWeapon.getText());
				}
				else if (btnHumanMage.getBackground() == Color.GREEN) {
					if (lblSelectedWeapon.getText() == "Wand") {
						lblSelectedWeapon.setText("Rod");
					} else if (lblSelectedWeapon.getText() == "Rod") {
						lblSelectedWeapon.setText("Staff");
					} else if (lblSelectedWeapon.getText() == "Staff") {
						lblSelectedWeapon.setText("Wand");
					}
					lblShowWeapon.setText(lblSelectedWeapon.getText());
				}
				else if (BtnHumanRanger.getBackground() == Color.GREEN) {
					if (lblSelectedWeapon.getText() == "Crossbow") {
						lblSelectedWeapon.setText("Spear");
					} else if (lblSelectedWeapon.getText() == "Spear") {
						lblSelectedWeapon.setText("Bow");
					} else if (lblSelectedWeapon.getText() == "Bow") {
						lblSelectedWeapon.setText("Crossbow");
					}
					lblShowWeapon.setText(lblSelectedWeapon.getText());
				}
			}
		});
		btnWeaponNext.setBackground(Color.ORANGE);
		btnWeaponNext.setBounds(248, 201, 45, 23);
		add(btnWeaponNext);

		// ----------------------------------------------------------------------------------------------------------
		// ARMOR
		lblArmor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblArmor.setForeground(Color.WHITE);
		lblArmor.setHorizontalAlignment(SwingConstants.CENTER);
		lblArmor.setBounds(103, 235, 94, 38);
		add(lblArmor);

		lblSelectedArmor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSelectedArmor.setForeground(Color.WHITE);
		lblSelectedArmor.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelectedArmor.setBounds(55, 269, 183, 24);
		add(lblSelectedArmor);

		btnArmorPrev.setBackground(Color.ORANGE);
		btnArmorPrev.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btnHumanWarrior.getBackground() == Color.GREEN) {
					if (lblSelectedArmor.getText() == "Plate") {
						lblSelectedArmor.setText("Dark");
					} else if (lblSelectedArmor.getText() == "Dark") {
						lblSelectedArmor.setText("Golden");
					} else if (lblSelectedArmor.getText() == "Golden") {
						lblSelectedArmor.setText("Plate");
					}
					lblShowArmor.setText(lblSelectedArmor.getText());
				}
				else if (btnHumanMage.getBackground() == Color.GREEN) {
					if (lblSelectedArmor.getText() == "Robe") {
						lblSelectedArmor.setText("Coat");
					} else if (lblSelectedArmor.getText() == "Coat") {
						lblSelectedArmor.setText("Cape");
					} else if (lblSelectedArmor.getText() == "Cape") {
						lblSelectedArmor.setText("Robe");
					}
					lblShowArmor.setText(lblSelectedArmor.getText());
				}
				else if (BtnHumanRanger.getBackground() == Color.GREEN) {
					if (lblSelectedArmor.getText() == "Paladin") {
						lblSelectedArmor.setText("Yalahar");
					} else if (lblSelectedArmor.getText() == "Yalahar") {
						lblSelectedArmor.setText("Master Archer's");
					} else if (lblSelectedArmor.getText() == "Master Archer's") {
						lblSelectedArmor.setText("Paladin");
					}
					lblShowArmor.setText(lblSelectedArmor.getText());
				}
			}
		});
		btnArmorPrev.setBounds(0, 272, 45, 23);
		add(btnArmorPrev);

		btnArmorNext.setBackground(Color.ORANGE);
		btnArmorNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (btnHumanWarrior.getBackground() == Color.GREEN) {
					if (lblSelectedArmor.getText() == "Plate") {
						lblSelectedArmor.setText("Golden");
					} else if (lblSelectedArmor.getText() == "Golden") {
						lblSelectedArmor.setText("Dark");
					} else if (lblSelectedArmor.getText() == "Dark") {
						lblSelectedArmor.setText("Plate");
					}
					lblShowArmor.setText(lblSelectedArmor.getText());
				}
				else if (btnHumanMage.getBackground() == Color.GREEN) {
					if (lblSelectedArmor.getText() == "Robe") {
						lblSelectedArmor.setText("Cape");
					} else if (lblSelectedArmor.getText() == "Cape") {
						lblSelectedArmor.setText("Coat");
					} else if (lblSelectedArmor.getText() == "Coat") {
						lblSelectedArmor.setText("Robe");
					}
					lblShowArmor.setText(lblSelectedArmor.getText());
				}
				else if (BtnHumanRanger.getBackground() == Color.GREEN) {
					if (lblSelectedArmor.getText() == "Paladin") {
						lblSelectedArmor.setText("Master Archer's");
					} else if (lblSelectedArmor.getText() == "Master Archer's") {
						lblSelectedArmor.setText("Yalahar");
					} else if (lblSelectedArmor.getText() == "Yalahar") {
						lblSelectedArmor.setText("Paladin");
					}
					lblShowArmor.setText(lblSelectedArmor.getText());
				}
			}
		});
		btnArmorNext.setBounds(248, 272, 45, 23);
		add(btnArmorNext);

		// ----------------------------------------------------------------------------------------------------------
		// SKILL
		lblSkills.setHorizontalAlignment(SwingConstants.CENTER);
		lblSkills.setForeground(Color.WHITE);
		lblSkills.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSkills.setBounds(104, 304, 94, 24);
		add(lblSkills);

		lblSelectedSkills.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSelectedSkills.setForeground(Color.WHITE);
		lblSelectedSkills.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelectedSkills.setBounds(55, 336, 183, 24);
		add(lblSelectedSkills);

		btnSkillsPrev.setBackground(Color.ORANGE);
		btnSkillsPrev.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btnHumanWarrior.getBackground() == Color.GREEN) {
					if (lblSelectedSkills.getText() == "Exori") {
						lblSelectedSkills.setText("Exori Gran");
					} else if (lblSelectedSkills.getText() == "Exori Gran") {
						lblSelectedSkills.setText("Exori Gran Ico");
					} else if (lblSelectedSkills.getText() == "Exori Gran Ico") {
						lblSelectedSkills.setText("Exori");
					}
					lblShowSkills.setText(lblSelectedSkills.getText());
				}
				else if (btnHumanMage.getBackground() == Color.GREEN) {
					if (lblSelectedSkills.getText() == "Exevo Gran Mas Vis") {
						lblSelectedSkills.setText("Exori Frigo");
					} else if (lblSelectedSkills.getText() == "Exori Frigo") {
						lblSelectedSkills.setText("Utori Flam");
					} else if (lblSelectedSkills.getText() == "Utori Flam") {
						lblSelectedSkills.setText("Exevo Gran Mas Vis");
					}
					lblShowSkills.setText(lblSelectedSkills.getText());
				}
				else if (BtnHumanRanger.getBackground() == Color.GREEN) {
					if (lblSelectedSkills.getText() == "Exevo Mas San") {
						lblSelectedSkills.setText("Exori Con");
					} else if (lblSelectedSkills.getText() == "Exori Con") {
						lblSelectedSkills.setText("Utito Tempo San");
					} else if (lblSelectedSkills.getText() == "Utito Tempo San") {
						lblSelectedSkills.setText("Exevo Mas San");
					}
					lblShowSkills.setText(lblSelectedSkills.getText());
				}
			}
		});
		
		btnSkillsNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btnHumanWarrior.getBackground() == Color.GREEN) {
					if (lblSelectedSkills.getText() == "Exori") {
						lblSelectedSkills.setText("Exori Gran Ico");
					} else if (lblSelectedSkills.getText() == "Exori Gran Ico") {
						lblSelectedSkills.setText("Exori Gran");
					} else if (lblSelectedSkills.getText() == "Exori Gran") {
						lblSelectedSkills.setText("Exori");
					}
					lblShowSkills.setText(lblSelectedSkills.getText());
				}
				else if (btnHumanMage.getBackground() == Color.GREEN) {
					if (lblSelectedSkills.getText() == "Exevo Gran Mas Vis") {
						lblSelectedSkills.setText("Utori Flam");
					} else if (lblSelectedSkills.getText() == "Utori Flam") {
						lblSelectedSkills.setText("Exori Frigo");
					} else if (lblSelectedSkills.getText() == "Exori Frigo") {
						lblSelectedSkills.setText("Exevo Gran Mas Vis");
					}
					lblShowSkills.setText(lblSelectedSkills.getText());
				}
				else if (BtnHumanRanger.getBackground() == Color.GREEN) {
					if (lblSelectedSkills.getText() == "Exevo Mas San") {
						lblSelectedSkills.setText("Utito Tempo San");
					} else if (lblSelectedSkills.getText() == "Utito Tempo San") {
						lblSelectedSkills.setText("Exori Con");
					} else if (lblSelectedSkills.getText() == "Exori Con") {
						lblSelectedSkills.setText("Exevo Mas San");
					}
					lblShowSkills.setText(lblSelectedSkills.getText());
				}
			}
		});
		
		btnSkillsPrev.setBounds(0, 339, 45, 23);
		add(btnSkillsPrev);

		btnSkillsNext.setBackground(Color.ORANGE);
		btnSkillsNext.setBounds(248, 339, 45, 23);
		add(btnSkillsNext);

		add(super.background_label);
		

	}

}