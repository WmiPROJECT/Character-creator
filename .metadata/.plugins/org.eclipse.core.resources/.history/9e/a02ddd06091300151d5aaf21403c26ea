package create.characters;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

import java.io.Serializable;
import java.io.FileInputStream;
import java.io.FileOutputStream;

//-------------------------------------------------------------------------------------New_Character interface
@SuppressWarnings("unused")
interface New_Character {
	public void ChangeNickname(String change_name);
	public void ChangeWeapon(String change_weapon);
	public void ChangeArmor(String change_armor);
	public void ChangeSkill(String change_skill);
	public void ShowInfo();
	
}
//-------------------------------------------------------------------------------------ORC abstract class
@SuppressWarnings("serial")
abstract class Orc implements New_Character,Serializable{
	private String race;
	protected String race_class;
	protected String nickname;
	protected String weapon;
	protected String armor;
	protected String skill;
	protected int melee_attack;
	protected int magic_attack;
	protected int ranged_attack;
	protected int vitality;
	protected int attack_speed;	
	

	public Orc(){
		race="Orc";
		melee_attack=31;
		magic_attack=24;
		ranged_attack=27;
		vitality=33;
		attack_speed=19;
	}
	public void ChangeNickname(String change_name) {
		nickname = change_name;
	}
	public void ChangeWeapon(String change_weapon){
		weapon = change_weapon;	
	}
	public void ChangeArmor(String change_armor){
		armor = change_armor;
	}
	public void ChangeSkill(String change_skill){
		skill = change_skill;
	}
	public void ShowInfo(){
		System.out.println("Race: " + race);
		System.out.println("Class: " + race_class);
		System.out.println("Nickname: " + nickname);
		System.out.println("Weapon: " + weapon);
		System.out.println("Armor: " + armor);
		System.out.println("Skill: " + skill);
		System.out.println("Melee attack: " + melee_attack);
		System.out.println("Magic attack: " + magic_attack);
		System.out.println("Ranged attack: " + ranged_attack);
		System.out.println("Vitality: " + vitality);
		System.out.println("Attack speed: " + attack_speed);
	}
}
//-------------------------------------------------------------------------------------HUMAN abstract class
@SuppressWarnings("serial")
abstract class Human implements New_Character,Serializable{
	private String race;
	protected String race_class;
	protected String nickname;
	protected String weapon;
	protected String armor;
	protected String skill;
	protected int melee_attack;
	protected int magic_attack;
	protected int ranged_attack;
	protected int vitality;
	protected int attack_speed;
	
	
	public Human(){
		race="Human";
		melee_attack=30;
		magic_attack=32;
		ranged_attack=25;
		vitality=26;
		attack_speed=24;
	}
	public void ChangeNickname(String change_name) {
		nickname = change_name;
	}
	public void ChangeWeapon(String change_weapon){
		weapon = change_weapon;	
	}
	public void ChangeArmor(String change_armor){
		armor = change_armor;
	}
	public void ChangeSkill(String change_skill){
		skill = change_skill;
	}
	public void ShowInfo(){
		System.out.println("Race: " + race);
		System.out.println("Class: " + race_class);
		System.out.println("Nickname: " + nickname);
		System.out.println("Weapon: " + weapon);
		System.out.println("Armor: " + armor);
		System.out.println("Skill: " + skill);
		System.out.println("Melee attack: " + melee_attack);
		System.out.println("Magic attack: " + magic_attack);
		System.out.println("Ranged attack: " + ranged_attack);
		System.out.println("Vitality: " + vitality);
		System.out.println("Attack speed: " + attack_speed);
	}
}
//-------------------------------------------------------------------------------------ORC Warrior class
@SuppressWarnings("serial")
class Load_Character extends Orc {
	
}

//-------------------------------------------------------------------------------------ORC Warrior class
@SuppressWarnings("serial")
class Orc_Warrior extends Orc {
	public Orc_Warrior(String n, String w, String a, String s){
		race_class="Warrior";
		nickname=n;
		weapon=w;
		armor=a;
		skill=s;
		melee_attack+=15;
		vitality+=25;
	}
	
}
//-------------------------------------------------------------------------------------Human Warrior class
@SuppressWarnings("serial")
class Human_Warrior extends Human{
	public Human_Warrior(String n, String w, String a, String s){
		race_class="Warrior";
		nickname=n;
		weapon=w;
		armor=a;
		skill=s;
		melee_attack+=25;
		vitality+=15;
	}
}
//-------------------------------------------------------------------------------------ORC Warrior class
@SuppressWarnings("serial")
class Orc_Mage extends Orc{
	public Orc_Mage(String n, String w, String a, String s){
		race_class="Mage";
		nickname=n;
		weapon=w;
		armor=a;
		skill=s;
		magic_attack+=20;
	}
	
}
//-------------------------------------------------------------------------------------Human Warrior class
@SuppressWarnings("serial")
class Human_Mage extends Human{
	public Human_Mage(String n, String w, String a, String s){
		race_class="Mage";
		nickname=n;
		weapon=w;
		armor=a;
		skill=s;
		magic_attack+=25;
	}
}
//-------------------------------------------------------------------------------------ORC Warrior class
@SuppressWarnings("serial")
class Orc_Ranger extends Orc {
	public Orc_Ranger(String n, String w, String a, String s){
		race_class="Ranger";
		nickname=n;
		weapon=w;
		armor=a;
		skill=s;
		ranged_attack+=15;
		attack_speed+=15;
	}
	
}
//-------------------------------------------------------------------------------------Human Warrior class
@SuppressWarnings("serial")
class Human_Ranger extends Human{
	public Human_Ranger(String n, String w, String a, String s){
		race_class="Ranger";
		nickname=n;
		weapon=w;
		armor=a;
		skill=s;
		ranged_attack+=20;
		attack_speed+=10;
	}
}

public class Back_Panel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	JLabel background_label = new JLabel("New label");

	Main_Menu_Panel Main_Menu_Penel_object = new Main_Menu_Panel();
	
	public Back_Panel() {
		setLayout(null);
		add(Main_Menu_Penel_object);
		JLabel lbldown = new JLabel("");
		JLabel lblup = new JLabel("");
		lblup.setIcon(new ImageIcon(Main_Menu_Panel.class.getResource("/create/characters/img/pauza-ros.png")));
		lblup.setBounds(-5, 0, 1280, 80);
		add(lblup);
		
		lbldown.setIcon(new ImageIcon(Main_Menu_Panel.class.getResource("/create/characters/img/pauza-ros2.png")));
		lbldown.setBounds(-5, 925, 1280, 80);
		
		add(lbldown);
		background_label.setIcon(new ImageIcon(Author_Panel.class.getResource("/create/characters/img/Start.gif")));
		background_label.setBounds(0, 0, 1280, 1024);
		

	}

}
