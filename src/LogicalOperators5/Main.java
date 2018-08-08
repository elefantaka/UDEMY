package LogicalOperators5;

public class Main {
	public static void main(String[] args)
	{
        /*
            OPERATORY LOGICZNE:

            true lub false

            ! - operator negacji

            !(true) - false
            !(false) - true

            && - koniunkcja - "I" - w tym samym momencie

            true true - true
            true false - false
            false true - false
            false false - false

            || - alternatywa - "lub" - to lub to

            true true - true
            true false - true
            false true - true
            false false - false

            miec alternatywe - sytuacja bez wyjscia ale znajdujemy rozwiazanie
         */

		int a = 5,
				b = 5,
				c = 7;

		if (a != b || c > 12)
			System.out.println("tak");
	}
}
