package Loops12;

public class Main {

	public static void main(String[] args) {
		String[] kursyProgramowania =
				{
						"Java",
						"Java Aplikacje",
						"Java Strumienie",
						"Java aspekty zaawansowane",
						"Java Android",
						"C#",
						"C# Tworzenie Aplikacji",
						"C# LINQ",
						"Pascal",
						"AutoIT"

				};

		// for (inicjalizacja zmiennych; warunek wykonania petli; co ma sie stac po intrukcji wszystkih petli)
		// for - sprawdza warunek na samym starcie
		/*for(int i = 0; i < kursyProgramowania.length; i++)
		{
			System.out.println(kursyProgramowania[i]);


		}*/

		/*int i = 0;
		do     tutaj warunek nie jest sprawdzany na poczatek, zawsze raz sie wywola (petla do while)
		{
			System.out.println(kursyProgramowania[i]);

			i++;


		} while(i < kursyProgramowania.length); */


		for (String myValue : kursyProgramowania) //ulepszona petla for
		{
			System.out.println(myValue);
		}


		int[] wielokrotnosc =
				{
						10, 20, 30, 40, 50, 60, 70, 80, 90, 100
				};

		int a = 0;
		while (a < wielokrotnosc.length) {
			System.out.println(wielokrotnosc[a]);
			a++;
		}


	}
}
