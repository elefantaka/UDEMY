package Methods18;

public class Main {
	public static void main(String[] args) {

		/*
	void - nic nie zwraca
	metody moga przyjmowac argumenty

	 */

		Test a = new Test(); //obiekt

		a.write("Renata", "Wietrzynska"); //wywolanie metody
	}

}

class Test //klasa
{
	void write(String name, String surname) //metoda
	{
		System.out.println(name + " " + surname);
	}
}
//6.32 - minuta