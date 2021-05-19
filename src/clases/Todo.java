package clases;

import java.io.Serializable;

/**
 *
 * @author saul1
 */
public class Todo implements Serializable
{

    private String correoOrigen = "correo@correo.com";
    private String nombre = "";
    private PilasD bandejaEntrada = new PilasD();
    private PilasD elimados = new PilasD();
    private PilasD spam = new PilasD();
    private PilasD enviados = new PilasD();

    /**
     * @return the correoOrigen
     */
    public String getCorreoOrigen()
    {
        return correoOrigen;
    }

    /**
     * @param correoOrigen the correoOrigen to set
     */
    public void setCorreoOrigen(String correoOrigen)
    {
        this.correoOrigen = correoOrigen;
    }

    /**
     * @return the bandejaEntrada
     */
    public PilasD getBandejaEntrada()
    {
        return bandejaEntrada;
    }

    /**
     * @param bandejaEntrada the bandejaEntrada to set
     */
    public void setBandejaEntrada(PilasD bandejaEntrada)
    {
        this.bandejaEntrada = bandejaEntrada;
    }

    /**
     * @return the elimados
     */
    public PilasD getElimados()
    {
        return elimados;
    }

    /**
     * @param elimados the elimados to set
     */
    public void setElimados(PilasD elimados)
    {
        this.elimados = elimados;
    }

    /**
     * @return the spam
     */
    public PilasD getSpam()
    {
        return spam;
    }

    /**
     * @param spam the spam to set
     */
    public void setSpam(PilasD spam)
    {
        this.spam = spam;
    }

    /**
     * @return the enviados
     */
    public PilasD getEnviados()
    {
        return enviados;
    }

    /**
     * @param enviados the enviados to set
     */
    public void setEnviados(PilasD enviados)
    {
        this.enviados = enviados;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    
    
    
    
}
