package Breakcontinue;

public class Main {
	public static void main(String[] args) {

		/*
		tabliczka mnozenia - petla w petli, loop in loop

		for (int j = 1; j <= 200; j++)
		{
			for (int i = 1; i <= 10; i++)
			{
				System.out.print(i * j + " ");
			}
			System.out.println();
		} */


		for (int i = 0; i < 60; i++)
		{
			if ( i % 2 != 0)
				continue; //przerwij iteracje od tego momentu i nie wykonuj juz zadnych instrukcji po mnie
			System.out.println(i);
		}
	}
}
//break - zatrzymuje instrukcje, dalej nic sie nie dzieje
//jesli chcemy wypisac same parzyste - !=
//jesli nieparzyste - ==