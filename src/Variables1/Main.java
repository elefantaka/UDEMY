package Variables1;

public class Main {
	public static void main(String[] args)
	{
		String imie = "Renata";
		String nazwisko = "Wietrzyńska";

		System.out.println(" imie: " + imie + " nazwisko: " +  nazwisko);

		long a = 10255486326L;
		int b = 6;
		long c;
		short liczba = 127;


		c = a + b;

		String Imie = "Wiola"; //Imie to co innego niz imie (duza litera)

		String daneOsobowe = imie + " " + nazwisko; //drugi wyraz z duzej litery, lepiej sie czyta

		System.out.println(daneOsobowe);

		System.out.println(Imie);

		System.out.println(liczba);

        /*
        int - integer - l. calkowita
        inicjalizacja - przypisanie wartosci do zmiennej
        zmienna lokalna powinna sie zaczynac z malej litery

        Typy calkowite:
        byte - 8 bitow
        short - 16 bitow
        int - 32 bity
        long - 64 bity

        Znakowe
        char - 2 bajty
        String - ciag znakow

        Zmienne zmiennoprzecikowe:
        float - 32 bity
        double 64 bity

        NIE WOLNO:
        1) uzywac w nazwie zmiennej keywordow (public, static, void)
        2) nie wolno rozpoczac nazwy zmiennej od liczby
        3) nie wolno korzystac w nazwie zmiennej ze spacji
        */

		char znak = 'g';

		float liczba2 = 4.67f; //f jest po to aby sie upewnic, ze chcemy korzystac z float
		double liczba3 = 4.56546465;

		System.out.println(liczba2);
		System.out.println(liczba3);
	}

}
