/*
	Creado por: 
	Johnny del Cid 13032
	Sergio Cancinos 13062
	Luis Carlos Ralón 13030
	AbstractList.java 
	Clase abstracta que se encarga de crear los métodos para las listas
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