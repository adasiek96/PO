package dom3;

public class Osoba {
    private String imie, nazwisko, pesel;
    public Osoba(String im, String na, String pe) {
        imie = im;
        nazwisko = na;
        pesel = pe;
    }
    public String przedstawsie() {
        if (!"brak".equals(pesel)) {
            return imie + " " + nazwisko + " " + pesel;
        }
        else {
            return imie + " " + nazwisko;
        }
    }
}
