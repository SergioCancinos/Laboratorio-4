/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
