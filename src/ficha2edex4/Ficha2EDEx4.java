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
public class Ficha2EDEx4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa pessoa1 = new Pessoa("Tiago", 20);
        Pessoa pessoa2 = new Pessoa("Vitor", 21);
        Pessoa pessoa3 = new Pessoa("Carlos", 21);
        Pessoa pessoa4 = new Pessoa("Joao", 21);
        
        DoublyLinkedList<Pessoa> lista = new DoublyLinkedList<>();
        
        lista.add(pessoa1);
        lista.add(pessoa2);
        lista.add(pessoa3);
        lista.add(pessoa4);
        
        lista.print();
    }
    
}
