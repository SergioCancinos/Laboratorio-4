/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Lab4;


/*
	Creado por: 
	Johnny del Cid 13032
	Sergio Cancinos 13062
	Luis Carlos Ralón 13030
	Factory.java
	Factory que se encarga de administrar que tipo de almacenamiento se escoje
        dependiendo de la decisión del usuario.
*/
class Factory<E> {
    //selecciona la implementacion a utilizar para un stack
    //se utiliza el patron Factory
    public Stack<E> getStack(String entry) {
    // seleccion de la implementacion a utilizar:
        if (entry.equals("1"))
            return new StackArrayList<E>(); //regresa ArrayList
	if (entry.equals("2"))
            return new StackVector<E>(); //regresa Vector
        if (entry.equals("3"))
            return new StackList<E>(); //regresa una lista
        else
            return null;
    }


//selecciona la implementacion a utilizar para un list
//se utiliza el patron Factory	
	/*public List<E> getList(String entry)	{
	// seleccion de la implementacion a utilizar:
	if(entry.equals("3"))
		return new singlyLinkedList<E>(); //regresa una lista simple
	if(entry.equals("4"))
		return new doubleLinkedList<E>(); //regresa una lista doble
	if(entry.equals("5"))
		return new circular<E>(); //regresa una lista circular
	}*/
}
