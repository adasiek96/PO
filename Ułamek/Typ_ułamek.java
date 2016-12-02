package ułamek;

public class Typ_ułamek {
    private final int licznik;
    private final int mianownik;
    
    Typ_ułamek(int l, int m) {
        licznik = l;
        mianownik = m;
    }
    
    int getlicznik() {
        return licznik;
    }
    
    int getmianownik() {
        return mianownik;
    }
    
    int NWD(int a, int b) {
        if (a < 0)
            a *= -1;
        while (a != b) {
            if (a > b)
                a -= b;
            else
                b -= a;
        }
        return a;
    }
    
    int NWW(int a, int b) {
        return (a * b) / NWD(a, b);
    }
    
    Typ_ułamek Skróć(Typ_ułamek u) {
        int d = NWD(u.licznik, u.mianownik);
        Typ_ułamek uu = new Typ_ułamek(u.licznik / d, u.mianownik / d);
        return uu;
    }
    
    public Typ_ułamek Suma(Typ_ułamek u2) {
        int l1, l2, m1, m2, l, m;
        l1 = this.licznik;
        m1 = this.mianownik;
        l2 = u2.licznik;
        m2 = u2.mianownik;
        if (m1 < 0) {
            l1 *= -1;
            m1 *= -1;
        }
        if (m2 < 0) {
            l2 *= -1;
            m2 *= -1;
        }
        if (m1 != m2) {
            int d = NWW(m1, m2);
            l = l1 * d / m1 + l2 * d / m2;
            Typ_ułamek u = new Typ_ułamek (l, d);
            return Skróć(u);
        }
        else {
            Typ_ułamek u = new Typ_ułamek (l1 + l2, m1);
            return Skróć(u);
        }
    }
    
    public Typ_ułamek Różnica(Typ_ułamek u2) {
        Typ_ułamek u = new Typ_ułamek(u2.licznik * (-1), u2.mianownik);
        return Suma(u);
    }
    
    public Typ_ułamek Iloczyn(Typ_ułamek u2) {
        int l1, l2, m1, m2, l, m;
        l1 = this.licznik;
        m1 = this.mianownik;
        l2 = u2.licznik;
        m2 = u2.mianownik;
        if (m1 < 0) {
            l1 *= -1;
            m1 *= -1;
        }
        if (m2 < 0) {
            l2 *= -1;
            m2 *= -1;
        }
        Typ_ułamek u = new Typ_ułamek(l1 * l2, m1 * m2);
        Skróć(u);
        return u;
    }
    
    public Typ_ułamek Iloraz(Typ_ułamek u2) {
        if (u2.licznik == 0) {
            Typ_ułamek u = new Typ_ułamek(0, 0);
            return u;
        }
        Typ_ułamek u = new Typ_ułamek(u2.mianownik, u2.licznik);
        return Iloczyn(u);
    }
}
