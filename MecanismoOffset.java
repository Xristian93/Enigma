
/**
 * Clase MecanismoOffset.
 *
 * @author (Cristian de la Fuente)
 * @version (13/06/2018)
 */
public class MecanismoOffset extends Mecanismo
{

    /**
     * Constructor de la clase MecanismoOffset
     * 
     * @param  clave  La clave del mecanismo
     */
    public MecanismoOffset(int clave)
    {
        super(clave);
    }

    /**
     * Metodo para encriptar por offset
     *
     * @param  num  El numero a encriptar
     * @return    el numero encriptado
     */
    @Override
    public int encriptar(int num)
    {
        String cadenaNumero = "" + num;
        String cadenaADevolver = cadenaNumero.substring(0,1);
        for (int i = 1; i < cadenaNumero.length(); i++){
            int numeroPosicion = Integer.parseInt(cadenaNumero.substring(i,i+1)) + getClave();
            if (numeroPosicion > 10){
                numeroPosicion -= 10;
            }
            cadenaADevolver += numeroPosicion;
        }
        return Integer.parseInt(cadenaADevolver);
    }
    
    /**
     * Metodo para desencriptar por offset
     *
     * @param  num  El numero a desencriptar
     * @return    el numero desencriptado
     */
    @Override
    public int desencriptar(int num)
    {
        String cadenaNumero = "" + num;
        String cadenaADevolver = cadenaNumero.substring(0,1);
        for (int i = 1; i < cadenaNumero.length(); i++){
            int numeroPosicion = Integer.parseInt(cadenaNumero.substring(i,i+1)) - getClave();
            if (numeroPosicion < 0){
                numeroPosicion += 10;
            }
            cadenaADevolver += numeroPosicion;
        }
        return Integer.parseInt(cadenaADevolver);
    }
}
