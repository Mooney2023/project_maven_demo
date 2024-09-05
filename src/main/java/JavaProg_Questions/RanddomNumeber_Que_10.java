package JavaProg_Questions;

import java.util.Random;



public class RanddomNumeber_Que_10 {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int randomNumber = random.nextInt(100)+ 1;
	System.out.println(" random Number between 1 and 100 is :" +randomNumber);
		
	}

}
