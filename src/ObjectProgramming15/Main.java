package ObjectProgramming15;

public class Main {
	public static void main(String[] args) {


	/*
		Obiekty - pojemniki do przechowywania zmiennych i funkcji tematycznie ze soba powiazanych do dalszego latwiejszego ponowanego uzycia
		Klasy - foremki do tworzenia egzemplarzy obiektow, do nich wrzucamy obiekty, np. pracownik: ile ma lat, jak dlugo pracuje, jaka ma pensje

		Properties - wlasciwosci
		Metody - funkcje

		metody z malych liter
		klasy z duzych liter

		package - PAKIET!!!
	 */

		Monitor abc = new Monitor();
		abc.width = 124;
		Monitor abc2 = new Monitor();
		abc2.width = 215;

		System.out.println(abc.width);
		System.out.println(abc2.width);


	}
}

class Monitor
{
	int width;
	int height;

	void turnOn()
	{

	}

	void turnOff()
	{

	}
}
