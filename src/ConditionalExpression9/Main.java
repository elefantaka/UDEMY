package ConditionalExpression9;

public class Main {
	public static void main(String[] args)
	{
        /*
        wyrazenie ? tu piszemy co ma sie stac jesli wyrazenie to true : co ma sie stac jesli wyrazenie jest false;


        if (x % 2 == 0)
            System.out.println("parzysta");
        else
            System.out.println("nieparzysta");
        */

		int x = 4;

		String czyParzysta = x % 2 == 0 ? "parzysta" : "nieparzysta";

		System.out.println(czyParzysta);



	}
}
