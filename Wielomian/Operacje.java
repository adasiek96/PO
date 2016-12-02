package wielomian;

public class Operacje {
    private int size;
    private int[] wiel;
    
    Operacje (int w[], int size) {
        this.size = size;
        wiel = new int[this.size];
        System.arraycopy(w, 0, this.wiel, 0, this.size);
    }
    
    void dodaj(Operacje w2) {
        int j = 0, s;
        if (this.size != w2.size) {
            s = Math.max(this.size, w2.size);
            int[] w = new int[s];
            for (int i = 0; i < this.size; i++) {
                w[i] += this.wiel[i];
            }
            for (int i = 0; i < w2.size; i++) {
                w[i] += w2.wiel[i];
            }
            wyświetl(w, s);
        }
        else {
            while (this.wiel[this.size - 1 - j] == (-1 * w2.wiel[this.size - 1 - j])) {
                j++;
            }
            s = this.size - j;
            int[] w = new int[s];
            for (int i = 0; i < s; i++) {
                w[i] = this.wiel[i] + w2.wiel[i];
            }
            wyświetl(w, s);
        }
    }
    
    void odejmij(Operacje w2) {
        Operacje ww2 = new Operacje(w2.wiel, w2.size);
        for (int i = 0; i < w2.size; i++) {
            ww2.wiel[i] *= -1;
        }
        dodaj(ww2);
    }
    
    void pomnóż(Operacje w2) {
        int s = this.size + w2.size - 1;
        int[] w = new int[s];
        for (int i = 0; i < s; i++) {
            w[i] = 0;
        }
        for (int i = 0; i < this.size; i++) {
            for (int j = 0; j < w2.size; j++) {
                w[i + j] += this.wiel[i] * w2.wiel[j];
            }
        }
        wyświetl(w, s);
    }
    
    void wyświetl(int w[], int size) {
        int z = 0, k = 0;
        for (int i = size - 1; i >= 0; i--) {
            if (w[i] != 0 && k != 0) {
                System.out.print(" + ");
            }
            if (i != 0) {
                if (w[i] > 0) {
                    System.out.print(w[i] + " * x^" + i);
                }
                else if (w[i] < 0) {
                    System.out.print("(" + w[i] + ")" + " * x^" + i);
                }
            }
            else if (i == 0) {
                if (w[i] > 0) {
                    System.out.println(w[i]);
                }
                else if (w[i] < 0) {
                    System.out.println("(" + w[i] + ")");
                }
                else {
                    System.out.println("");
                }
            }
            else {
                    z++;
                    k--;
                }
            k++;
        }
        if (z == size) {
            System.out.println("0");
        }
    }
}
