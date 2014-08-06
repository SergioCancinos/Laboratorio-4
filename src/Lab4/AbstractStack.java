/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Lab4;

/**
 *
 * @author Dell Latitude
 * @param <E>
 */
abstract public class AbstractStack<E> implements Stack<E> {
     public boolean empty()
   // post: regresa true si el stack esta vacio
   {
      return size() == 0;
   }
}
	
   /* public boolean contains(E value)
    // pre: value is not null
    // post: returns true iff list contains an object equal to value
   {
	 return (-1 != indexOf(value));
   }
    
}*/
