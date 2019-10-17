import java.util.Scanner;

public class Dish {
	Product meat = new Product();
	Product potato = new Product();
	int cost = 1000;
	
	public void Init(int first_meat, double second_meat, int first_potato, double second_potato, int cost) {
		meat.init(first_meat, second_meat);
		potato.init(first_potato, second_potato);
		cost = 1000;
	}
	
	public int GetFirstMeat() {
		return meat.GetFirst();
	}
	
	public double GetSecondMeat() {
		return meat.GetSecond();
	}
	
	public int GetFirstPotato() {
		return potato.GetFirst();
	}
	
	public double GetSecondPotato() {
		return potato.GetSecond();
	}
	
	public void ReadMeat() {
		
		meat.Read();
	}
	
	public void ReadPotato() {
		
		potato.Read();
	}
	
	public void Display() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Potato:");
		potato.Display();
		System.out.println("Meat:");
		meat.Display();
		System.out.println("Cost:\n" + cost);
	}
	
	public double Kallorii() {
		return meat.Kalorii() + potato.Kalorii();
	}
}
