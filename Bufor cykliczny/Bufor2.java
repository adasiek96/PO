package bufor_cykliczny;

public class Bufor2 {
    private int[] bufor;
    private int liczba_elementów, p, k, s;
    
    public Bufor2(int size) {
        bufor = new int[size];
        p = 0;
        k = 0;
        liczba_elementów = 0;
        s = size;
    }
    
    void Wyświetl(Bufor2 b) {
        for (int i = 0; i < b.s; i++) {
            System.out.print(bufor[i] + " ");
        }
        System.out.println("");
    }
    
    boolean Czy_pusty() {
        if (liczba_elementów == 0) {
            return true;
        }
        else {
            return false;
        }
    }
    
    int Liczba_elementów() {
        return liczba_elementów;
    }
    
    void Powiększ_bufor(int p1, int k1) {
        int n = bufor.length * 2;
        int[] bufor2 = new int[n];
        for (int i = 0; i <= k1; i++) {
            bufor2[i] = bufor[i];
        }
        for (int i = p1 + bufor.length; i < n; i++) {
            bufor2[i] = bufor[i - bufor.length];
        }
        if (p == 0) {
            p = bufor.length;
        }
        k += bufor.length;
        s *= 2;
        bufor = bufor2;
    }
    
    void Dodaj_początkowy(int a) {
        int n = bufor.length;
        if (liczba_elementów == 0) {
            p = 0;
            k = n - 1;
        }
        if (liczba_elementów == n) {
            int p1 = p;
            int k1 = k;
            Powiększ_bufor(p1, k1);
        }
        bufor[p] = a;
        p = (p + 1) % n;
        liczba_elementów++;
    }
    
    void Dodaj_końcowy(int a) {
        int n = bufor.length;
        if (liczba_elementów == 0) {
            k = 0;
            p = 1;
        }
        if (liczba_elementów == n) {
            int p1 = p;
            int k1 = k;
            Powiększ_bufor(p1, k1);
        }
        bufor[k] = a;
        k = (k - 1);
        if (k < 0) {
            k += n;
        }
        liczba_elementów++;
    }
    
    void Zmniejsz_bufor(int p1, int k1) {
        int n = bufor.length / 2;
        int[] bufor2 = new int[n];
        k1++;
        for (int i = p1 - n; i < p1; i++) {
            if (i < 0) {
                bufor2[i + n] = bufor[i + 2 * n];
            }
            else {
                bufor2[i] = bufor[(i + 2 * n) % (2 * n)];
            }
        }
        if (p >= n) {
            p -= n;
        }
        if (k >= n) {
            k -= n;
        }
        s /= 2;
        bufor = bufor2;
    }
    
    void Usuń_początkowy() {
        p--;
        if (p < 0) {
            p = bufor.length - 1;
        }
        if (bufor[p] == 0) return;
        bufor[p] = 0;
        liczba_elementów--;
        if (liczba_elementów <= s / 4 && s > 4) {
            int p1 = p;
            int k1 = k;
            Zmniejsz_bufor(p1, k1);
        }
    }
    
    void Usuń_końcowy() {
        int n = bufor.length;
        k++;
        if (k == n) {
            k = 0;
        }
        if (bufor[k] == 0) return;
        bufor[k] = 0;
        liczba_elementów--;
        if (liczba_elementów <= s / 4 && s > 4) {
            int p1 = p;
            int k1 = k;
            Zmniejsz_bufor(p1, k1);
        }
    }
}
