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
public class PrbListasCirculares
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        ListasCircular obj = new ListasCircular();
        
        Nodo n1 = new Nodo("3",null);
        Nodo n2 = new Nodo("1",null);
        Nodo n3 = new Nodo("5",null);
        Nodo n4 = new Nodo("4",null);
        
        //obj.recorrido();
        obj.inserta(n1); //primero en la lista
        //obj.recorrido();
        obj.inserta(n2); //antes del primero
        //obj.recorrido();
        obj.inserta(n3); //al final de la lista
        //obj.recorrido();
        obj.inserta(n4); //en medio de la lista
        obj.recorrido();
        Nodo ne =obj.elimina("2");
       if(ne !=null)
       {
           System.out.println("NODO ELIMINADO = " +ne.getD());
       }
         obj.recorrido();
    }
    
}
