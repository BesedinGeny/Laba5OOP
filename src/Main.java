import java.util.Scanner;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Product meat = new Product();
		meat.init(10, 100);
		meat.Display();
		Dish StolovskayaKartoha = new Dish();
		StolovskayaKartoha.Init(10, 10, 100, 100, 50);
		StolovskayaKartoha.Display();
		Random rd = new Random(); 
		Product[] Masive = new Product [5];
		int[] mas1 = new int [5];
		//mas1 = new int[5];
		double[] mas2 = new double [5];
		//mas2 = new double[5];
		//Masive = new Product[5];
		int m1= -1;
		double m2 = -1;
		for ( int i = 0; i < 5; i++) {
			Masive[i] = new Product();
			int f = rd.nextInt() % 100;
			double s = rd.nextDouble() * 100 + 50;
			Masive[i].init(f, s);
			Masive[i].Display();
			mas1[i] = f;
			mas2[i] = s;
			if (f > m1)  m1 = f;
			if (s > m2) m2 = s;
		}
		System.out.println("Array of ints and doubles:\n");
		for (int i = 0; i < 5; i++) {
			System.out.println("Int: " + mas1[i] +", Double: " + mas2[i]);
		}
		System.out.printf("Max Int: " + m1 + ", Max Double: " + m2);
	}
}
