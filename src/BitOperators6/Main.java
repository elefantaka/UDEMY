package BitOperators6;

public class Main {
	public static void main(String[] args)
	{
        /*

        false - 0 true - 1

        OPERATORY BITOWE:
        & - iloczyn bitowy
        | - suma bitowa
        ^ - XOR eXclusive OR (albo)
        x << 1 - przesuniecie o 1 w lewo (operacja podzielenia przez 2)
        x >> 2 - przesuniecie o 2 w prawo (razy 2 do potegi)
        ~ - operator negacji

        1 2 6 = 1 * 10 ^ 2 + 2 * 10 ^ 1 + 6 * 10 ^ 0

        1 0 1 0 = 1 * 2 ^ 3 + 0 * 2 ^ 2 + 1 * 2 ^ 1 + 0 * 2 ^ 0 = 8 + 2 = 10
        1 0 1 0 = 2 ^ 3 + 2 ^ 1 = 8 + 2 = 10

        1 1 1 0 = 2 ^ 3 + 2 ^ 2 + 2 ^ 1 = 8 + 4 + 2 = 14
        1 0 1 1 = 2 ^ 3 + 2 ^ 1 + 2 ^ 0 = 8 + 2 + 1 = 11

        1 0 1 0 = 10

        0 0 0 1 - post na forum
        0 0 1 0 - edytuj forum
        0 1 0 0 - usun posta
        1 0 0 0 - ban


        ^ - XOR eXclusive OR (albo):
        1 1 - 0
        0 0 - 0
        1 0 - 1
        0 1 - 1





        */

		System.out.println(14&11);

		System.out.println(14&1); //koniunkcja - wszystko prawdziwe

	}
}
