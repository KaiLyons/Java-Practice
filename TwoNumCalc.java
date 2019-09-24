package start;
import java.util.*;
public class TwoNumCalc {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		p("Please enter a whole number: ");
		int one = s.nextInt();
		p("Another whole number:");
		int two = s.nextInt();
		int AddAns = one + two;
		int MultAns = one * two;
		int DivAns = one / two;
		int SubAns = one - two;
		
		p("Added together " + AddAns + " and Multiplied " + MultAns + ", Divided " + DivAns + " and subtracted " + SubAns);
		s.close();
	}
	public static void p(String oo) {
		System.out.println(oo);
	}
}
