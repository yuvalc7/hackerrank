import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter {

	public static void main(String[] args) {
		solution();
	}
	
	
	public static void solution() {
		Scanner scanner = new Scanner(System.in);
		double payment = scanner.nextDouble();
		scanner.close();

		Locale INDIA = new Locale("en", "IN");//Creates a new Locale with English as the language and India as the country
        //Locale isreal = new Locale("en" , "ISREAL");
		String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
		String india = NumberFormat.getCurrencyInstance(INDIA).format(payment);
		String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
		String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
		//String is = NumberFormat.getCurrencyInstance(isreal).format(payment);
		
		System.out.println(us);
	}


}
