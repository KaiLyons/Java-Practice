package start;

public class Fibb {
	public static void main(String[] args) {
		p(0);
		int a = 1;
		p(a);	
		a = 1;
		p(a);
		int b = a + a;
		p(b);
		while(a < 300) {
			a = a + b;
			p(a);
			b = a + b;
			p(b);
		}
	}
	public static void p(int outp) {
		System.out.println(outp);
	}
}
