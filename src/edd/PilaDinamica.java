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
public class PilaDinamica
{
    private Nodo tope = null;

    /**
     * @return the tope
     */
    public Nodo getTope()
    {
        return tope;
    }

    /**
     * @param tope the tope to set
     */
    public void setTope(Nodo tope)
    {
        this.tope = tope;
    }
    
    public void inserta(Nodo n)
    {
        if (n == null)
        {
            System.out.println("no se puede insertar");//cola llena
        } else
        {
            n.setSig(tope);
            tope=n;
        }
    }
    
    public Nodo elimina()
    {
        if (tope == null)
        {
            System.out.println("no hay datos en la pila");
            return null;
        } else
        {
            Nodo de = tope;
            tope=tope.getSig();
            de.setSig(null);
            return de;
        }
    }
}
