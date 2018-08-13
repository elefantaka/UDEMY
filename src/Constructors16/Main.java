package Constructors16;

public class Main {
	public static void main(String[] args) {

		/*
		konstruktory - zbiory instruckji, ktore maja zostac wykonane podczas gdy tworzymy obiekty, aby wywolac konstruktor potrzebne nam slowko "new"

		slowo kluczowe this - ten, odwoluje sie do aktualne obiektu
		 */

		Punkt p = new Punkt(10, 15);
		Punkt p2 = new Punkt(10, 45);




		System.out.println("p.x " + p.x);
		System.out.println("p.y " + p.y);

		System.out.println("p2.x " + p.x);
		System.out.println("p2.y " + p.y);

	}
}
class Punkt
{
	Punkt()
	{
		System.out.println("wywolano konstruktor domyslny");
	}

	Punkt(int x, int y)
	{
		System.out.println("wywloano konstruktor z dwoma parametrami");

		this.x = x;
		this.y = y;
	}

	int x;
	int y;

}
