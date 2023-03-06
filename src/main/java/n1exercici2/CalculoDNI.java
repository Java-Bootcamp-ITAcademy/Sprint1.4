/*** S1.4 Nivell 1 exercici 2 ***/
package n1exercici2;

public class CalculoDNI {

    public static final char[] lletresDNI={'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};

    public char calcularLletra(long numero) throws Exception {
        if(Long.toString(numero).length()==8) {
            long residu = numero % 23;
            return lletresDNI[(int) residu];
        }
        else {
            throw new Exception("Numero incorrecte de DNI");
        }
    }
}
