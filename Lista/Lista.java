package lista;

import java.util.Iterator;

public class Lista<T> implements Iterable<T> {
    private Element<T> element;
    
    Lista() {
        this.element = null;
    }
    
    public void dodajNaPoczątek(T elem) {  
        if (this.element == null) {
            this.element = new Element(elem);
        }
        else {
            Element<T> nowy = new Element(elem);
            nowy.setNext(this.element);
            this.element = nowy;
        }
    }
    
    public void dodajNaKoniec(T elem) {
        if (this.element == null) {
            this.element = new Element(elem);
        }
        else {
            Element<T> e = this.element;
            while (e.getNext() != null) {
                e = e.getNext();
            }
            e.setNext(new Element(elem));
        }
    }

    @Override
    public Iterator<T> iterator() {
        Iterator<T> it = new Iterator<T>() {
            
            private Element<T> bieżący = element;
            
            @Override
            public boolean hasNext() {
                return bieżący != null;
            }

            @Override
            public T next() {
                Element<T> e = bieżący;
                bieżący = bieżący.getNext();
                return e.getElement();
            }

            @Override
            public void remove() {
                element = null;
            }
            
        };
        return it;
        
    }
    
}