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
public class PrbListass
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Listas obj = new Listas();
        
        Nodo n1 = new Nodo("A",null);  //A
        Nodo n2 = new Nodo("B",null);  //B
        Nodo n3 = new Nodo("C",null);  //C
       // Nodo n4 = new Nodo(5);
        
       //System.out.println(obj.r.getAnt());
       //obj.r.setSig(null);
//       Nodo aux = obj.r;
//       //obj.r= aux;
//        System.out.println("aux  ="+ aux);
//        System.out.println("r  ="+ obj.r);
//        System.out.println("******************");
        obj.inserta(n1);
        obj.inserta(n2);
        obj.inserta(n3);
       // obj.insertaLista(n4);
        
        
       obj.recorrido();
        
       Nodo ne =obj.elimina("G");
       if(ne !=null)
       {
           System.out.println("NODO ELIMINADO = " +ne.getD());
       }
//       aux = obj.r.getSig().getSig();
//        System.out.println("aux apunta =  "+ aux);
//        
//        char car = (char) obj.r.getSig().getSig().getD();
//        System.out.println("car = "+ car );
//       
//       // aux = obj.r.getSig().getSig().getSig().getSig();
//       aux = obj.r.getSig();
//       System.out.println("aux apunta =  "+ aux);
//        System.out.println("dato apuntado por aux = " + (char)aux.getD());
//        Nodo aux2 = null; //Nodo aux2 = obj.r.getSig().getSig().getSig();
//       
//        //aux2 = obj.r.getSig().getSig();
//        aux2 = aux.getSig();
//         System.out.println("AUX2 = "+aux2);
//         
//         obj.r.setSig(aux.getSig());//obj.r.setSig(aux2);//obj.r.setSig(obj.r.getSig().getSig());
//         System.out.println("R de siguiente apunta = "+ obj.r.getSig());
         obj.recorrido();
//        System.out.println(obj.r.getSig().getSig().getD());
//        System.out.println("sigiente de R = "+obj.r.getSig().getD());
//        aux = obj.r.getSig();
//        System.out.println("aux = " +aux.getD());
        
//        Nodo ne=obj.eliminaLista(4);
//        if(ne != null)
//        {
//            System.out.println("Dato eliminado = "+ ne.getD());
//        }
//        
//        obj.recorrido();
    
    }
    
}
