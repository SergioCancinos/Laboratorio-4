/*
	Creado por: 
	Johnny del Cid 13032
	Sergio Cancinos 13062
	Luis Carlos Ralón 13030
	ListFactory.java
	Factory que se encarga de administrar los tipos de lista dependiendo
        de la decisión del usuario.
*/
package Lab4;

/**
 *
 * @author Dell Latitude
 */
class ListFactory<E> {
    public List<E> getList(String entry) {
    // seleccion de la implementacion a utilizar:
        if (entry.equals("4"))
            return new singlyLinkedList<E>(); //regresa lista con nodo simple
	if (entry.equals("5"))
            return new doubleLinkedList<E>(); //regresa lista con doble nodo
        if (entry.equals("6"))
            return new CircularList<E>();// regresa lista circular
        else
            return null;
    }
}
