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
 */
public abstract class AbstractList<E> implements List<E> {
    public AbstractList()
   // post: does nothing
   {
   }

   public boolean isEmpty()
   // post: returns true iff list has no elements
   {
      return size() == 0;
   }
  
  public boolean contains(E value)
  // pre: value is not null
  // post: returns true iff list contains an object equal to value
  {
	return -1 != indexOf(value);
  }
}
