package clases;

import java.io.Serializable;

/**
 *
 * @author saul1
 */
public class Correos implements Serializable
{

    private String correoOrigen;
    private String correoDestino;
    private String mensaje;
    private String fecha;

    public Correos()
    {
    }

    public Correos(String correoOrigen, String correoDestino, String mensaje, String fecha)
    {
        this.correoOrigen = correoOrigen;
        this.correoDestino = correoDestino;
        this.mensaje = mensaje;
        this.fecha = fecha;
    }

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
     * @return the correoDestino
     */
    public String getCorreoDestino()
    {
        return correoDestino;
    }

    /**
     * @param correoDestino the correoDestino to set
     */
    public void setCorreoDestino(String correoDestino)
    {
        this.correoDestino = correoDestino;
    }

    /**
     * @return the mensaje
     */
    public String getMensaje()
    {
        return mensaje;
    }

    /**
     * @param mensaje the mensaje to set
     */
    public void setMensaje(String mensaje)
    {
        this.mensaje = mensaje;
    }

    /**
     * @return the fecha
     */
    public String getFecha()
    {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha)
    {
        this.fecha = fecha;
    }

}
