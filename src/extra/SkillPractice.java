package extra;

import java.util.Random;

import javax.swing.JOptionPane;

public class SkillPractice {
public static void main(String[] args) {

SkillPractice skills = new SkillPractice();
          	skills.skill1();
          	skills.skill2();
          	skills.skill3();
          	skills.skill4();
          	skills.skill5();
}

void skill1() {
// Use pop-ups for the following.
// Ask the user how many dimes they have
	String dimes = JOptionPane.showInputDialog("How many dimes do you have?");




// Tell them how many cents they have (hint multiply by 10)
	int dimes2 = Integer.parseInt(dimes);
	JOptionPane.showMessageDialog(null, "You have "+dimes2*10+" cents.");




// Ask the user how tall they are (inches)
	String interesting=JOptionPane.showInputDialog("How tall are you? (inches)");
	int interesting2 = Integer.parseInt(interesting);




// If they are shorter than 36 inches, tell them to eat their Wheaties
	if(interesting2<=36) {
		JOptionPane.showMessageDialog(null, "Eat your Wheaties");
	}
	




}

void skill2() { // Write a loop to print every third number between 1 and 30 to the console 
	for (int i = 1; i < 31; i++) {
		if(i%3==0) {
		System.out.println(i);
	}
	}







}

void skill3() { // Get a random number that is less than 20 and print it to the console 
	Random ran = new Random();
	int cool = ran.nextInt(20);
	System.out.println(cool);
	



// Get another random number that is less than 10 and print it to the console 
	int impossible = ran.nextInt(10);


// Using a pop-up, tell the user the difference between the numbers // Hint: use subtraction 
	int running = cool-impossible;
	JOptionPane.showMessageDialog(null, "The diiference between the two numbers is "+running+".");



}

void skill4() { // In a pop-up, ask the user for the city they live in 
	String home = JOptionPane.showInputDialog("What city do you live in?");



// If they answered "San Diego", tell them they live in America's Finest City 
	if(home.equalsIgnoreCase("San Diego")) {
		JOptionPane.showMessageDialog(null, "You live in America's finest city.");
	}



// Otherwise, tell them to move to San Diego 
	else {
		JOptionPane.showMessageDialog(null, "Move to San Diego!");
	}



// Create a variable - cars - and initialize it to the number of cars your family has.
	String cars = JOptionPane.showInputDialog("How many cars does you family have?");
	int cars2 = Integer.parseInt(cars);
	// If there are 0 cars, use a pop-up to display, "I bet you use public transportation."
	if(cars2==0) {
		JOptionPane.showMessageDialog(null, "I bet you use public transportation.");
	}
	



// If there is 1 car, use a pop-up to ask the make/model of the car 
	if(cars2==1) {
		JOptionPane.showInputDialog("what is the model?");
	}



// If there is more than 1 car, use a pop-up to display how many wheels the // cars have between them.
	if(cars2>=1) {
		JOptionPane.showInputDialog("How many wheels do the cars have between them?");
	}



}

void skill5() { // In a pop-up, ask the user for the name of their school 
	String school = JOptionPane.showInputDialog("What is your school called?");



// In another pop-up, tell the user, that their school is a fantastic school. // You must include the name of the school in the message. 
	JOptionPane.showMessageDialog(null, school+"is a fantastic school.");



}
}

