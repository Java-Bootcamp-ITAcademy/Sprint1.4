/*** S1.4 Nivell 1 exercici 2 ***/
package n1exercici2;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class CalculoDNITest {
    public static final long DNI1=43742723L; //N
    public static final long DNI2=47687300L; //C
    public static final long DNI3=67583345L; //F
    public static final long DNI4=12667709L;  //E
    public static final long DNI5=29881233L;  //R
    public static final long DNI6=32987666L;  //P
    public static final long DNI7=32987665L;  //F
    public static final long DNI8=62345600L;  //Y
    public static final long DNI9=99123001L;  //Q
    public static final long DNI10=4;  //Throws exception


    CalculoDNI calcul=new CalculoDNI();

    @Test
    void calcularLletraDNI1Test() {    //Testing DNI1
        try {
            assertEquals('N', calcul.calcularLletra(DNI1));
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    void calcularLletraDNI2Test() {    //Testing DNI2
        try {
            assertEquals('C', calcul.calcularLletra(DNI2));
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    void calcularLletraDNI3Test() {    //Testing DNI3
        try {
            assertEquals('F', calcul.calcularLletra(DNI3));
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    void calcularLletraDNI4Test() {    //Testing DNI4
        try {
            assertEquals('E', calcul.calcularLletra(DNI4));
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    void calcularLletraDNI5Test() {    //Testing DNI5
        try {
            assertEquals('R', calcul.calcularLletra(DNI5));
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    void calcularLletraDNI6Test() {    //Testing DNI6
        try {
            assertEquals('P', calcul.calcularLletra(DNI6));
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    void calcularLletraDNI7Test() {    //Testing DNI7
        try {
            assertEquals('F', calcul.calcularLletra(DNI7));
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    void calcularLletraDNI8Test() {    //Testing DNI8
        try {
            assertEquals('Y', calcul.calcularLletra(DNI8));
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    void calcularLletraDNI9Test() {    //Testing DNI9
        try {
            assertEquals('Q', calcul.calcularLletra(DNI9));
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    void calcularLletraDNI10Test() {    //Testing DNI10
        assertThrowsExactly(Exception.class,()-> {
            calcul.calcularLletra(DNI10);
        });
    }

}