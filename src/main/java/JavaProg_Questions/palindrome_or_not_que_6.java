package JavaProg_Questions;

public class palindrome_or_not_que_6 {

	public static void main(String[] args) {
		String inputString ="noon";
		
		if (isPalindrom(inputString)) {
			System.out.println("\"" + inputString +"\"is a palindrom.");
		}else {
			System.out.println("\"" + inputString +"\"is not  a palindrom.");
			
			
		}
				
	}
    private static boolean isPalindrom(String str) {
    	str = str. toLowerCase().replaceAll("^a-zA-Z0-9","");
    	
    	int left  =0;
    	 
		int right =  str.length() - 1;
    	
    	while (left < right) {
    		if (str .charAt(left) != str.charAt(right)) {
    			return false;
    }
    		left++;
        	right--;
	}
    	
       return true;
    }
    


}
    
    
