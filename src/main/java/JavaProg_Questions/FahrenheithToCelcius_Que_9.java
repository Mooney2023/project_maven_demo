package JavaProg_Questions;

import java.util.Scanner;

public class FahrenheithToCelcius_Que_9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter temperture in fahrenheite:"+ "32");
		double fahrenheit = scanner.nextDouble();
		
		double celsius = (fahrenheit -32) * 5/9;
			
		System.out.println("temperture in celsius" + celsius);
		scanner.close();
		

	}

}
