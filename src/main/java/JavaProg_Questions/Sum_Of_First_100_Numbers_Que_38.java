package JavaProg_Questions;

public class Sum_Of_First_100_Numbers_Que_38 {

	public static void main(String[] args) {
		// Initializing a variable to store the sum
		int sum = 0;
		
		for (int i = 1; i<= 100; i++) {
			// Adding thr current number to the sum
			sum += i;
			
			System.out.println("Sum of the first 100 numbers is:" + sum);
			
		}

	}

}
