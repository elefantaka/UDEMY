package ConditionalInstruction7;

public class Main {
	public static void main(String[] args)
	{
        /*
        true false
        INSTRUKCJE WARUNKOWE

        if (wyrazenie)
            instrukcja;

        else
            instrukcja;



        */

		int a = 5,
				b = 5;
		System.out.println(a != b); //sa od siebie rozne, wiec prawda

		if (a != b)
			System.out.println("test");


		if (a > b)
			System.out.println("a > b");
		else
			System.out.println("a <= b");

		if (a > b)
			System.out.println("a > b");
		else if (a < b)
		{
			System.out.println("a < b");
			System.out.println("tak to dziala");
		}
		else
		{
			System.out.println("a == b");
			System.out.println("lala");
		}
	}
}
