
/**
 * Clase Enigma
 *
 * @author (Cristian de la Fuente)
 * @version (13/06/2018)
 */
public class Enigma
{

    /**
     * Constructor clase Enigma
     */
    public Enigma()
    {

    }

    /**
     * Metodo para encriptar
     *
     * @param  mecanismo  El mecanismo a utilizar en la encriptacion
     * @param  num  El numero a encriptar
     * @return    el numero encriptado
     */
    public int encripta(Mecanismo mecanismo, int num)
    {
        int aDevolver = -1;
        if (num > 10){
            aDevolver = mecanismo.encriptar(num);
        }
        return aDevolver;
    }

    /**
     * Metodo para desencriptar
     *
     * @param  mecanismo  El mecanismo a utilizar en la desencriptacion
     * @param  num  El numero a desencriptar
     * @return    el numero desencriptado
     */
    public int desencripta(Mecanismo mecanismo, int num)
    {
        int aDevolver = -1;
        if (num > 10 && mecanismo.desencriptar(num) > 10){
            aDevolver = mecanismo.desencriptar(num);
        }
        return aDevolver;
    }
}
