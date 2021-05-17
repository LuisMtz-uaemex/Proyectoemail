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
public class Multilista
{
    Nodo arr[] = new Nodo[2];
    public   Listas obj;

    public Multilista(Listas obj)
    {
        this.obj = obj;
    }

    public Nodo inserta(Nodo r, int nivel, String s[], Nodo n)
    {
        if (s.length - 1 == nivel)
        {

            obj.r = r;
            obj.inserta(n);
            return obj.r;
        } else
        {
            Nodo aux = busca(r, s[nivel]);
            if (aux != null)
            {
                aux.setAbj(inserta(aux.getAbj(), nivel + 1, s, n));
            }
            return r;
        }
    }
    
    /**
     * Método para eliminar datos en los diferens niveles de la multilista
     * @param r la raíz general
     * @param nivel siempre se recibe en 0 para especificar el nivel que va aumentando con la recursividad
     * @param s el arreglo de cadenas con la información de lo que buscará en cada nivel
     * @return un arreglo de dos posiciones en el que la posición 0 es el dato eliminado y la posición 1 es la nueva raíz
     */
    public Nodo [] elimina(Nodo r, int nivel, String s[])
    {
        
        if (s.length - 1 == nivel)
        {
            obj.r = r;
            arr[0]=obj.elimina(s[nivel]);
            arr[1]=obj.r;
        } else
        {
            Nodo aux = busca(r, s[nivel]);
            if (aux != null)
            {
                arr=elimina(aux.getAbj(), nivel + 1, s);
                aux.setAbj(arr[1]);
                arr[1]=r;
            }
        }
        return arr;
    }

    public Nodo busca(Nodo r, String s)
    {
        Listas obj = new Listas();
        obj.r = r;
        return obj.busca(s);
    }

    private void despligarNormal(Nodo r, String s)
    {

        while (r != null)
        {
            System.out.println(s + r.getD());
            desplegar(r.getAbj(), s + "\t");
            r = r.getSig();
        }
    }

    private void despligarCircular(Nodo r, String s)
    {
        if (r != null)
        {
            Nodo aux = r.getSig();
            do
            {
                System.out.println(s + aux.getD());
                desplegar(aux.getAbj(), s + "\t");
                aux = aux.getSig();
            } while (aux != r.getSig());
        }

    }

    public void desplegar(Nodo r, String s)
    {
        if (obj instanceof ListasCircular || obj instanceof ListaDobleCircular)
        {
            despligarCircular(r, s);
        } else
        {
            despligarNormal(r, s);
        }
    }
}
