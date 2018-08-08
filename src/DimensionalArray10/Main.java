package DimensionalArray10;

public class Main {
	public static void main(String[] args)
	{
        /*
        tablice - kontener do przechowywania informacji, przydaje sie wtedy kiedy potrzebujemy duza ilosc zmiennych int
         */

		int[] tab;

		tab = new int[5];

		tab[0] = 20;
		tab[1] = 7;
		tab[2] = 27;
		tab[3] = 15;
		tab[4] = 77;

		System.out.println(tab[1]);

		int[] tab2 = {4, 14, 5, 24, 2929, 33};
		System.out.println(tab2[tab2.length-1]);
	}
}
