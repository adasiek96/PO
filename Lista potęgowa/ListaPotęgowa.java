package listapotęgowa;

import java.util.ArrayList;

public class ListaPotęgowa {

    public static void main(String[] args) {
        
        ArrayList<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(-3);
        l.add(23);
        
        Potęgowa p = new Potęgowa();
        p.Stwórz(l);
        p.Wypisz();
    }
    
}