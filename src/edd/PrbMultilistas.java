package edd;


import edd.Multilista;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mauro
 */
public class PrbMultilistas
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Multilista ml = new Multilista(new ListaDobleCircular());
        Nodo r= null;
        
        Nodo p1 = new Nodo("Mexico",null);
        Nodo p2 = new Nodo("Alemania",null);
        Nodo p3 = new Nodo("Grecia",null);
        Nodo p4 = new Nodo("Colombia",null);
        
        
        Nodo e1 = new Nodo("CDMX",null);
        Nodo e2 = new Nodo("Berlin",null);
        Nodo e3 = new Nodo("Atenas",null);
        Nodo e4 = new Nodo("Medellin",null);
        
        Nodo esc1 = new Nodo("Argos",null);
        Nodo esc2 = new Nodo("Niños heroes",null);
        Nodo esc3 = new Nodo("Justo sierra",null);
        Nodo esc4 = new Nodo("ABC",null);
        Nodo esc5 = new Nodo("ALEM",null);
        
        String arr[]= new String[1];
        arr[0]="";
        r= ml.inserta(r, 0, arr, p1);
        arr[0]="";
        r= ml.inserta(r, 0, arr, p2);
        arr[0]="";
        r= ml.inserta(r, 0, arr, p3);
        arr[0]="";
        r= ml.inserta(r, 0, arr, p4);
        
        String arr2[]= new String[2];
        arr2[0]="Mexico";
        arr2[1]="";
        r= ml.inserta(r, 0, arr2, e1);
        arr2[0]="Alemania";
        arr2[1]="";
        r= ml.inserta(r, 0, arr2, e2);
        arr2[0]="Grecia";
        arr2[1]="";
        r= ml.inserta(r, 0, arr2, e3);
        arr2[0]="Colombia";
        arr2[1]="";
        r= ml.inserta(r, 0, arr2, e4);
        
        
        String arr3[]= new String[3];
        arr3[0]="Mexico";
        arr3[1]="CDMX";
        arr3[2]=""; 
        r= ml.inserta(r, 0, arr3, esc1);
        r= ml.inserta(r, 0, arr3, esc2);
        r= ml.inserta(r, 0, arr3, esc3);
        arr3[0]="Alemania";
        arr3[1]="Berlin";
        arr3[2]="";
        r= ml.inserta(r, 0, arr3, esc5);
//        arr2[0]="Grecia";
//        arr2[1]="Atenas";
        arr3[0]="Colombia";
        arr3[1]="Medellin";
        r= ml.inserta(r, 0, arr3, esc4);
        
       // System.out.println("dato = "+r.getD());
       ml.desplegar(r, "");
       arr3[0]="Alemania";
       arr3[1]="Berlin";
       arr3[2]="ALEM";
       Nodo ar[]= ml.elimina(r, 0, arr3);
       r=ar[1];
       ml.desplegar(r, "");
       
       arr2[0]="Mexico";
       arr2[1]="CDMX";
       ar = ml.elimina(r, 0, arr2);
       r=ar[1];
       ml.desplegar(r, "");
    }
    
}
