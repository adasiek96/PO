package ułamek;

import java.util.Scanner;

public class Ułamek {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int l1, l2, l3, l4, m1, m2, m3, m4;
        System.out.print("Podaj licznik pierwszego ułamka: ");
        l1 = scan.nextInt();
        System.out.print("Podaj mianownik pierwszego ułamka: ");
        m1 = scan.nextInt();
        System.out.print("Podaj licznik drugiego ułamka: ");
        l2 = scan.nextInt();
        System.out.print("Podaj mianownik drugiego ułamka: ");
        m2 = scan.nextInt();
        
        Typ_ułamek u1 = new Typ_ułamek(l1, m1);
        Typ_ułamek u2 = new Typ_ułamek(l2, m2);
        
        Typ_ułamek suma = u1.Suma(u2);
        System.out.println("Wynik sumy:");
        if (suma.getmianownik() != 1) {
            System.out.print("Licznik: ");
            System.out.print(suma.getlicznik());
            System.out.print("   Mianownik: ");
            System.out.println(suma.getmianownik());
        }
        else {
            System.out.print("Liczba: ");
            System.out.println(suma.getlicznik());
        }
        
        Typ_ułamek różnica = u1.Różnica(u2);
        System.out.println("Wynik różnicy:");
        if (różnica.getmianownik() != 1) {
            System.out.print("Licznik: ");
            System.out.print(różnica.getlicznik());
            System.out.print("   Mianownik: ");
            System.out.println(różnica.getmianownik());
        }
        else {
            System.out.print("Liczba: ");
            System.out.println(różnica.getlicznik());
        }
        
        Typ_ułamek iloczyn = u1.Iloczyn(u2);
        System.out.println("Wynik iloczynu:");
        if (iloczyn.getmianownik() != 1) {
            System.out.print("Licznik: ");
            System.out.print(iloczyn.getlicznik());
            System.out.print("   Mianownik: ");
            System.out.println(iloczyn.getmianownik());
        }
        else {
            System.out.print("Liczba: ");
            System.out.println(iloczyn.getlicznik());
        }
        
        Typ_ułamek iloraz = u1.Iloraz(u2);
        System.out.println("Wynik ilorazu:");
        if (iloraz.getmianownik() == 0)
            System.out.println("Dzielenie przez zero!");
        else if (iloraz.getmianownik() != 1) {
            System.out.print("Licznik: ");
            System.out.print(iloraz.getlicznik());
            System.out.print("   Mianownik: ");
            System.out.println(iloraz.getmianownik());
        }
        else {
            System.out.print("Liczba: ");
            System.out.println(iloraz.getlicznik());
        }
        
    }
}