//-------------------------------------------------------------------------------------New_Character interface
interface New_Character {
	public void ChangeNickname(String change_name);
	public void ChangeWeapon(String change_weapon);
	public void ChangeArmor(String change_armor);
	public void ChangeSkill(String change_skill);
	public void ShowInfo();
	
}
//-------------------------------------------------------------------------------------ORC abstract class
abstract class Orc implements New_Character{
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
abstract class Human implements New_Character{
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
class Orc_Warrior extends Orc{
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
class Orc_Ranger extends Orc{
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

//-----------------------------------------------------------------------------------------------MAIN
public class Creator {
	public static void main(String[]args){
		Orc_Warrior orc_warrior = new Orc_Warrior("Darek","Mace","Crystalline","Eternal Vitality");
		orc_warrior.ShowInfo();		
		System.out.println("\n------------------------------------------");
		
		Human_Warrior human_warrior = new Human_Warrior("Mietek","Sword","Golden","Crytical Aura");
		human_warrior.ShowInfo();		
		System.out.println("\n------------------------------------------");

		Orc_Mage orc_mage = new Orc_Mage("Rakietowy","Rod","Frozen","Strike Bash");
		orc_mage.ShowInfo();
		System.out.println("\n------------------------------------------");
		
		Human_Mage human_mage = new Human_Mage("Kaszanka","Staff","Lighting","Fake Death");
		human_mage.ShowInfo();
		System.out.println("\n------------------------------------------");
		
		Orc_Ranger orc_ranger = new Orc_Ranger("Jemryz","Ashwood Crossbow","Desert","Crossbow Mastery");
		orc_ranger.ShowInfo();
		System.out.println("\n------------------------------------------");
		
		Human_Ranger human_ranger = new Human_Ranger("Pepsi","Hunting Bow","Winged","Murder Shot");
		human_ranger.ShowInfo();
		System.out.println("\n------------------------------------------");
		
		human_ranger.ChangeNickname("Change Nickname Test");
		human_ranger.ChangeWeapon("Change Weapon Test");
		human_ranger.ChangeArmor("Change Armor Test");
		human_ranger.ChangeSkill("Change Skill Test");
		human_ranger.ShowInfo();
		System.out.println("\n------------------------------------------");

		Human_Ranger human_ranger2 = new Human_Ranger("Pepsi2","test","test","test");
		human_ranger2.ShowInfo();
		
	}
}
	
