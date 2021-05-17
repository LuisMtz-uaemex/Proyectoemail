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
public class ColasCircularesDinamicas
{
    private Nodo a= null;

    /**
     * @return the a
     */
    public Nodo getA()
    {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(Nodo a)
    {
        this.a = a;
    }
    
    public void inserta(Nodo n)
    {
        if (a==null)
        {
            a=n;
            a.setSig(a);
        } else
        {
            n.setSig(a.getSig());
            a.setSig(n);
            a=n;
        }
    }
    
    public Nodo elimna()
    {
        if (a==null)
        {
            return null;
        } else
        {
            Nodo ne = a.getSig();
            a.setSig(ne.getSig());
            ne.setSig(null);
            if(a == ne)
            {
                a=null;
            }
            return ne;
        }
    }
}
