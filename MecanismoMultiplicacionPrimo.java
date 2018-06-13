
/**
 * Clase MecanismoMultiplicacionPrimo.
 *
 * @author (Cristian de la Fuente)
 * @version (13/06/2018)
 */
public class MecanismoMultiplicacionPrimo extends Mecanismo
{

    /**
     * Constructor de la clase MecanismoMultiplicacionPrimo
     * 
     * @param  clave  La clave del mecanismo
     */
    public MecanismoMultiplicacionPrimo(int clave)
    {
        super(clave);
    }

    /**
     * Metodo para encriptar por multiplicacion de metodo primo
     *
     * @param  num  El numero a encriptar
     * @return    el numero encriptado
     */
    @Override
    public int encriptar(int num)
    {
        int aDevolver = getClave() * num;
        return aDevolver;
    }
    
    /**
     * Metodo para desencriptar por multiplicacion de metodo primo
     *
     * @param  num  El numero a desencriptar
     * @return    el numero desencriptado
     */
    @Override
    public int desencriptar(int num)
    {
        int aDevolver = num / getClave();
        return aDevolver;
    }
}
