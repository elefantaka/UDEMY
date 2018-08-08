package Switch8;

public class Main {
	public static void main(String[] args)
	{
        /*
            switch - przelacznik
            mozna porownywac int i char
        */

		int a = 50;
		switch (a)
		{
			case 50:
				System.out.println("a jest rowne 50");
				break;
			case 100:
				System.out.println("a jest rowne 100");
				break;
			default:
				System.out.println("a nie jest rowne ani 50 ani 100 jest rowne " + a);
		}
	}
}
