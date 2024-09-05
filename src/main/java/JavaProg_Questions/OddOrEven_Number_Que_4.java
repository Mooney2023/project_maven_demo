package JavaProg_Questions;

public class OddOrEven_Number_Que_4 {

	public static void main(String[] args) {
		
		
		int[] numbers={3, 4, 5, 6,};
		for(int number : numbers) {
			if (isEven(number)) {
			System.out.println("Even number is " + "" + number);	
			}else {
				System.out.println("Odd number is " + "" + number);
			} 
		}
	}
	private static boolean isEven(int number) {
		return number% 2 == 0;
	}
	}
			
		

	



		
	
	
