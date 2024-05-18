package application;
import java.util.ArrayList;
import java.util.Scanner;
public class WeeklyTemps {   
	public static void main(String[] args) {
		ArrayList<String>days = new ArrayList<String>();
		ArrayList<Double>temperatures = new ArrayList<Double>();
		Scanner userInput = new Scanner (System.in);
		
		System.out.println("This program allows you to record a weeks worth of daily temperatures.");
		
		for (int i = 0; i < 7; i++) {
			System.out.println("Enter the day (Monday, Tuesday, etc.) you'd like to record: ");
			String day = userInput.nextLine();
			days.add(day);
			
			System.out.println(day + "'s temperature: ");
			double temperature = userInput.nextDouble();
			userInput.nextLine();
			temperatures.add(temperature);	
		}
		
		while (true) {
			System.out.print("\n" + "Enter 'day' for a specific day or 'week' for entire week and average temperature: ");
			String command = userInput.nextLine();
			
		if (command.equals("day")) {
			System.out.println("What day do you want to see?: ");
			String day = userInput.nextLine();
			
			int index = days.indexOf(day);
			if (index != -1) {
				System.out.println(day + " was " + temperatures.get(index) + " degrees Fahrenheit.");
			}
			
			else {
				System.out.println("Invalid input. *Hint case sensitive*");
			}
		}
	
		else if (command.equals("week")) {
			
			double sum = 0;
			for (double temperature : temperatures) {
				sum += temperature;
			}
			double average = sum / temperatures.size();
			
			for (int i = 0; i < 7; i++) {
				System.out.println(days.get(i) + " was " + temperatures.get(i) + " degrees Fahrenheit.");
			}
			
			System.out.println("The weekly average was " + average + " degrees Fahrenheit.");
		}
		
		else {
			System.out.println("Invalid input. *Hint case sensitive*");
		}
		}
	}
}
