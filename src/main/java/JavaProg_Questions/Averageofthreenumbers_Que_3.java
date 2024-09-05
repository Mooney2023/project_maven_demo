package JavaProg_Questions;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Averageofthreenumbers_Que_3 {

	public static void main(String[] args) {
		int num1 = 21;
	    int num2 = 31;
		int num3 = 51;
		
		int averge = calculateAverage(num1, num2, num3);
		
		System.out.println("The given number:" + num1 +"," + num2 + "," + num3);
		
		
		System.out.println("The averege of the three numbers are :" + averge );

	}

	private static int calculateAverage(int num1, int num2, int num3) {
		
		return (num1+ num2+ num3) / 3;
	}

}
