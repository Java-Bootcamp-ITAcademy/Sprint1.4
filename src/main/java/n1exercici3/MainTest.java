/*** S1.4 Nivell 1 exercici 3 ***/
package n1exercici3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void throwsException() {
        assertThrows(ArrayIndexOutOfBoundsException.class,()-> {  //Testing exception with lambda expression
           new Main().throwsException();
        });
    }
}