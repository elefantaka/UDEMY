package Methods18;

public class Main {
	public static void main(String[] args) {

		/*
	void - nic nie zwraca
	metody moga przyjmowac argumenty

	 */

		Test a = new Test(); //obiekt
		a.write("Renata", "Wietrzynska"); //wywolanie metody

		Test a2 = new Test(); //obiekt
		a2.write("Michal", "Wietrzynski"); //wywolanie metody

		double result = a.division(10,0);
		System.out.println(result);
	}

}

class Test //klasa
{
	void write(String name, String surname) //metoda
	{
		System.out.println("name: " + name);
		System.out.println("surname: " + surname);

	}

	int add(int a, int b)
	{
		return a + b;
	}

	double division(double a, double b)
	{
		if (b == 0)
			return 0;
		System.out.println("lala");
		return a / b;
	}
}
//6.32 - minuta