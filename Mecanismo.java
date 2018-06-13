
/**
 * Clase mecanismo.
 *
 * @author (Cristian de la Fuente)
 * @version (13/06/2018)
 */
public abstract class Mecanismo
{
    private int clave;
    
    /**
     * Constructor for objects of class Mecanismo
     * @param  num  La clave del mecanismo
     */
    public Mecanismo(int clave)
    {
        this.clave = clave;
    }

    /**
     * Metodo para encriptar
     *
     * @param  num  El numero a encriptar
     * @return    el numero encriptado
     */
    public abstract int encriptar(int num);
    
    /**
     * Metodo para desencriptar
     *
     * @param  num  El numero a desencriptar
     * @return    el numero desencriptado
     */
    public abstract int desencriptar(int num);
    
    /**
     * Metodo que devuelve la clave del mecanismo
     * 
     * @return    La clave del mecanismo
     */
    public int getClave(){
        return clave;
    }
}
