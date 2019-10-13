/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha2edex4;

/**
 *
 * @author tiago
 */
public class Node<T> {

    private Node<T> next;
    private Node<T> previous;
    private T element;

    public Node(T element) {
        this.element = element;
        this.next = null;
        this.previous = null;
    }

    public Node<T> getPrevious() {
        return previous;
    }

    public void setPrevious(Node<T> previous) {
        this.previous = previous;
    }
    
    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public T getElement() {
        return element;
    }

}
