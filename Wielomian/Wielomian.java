package wielomian;

import java.util.Scanner;

public class Wielomian {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int size1, size2;
        
        System.out.print("Podaj stopień pierwszego wielomianu: ");
        size1 = scan.nextInt() + 1;
        int[] w1 = new int[size1];
        for (int i = size1 - 1; i >= 0; i--) {
            System.out.print("Podaj współczynnik pierwszego wielomianu przy x^" + i + ": ");
            w1[i] = scan.nextInt();
        }
        
        System.out.print("Podaj stopień pierwszego wielomianu: ");
        size2 = scan.nextInt() + 1;
        int[] w2 = new int[size2];
        for (int i = size2 - 1; i >= 0; i--) {
            System.out.print("Podaj współczynnik drugiego wielomianu przy x^" + i + ": ");
            w2[i] = scan.nextInt();
        }
        Operacje ww1 = new Operacje(w1, size1);
        Operacje ww2 = new Operacje(w2, size2);
        System.out.print("Wynik dodawania: ");
        ww1.dodaj(ww2);
        
        System.out.print("Wynik odejmowania: ");
        ww1.odejmij(ww2);
        
        System.out.print("Wynik mnożenia: ");
        ww1.pomnóż(ww2);
        
    }
}
