package JavaProg_Questions;

public class ReverseString_Que_7 {

	public static void main(String[] args) {
		String str = " I can do it";
		String newStr = "";
		for(int i =0; i<str.length(); i++) {
			
			char ch = str.charAt(i);
			newStr =ch+newStr;
			
		}
		System.out.println(newStr);
	}

}
