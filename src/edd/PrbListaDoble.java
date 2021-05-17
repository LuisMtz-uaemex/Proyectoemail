/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd;

/**
 *
 * @author Mauro
 */
public class PrbListaDoble
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        ListaDoble obj = new ListaDoble();
        
        Nodo n1 = new Nodo("A", null);
        Nodo n2 = new Nodo("B",null );
        Nodo n3 = new Nodo("C",null);
        Nodo n4 = new Nodo("D",null);
        Nodo n5 = new Nodo("9",null);
        
        obj.inserta(n1);
        obj.inserta(n2);
        obj.inserta(n3);
        obj.inserta(n4);
        obj.inserta(n5);
        
        obj.recorrido();
        System.out.println("***************************************");
        obj.recorridoInverso();
        
        Nodo ne = obj.elimina("5");
        if(ne != null)
        {
            System.out.println("Dato eliminado = " + ne.getD());
        }
        
        obj.recorrido();
        System.out.println("***************************************");
        obj.recorridoInverso();
        
        
        
    }
    
}
