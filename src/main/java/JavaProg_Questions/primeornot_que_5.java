package JavaProg_Questions;

public class primeornot_que_5 {

	public static void main(String[] args) {
		int[] number = {11, 4, 20, 97, 33, 16, 5};
		for(int number1 : number) {
			if (isPrime(number1)) {
				System.out.println(number1 + " " +"is  a prime number");
			} else {
				System.out.println(number1 + " " +"is not a prime number");
			}
		}
	}
   private static boolean isPrime(int number) {
 	if (number <= 1) {
		return false;
		
	}
 for (int i = 2; i <= Math.sqrt(number); i++) {
	 if(number % i == 0) {
		 return false;
	 }
 }
    return true;
    
   }
}
   
    
    
 
