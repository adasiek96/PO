package bufor_cykliczny;

public class Bufor_cykliczny {
    public static void main(String[] args) {
        int size = 4;
        Bufor2 b = new Bufor2(size);
        b.Dodaj_początkowy(7);
        b.Wyświetl(b);
        b.Dodaj_końcowy(5);
        b.Wyświetl(b);
        b.Dodaj_początkowy(2);
        b.Wyświetl(b);
        b.Dodaj_końcowy(3);
        b.Wyświetl(b);
        b.Dodaj_końcowy(1);
        b.Wyświetl(b);
        b.Dodaj_początkowy(9);
        b.Wyświetl(b);
        b.Dodaj_początkowy(11);
        b.Wyświetl(b);
        b.Dodaj_końcowy(6);
        b.Wyświetl(b);
        b.Dodaj_początkowy(12);
        b.Wyświetl(b);
        b.Dodaj_końcowy(64);
        b.Wyświetl(b);
        b.Usuń_końcowy();
        b.Wyświetl(b);
        b.Usuń_końcowy();
        b.Wyświetl(b);
        b.Usuń_końcowy();
        b.Wyświetl(b);
        b.Usuń_początkowy();
        b.Wyświetl(b);
        b.Usuń_początkowy();
        b.Wyświetl(b);
        b.Usuń_końcowy();
        b.Wyświetl(b);
        b.Usuń_końcowy();
        b.Wyświetl(b);
        b.Usuń_końcowy();
        b.Wyświetl(b);
        b.Usuń_początkowy();
        b.Wyświetl(b);
        b.Usuń_początkowy();
        b.Wyświetl(b);
        b.Dodaj_końcowy(4);
        b.Wyświetl(b);
        b.Dodaj_początkowy(2);
        b.Wyświetl(b);
    }
}
