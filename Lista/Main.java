package lista;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        
        Lista<Integer> lista = new Lista();
        lista.dodajNaPoczątek(5);
        lista.dodajNaPoczątek(8);
        lista.dodajNaPoczątek(2);
        lista.dodajNaKoniec(6);
        lista.dodajNaKoniec(4);
        lista.dodajNaPoczątek(-42);
        lista.dodajNaKoniec(42);
        
        Iterator<Integer> it = lista.iterator();
        while(it.hasNext()) {
            Object element = it.next();
            System.out.print(element + " ");
        }
        System.out.println();
        
        Lista<String> lista2 = new Lista();
        lista2.dodajNaPoczątek("Adam");
        lista2.dodajNaPoczątek("Marysia");
        lista2.dodajNaPoczątek("Ania");
        lista2.dodajNaKoniec("Kasia");
        lista2.dodajNaKoniec("Madzia");
        lista2.dodajNaPoczątek("Justyna");
        lista2.dodajNaKoniec("Zuza");
        
        Iterator<String> it2 = lista2.iterator();
        while(it2.hasNext()) {
            Object element = it2.next();
            System.out.print(element + " ");
        }
        System.out.println();
        
    }
    
}