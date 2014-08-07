/*
	Creado por: 
	Johnny del Cid 13032
	Sergio Cancinos 13062
	Luis Carlos Ralón 13030
	StackVector.java
	Tipo de almacenamiento 	
*/
package Lab4;

import java.util.*;

/**
 *
 * @author Dell Latitude
 */
public class StackVector<E> extends AbstractStack<E> {
     
    protected Vector<E> stack;
    
    //Constructor
    public StackVector(){
        stack = new Vector<E>(0); 
    }
    
    //Atributos 
    private int stackPointer = 0;
    private boolean empty; 
    
    
    @Override
    public void push(E item) {
        stack.addElement(item);
        stackPointer = stackPointer + 1;
        
    }

    @Override
    public E pop() {
        if(stackPointer>0){
            E last = stack.lastElement();
            stack.removeElementAt(stackPointer-1);
            stackPointer = stackPointer - 1; 
            return last;
        }
        return null;
                    
    }

    @Override
    public E peek() {
        return stack.lastElement();
    }

    @Override
    public boolean empty() {
        if (stackPointer==0)
            setEmpty(true);
        else
            setEmpty(false);
        return empty;
    }

    @Override
    public int size() {
       return stackPointer;
    }

    /**
     * @return the stackPointer
     */
    private int getStackPointer() {
        return stackPointer;
    }

    /**
     * @param stackPointer the stackPointer to set
     */
    private void setStackPointer(int stackPointer) {
        this.stackPointer = stackPointer;
    }

    /**
     * @return the empty
     */
    private boolean isEmpty() {
        return empty;
    }

    /**
     * @param empty the empty to set
     */
    private void setEmpty(boolean empty) {
        this.empty = empty;
    }
    
    
}
