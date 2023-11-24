import java.util.Scanner;

/*Korisnik pogađa vrijednost broja definiranog u programu (može biti predefiniran, kao
        konstanta). Računalo mu vraća poruke veći/manji dok god ga ne pogodi. Kada ga pogodi,
        ispiše mu broj pokušaja (npr. “Bravo! Pogodio/la si broj zadan u programu, trebalo ti je 7
        pokušaja”).*/
public class Main {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
             int cilj = 8;

            int pokusaj = 0;
            int number;
            while ((number = scanner.nextInt()) != cilj) {
                System.out.println(number > cilj ? "manji" : "veci");
                pokusaj++;
            }

            System.out.printf("Bravo! Pogodio/la si broj zadan u programu, trebalo ti je %d pokušaja\n", pokusaj);
        }

}