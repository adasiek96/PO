package listapotęgowa;

import java.util.ArrayList;
import java.util.Iterator;

public class Potęgowa<T> {
    
    private ArrayList<ArrayList<T>> lista;
    
    Potęgowa() {
        
    }
    
    private Boolean[] zamień(int a, int n) {
        Boolean[] tab = new Boolean[n];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = false;
        }
        int i = 0;
        while (a != 0) {
            if (a % 2 == 1) {
                tab[i] = true;
            }
            a = a / 2;
            i++;
        }
        return tab;
    }
    
    public void Stwórz(ArrayList<T> l) {
        this.lista = new ArrayList<>();
        for (int i = 0; i < Math.pow(2, l.size()); i++) {
            Boolean[] tab = zamień(i, l.size());
            ArrayList<T> pom = new ArrayList<>();
            for (int j = 0; j < tab.length; j++) {
                if (tab[j]) {
                    pom.add(l.get(j));
                }
            }
            this.lista.add(pom);
        }
    }
    
    public void Wypisz() {
        Iterator<ArrayList<T>> it = this.lista.iterator();
        while(it.hasNext()) {
            ArrayList<T> element = it.next();
            System.out.print("{ ");
            wypiszPom(element);
            System.out.print("}");
            if (it.hasNext()) {
                System.out.print(", ");
            }
            else {
                System.out.println(" ");
            }
        }
    }
    
    private void wypiszPom(ArrayList<T> t) {
        Iterator<T> it = t.iterator();
        while(it.hasNext()) {
            Object element = it.next();
            System.out.print(element + " ");
        }
    }
    
}