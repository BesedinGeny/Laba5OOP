import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Привет");
		Scanner scan = new Scanner(System.in);
		//int n = scan.nextInt();
		//System.out.println(n);
		Product meat = new Product();
		meat.init(10, 100);
		meat.Display();
	}
}
