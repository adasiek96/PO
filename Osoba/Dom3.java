package dom3;
import java.util.Scanner;

public class Dom3 {
    public static int size = 3;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Osoba[] tab = new Osoba[size];
        for (int i = 0; i < size; i++) {
            String a, b, c, tmp;
            System.out.println("Podaj imię: ");
            a = scan.next();
            System.out.println("Podaj nazwisko: ");
            b = scan.next();
            System.out.println("Podaj PESEL (lub wpisz 'brak'): ");
            c = scan.next();
            
            tab[i] = new Osoba(a, b, c);
        }
        for (int i = 0; i < size; i++) {
            System.out.println(tab[i].przedstawsie());
        }
    }
}
