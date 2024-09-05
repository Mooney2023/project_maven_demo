package JavaProg_Questions;

public class Accessingall_elements_usingFor_loop_Que_47 {

	public static void main(String[] args) {
		//Two D Array
		int[][]a = {{5,2,9},{4,6,8}};
		
		for(
				int i = 0;i<a.length;i++)
		{
			for (int j =0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
				
			}
			System.out.println();
		}
	}

}
