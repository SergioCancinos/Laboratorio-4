/*
	Creado por: 
	Johnny del Cid 13032
	Sergio Cancinos 13062
	Luis Carlos Ralón 13030
	StackList.java
	Tipo de almacenamiento, de esta se puede escojer un tipo de lista.  	
*/
package Lab4;
import java.util.*;
import javax.swing.JOptionPane;

public class StackList<E> extends AbstractStack<E> {
    public ListFactory miFactor = new ListFactory();
    protected List<E> data = miFactor.getList(menu());
    private String res = ""; 
    
    public String menu()
    {
        res = JOptionPane.showInputDialog("\nEscoja el tipo de lista: \n4. Para una lista con nodo simple \n5. Para una lista con doble nodo \n6. Para una lista circular");
        return res;
    }
    

    public void push(E item)
    // post: the value is added to the stack
    //          will be popped next if no intervening push
    {
    	data.addFirst(item);
    }

    public E pop()
    // pre: stack is not empty
    // post: most recently pushed item is removed and returned
    {
        return data.removeFirst();
    }
    
    public E peek()
    // pre: stack is not empty
    // post: top value (next to be popped) is returned
    {
    	return data.get(size() - 1);
    }
    
    public int size()
    // post: returns the number of elements in the stack
    {
    	return data.size();
    }
    
   /* public boolean empty()
    // post: returns true if and only if the stack is empty
    {
    	return size() == 0;
    }   */ 

}
