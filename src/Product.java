import java.util.Scanner;

public class Product {
	private int first = 100;
	private double second = 100;
	
	public void init(int callor, double weight) {
		first = callor;
		second = weight;
		
	}
	
	public int GetFirst() {
		return first;
	}
	
	public double GetSecond() {
		return second;
	}
	
	public void Read() {
		Scanner sc = new Scanner(System.in);
		first = sc.nextInt();
		second = sc.nextDouble();
	}
	
	public void Display() {
		System.out.println("Callories per 100 gramm : " + first + "\nWeight of whole dish: " + second + "\n");
	}
}
