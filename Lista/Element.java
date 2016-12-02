package lista;

public class Element<T> {
    private T element;
    private Element<T> next;
    
    Element(T element) {
        this.element = element;
        this.next = null;
    }
    
    public T getElement() {
        return this.element;
    }
    
    public Element<T> getNext() {
        return this.next;
    }
    
    public void setElement(T element) {
        this.element = element;
    }
    
    public void setNext(Element<T> element) {
        this.next = element;
    }
    
    @Override
    public String toString() {
        return this.element.toString();
    }
    
}