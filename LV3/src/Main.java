import java.util.Scanner;

/*
1. Napisati program koji će omogućiti unos 4 broja (koristeći petlju), te odabir što želi učiniti
(1) Izračunati aritmetičku sredinu unesenih brojeva.
(2) Izračunati sumu parnih brojeva
(3) Ispisati sve neparne unesene brojeve
Koristiti try-catch blokove za zaštitu od grešaka kao što je npr. unos znaka na mjesto
unošenja dimenzija vektora i matrice.

*/
public class Main {
    public static void main(String[] args) {
        int a, b, c, d, odabir;
        Scanner input = new Scanner(System.in);
        System.out.println("Unesite vrijednost broja a: ");
        a = input.nextInt();
        System.out.println("Unesite vrijednost broja b: ");
        b = input.nextInt();
        System.out.println("Unesite vrijednost broja c: ");
        c = input.nextInt();
        System.out.println("Unesite vrijednost broja d: ");
        d = input.nextInt();

         do{
             System.out.println("Odaberite jednu od mogucnosti: ");
            System.out.println("#####################");
            System.out.println("1: Izračunati aritmeticku sredinu unesenih brojeva.");
            System.out.println("2:Izračunati sumu parnih brojeva");
            System.out.println("3: Ispisati sve neparne unesene brojeve: ");
            System.out.println("#####################");
            odabir = input.nextInt();
            switch (odabir) {
                case 1:
                    double as =((a+b+c+d)/4);
                    System.out.println("as= "+as);
                    break;
                case 2:
                    int temp = 0;
                    if (a%2==0){
                        temp+=a;

                    }
                    if (b%2==0) {
                        temp += b;
                    }
                    if (c%2==0) {
                        temp += c;
                    }
                    if (d%2==0) {
                        temp += d;
                    }
                    else
                        break;
                    System.out.println("Suma parnih brojeva je: "+temp);

                case 3:
                    if (a%2!=0)
                        System.out.println(" "+a);
                    if (b%2!=0)
                        System.out.println(" "+b);
                    if (c%2!=0)
                        System.out.println(" "+c);
                    if (d%2!=0)
                        System.out.println(" "+d);

            }

        }while (odabir != -1);
    }

}