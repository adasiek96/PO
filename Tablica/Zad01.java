package Zad01;

import java.util.Scanner;

public class Zad01 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Podaj rozmiar pierwszej tablicy: ");
        int size1 = scan.nextInt();
        int[] tab1 = new int[size1];
        System.out.println("Podaj elementy tablicy: ");
        for (int i = 0; i < size1; i++) {
            tab1[i] = scan.nextInt();
        }
        
        System.out.println("Podaj rozmiar drugiej tablicy: ");
        int size2 = scan.nextInt();
        int[] tab2 = new int[size2];
        System.out.println("Podaj elementy tablicy: ");
        for (int i = 0; i < size2; i++) {
            tab2[i] = scan.nextInt();
        }
        
        System.out.println("Wynik przecięcia tablic: ");
        int i = 0, j = 0;
        while (size1 != i && size2 != j) {
            if (tab1[i] == tab2[j]) {
                System.out.println(tab1[i]);
                i++;
                j++;
            }
            else if (tab1[i] > tab2[j]) {
                j++;
                if (j == size2) {
                    i = size1;
                }
            }
            else {
                i++;
                if (i == size1) {
                    j = size2;
                }
            }
        }
    }
}
