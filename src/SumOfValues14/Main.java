package SumOfValues14;

public class Main {
	public static void main(String[] args) {
		int[] liczby = {1, 12, 41, 12, 51, 12};

		int suma = 0;

		for (int i = 0; i < liczby.length; i++)
		{
			suma += + liczby[i];
		}
		System.out.println(suma);
	}
}
