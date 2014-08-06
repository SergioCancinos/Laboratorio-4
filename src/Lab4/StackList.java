/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Lab4;
import java.util.*;
/**
 *
 * @author Dell Latitude
 */
public class StackList<E> extends AbstractStack<E> {
    public ListFactory miFactor = new ListFactory();
    protected List<E> data = miFactor.getList(menu());
    
    public String menu()
    {
        System.out.println("\nEscoja el tipo de lista:");
        System.out.println("\n4. Para una lista con nodo simple \n5. Para una lista con doble nodo \n6. Para una lista circular");
        return "5";
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
