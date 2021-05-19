package clases;

import java.io.Serializable;

/**
 *
 * @author saul1
 */
public class Nodo implements Serializable
{

    private Correos obj;
    private Nodo sig;

    public Nodo()
    {
    }

    public Nodo(Correos obj, Nodo sig)
    {
        this.obj = obj;
        this.sig = sig;
    }

    /**
     * @return the obj
     */
    public Correos getObj()
    {
        return obj;
    }

    /**
     * @param obj the obj to set
     */
    public void setObj(Correos obj)
    {
        this.obj = obj;
    }

    /**
     * @return the sig
     */
    public Nodo getSig()
    {
        return sig;
    }

    /**
     * @param sig the sig to set
     */
    public void setSig(Nodo sig)
    {
        this.sig = sig;
    }

}
