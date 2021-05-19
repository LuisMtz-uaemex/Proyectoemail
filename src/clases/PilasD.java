package clases;

import java.io.Serializable;

/**
 *
 * @author saul1
 */
public class PilasD implements Serializable
{

    private Nodo tope = null;
    private int cantidad = 0;

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

    public int getCantidad()
    {
        return cantidad;
    }

    public void setCantidad(int cantidad)
    {
        this.cantidad = cantidad;
    }

    public boolean inserta(Nodo nuevo)
    {
        if (nuevo == null)
        {
            return false;
        } else
        {
            cantidad += 1;
            nuevo.setSig(tope);
            tope = nuevo;
            System.out.println("Dato insertado" + nuevo.getObj().getCorreoOrigen() + " :" + cantidad);
            return true;
        }
    }

    public Nodo elimina()
    {
        if (tope == null)
        {
            cantidad = 0;
            return null;
        } else
        {
            cantidad += -1;
            Nodo aux = tope;
            tope = aux.getSig();
            aux.setSig(null);
            System.out.println("Ahora hay: " + cantidad + " Elimine " + aux.getObj().getCorreoOrigen());
            return aux;
        }
    }

    public Nodo elimina(Nodo obj)
    {
        Nodo encontrado = null;

        PilasD tmp = new PilasD();
        int ca = cantidad;
        for (int i = 0; i < ca; i++)
        {
            Nodo tm = elimina();
            if (tm != obj)
            {
                tmp.inserta(tm);
            } else
            {
                System.out.println(tm.getObj().getMensaje());
            }
        }

        ca = tmp.getCantidad();
        for (int j = 0; j < ca; j++)
        {
            this.inserta(tmp.elimina());
        }

        return encontrado;
    }

}
