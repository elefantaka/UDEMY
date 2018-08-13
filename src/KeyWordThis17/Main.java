package KeyWordThis17;

public class Main {
	/*
	this to z ang. 'ten'. W programowaniu lepiej brzmi coś w stylu: 'z tego (obiektu)'.

Gdy wpiszesz 'this.' i skorzystasz ze skrótu CTRL + SPACE to dostaniesz dostęp do wszystkiego na czym możesz operować z pomocą this. A będą to wszystkie metody/właściwości, które można wywołać/zmienić, gdy pracujesz na jakimś konkretnym obiektem. Przypominam, że klasa to forma do tworzenia obiektów. Możesz stworzyć z jednej klasy 100 różnych obiektów.

Gdy masz np. klasę Samochod i zrobisz:

Samochod samochody = new Samochod[3];

I teraz napiszesz:

samochody[0] =  new Samochod("Ford");

samochody[1] = new Samochod("Audi");

samochody[2] = new Samochod("Fiat");

To samochody[0] i samochody[1] oraz samochody[2] to są trzy różne obiekty z tej samej formy. Każdy z nich ma te same właściwości (zmienne), ale ich wartości są różne.

Kiedy wywołujesz powiedzmy metodę:

    String getNazwaSamochod(){  return this.nazwaSamochodu;}

w taki sposób:

samochody[0].getNazwaSamochod();

To Twoje 'this' to w tym momencie jest: samochody[0]

Kiedy wywołasz:

samochody[1].getNazwaSamochod();

To Twoje 'this' to w tym momencie jest samochody[1]

samochody[2].getNazwaSamochod();

To Twoje 'this' to w tym momencie jest samochody[2]

tzn. 'this' zmienia swoją postać w zależności od tego na jakim obiekcie operujesz. 'this' to obiekt na którym aktualnie operujesz.
	 */
}
