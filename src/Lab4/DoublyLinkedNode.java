/*
	Creado por: 
	Johnny del Cid 13032
	Sergio Cancinos 13062
	Luis Carlos Ralón 13030
	CircularList.java
	Tipo de lista 	
*/
package Lab4;

public class DoublyLinkedNode<E> {
    protected E data;
    protected DoublyLinkedNode<E> nextElement;
    protected DoublyLinkedNode<E> previousElement;

    public DoublyLinkedNode(E v,
                            DoublyLinkedNode<E> next,
                            DoublyLinkedNode<E> previous)
    {
        data = v;
        nextElement = next;
        if (nextElement != null)
            nextElement.previousElement = this;
        previousElement = previous;
        if (previousElement != null)
            previousElement.nextElement = this;
    }

    public DoublyLinkedNode(E v)
    // post: constructs a single element
    {
        this(v,null,null);
    }
    
    public DoublyLinkedNode<E> previous()
    {
        return previousElement;
    }
    
    public void setNext(DoublyLinkedNode<E> v)
    {
        nextElement = v;
    }
    
    public DoublyLinkedNode<E> next()
    {
        return nextElement;
    }
    
    public void setPrevious(DoublyLinkedNode<E> previous)
    {
        previousElement = previous;
    }
    
    public E value()
    {
        return data;
    }
    
    public void setValue(E value)
    {
        data = value;
    }

}
