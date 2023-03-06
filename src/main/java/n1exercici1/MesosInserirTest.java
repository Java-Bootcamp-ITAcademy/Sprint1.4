/*** S1.4 Nivell 1 exercici 1 ***/
package n1exercici1;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class MesosInserirTest {
    MesosInserir mesos=new MesosInserir();
    @BeforeAll
    static void printingStarts() {
        System.out.println("Test starts");
    }
    @Test
    void te12ElementsTest() {    //Testing list size
        assertEquals(12,mesos.inserir().size());
    }
    @Test
    void notNullTest() {    //Testing whether list is null or not
        assertNotNull(mesos.inserir());
    }
    @Test
    void agostTest() {    //Testing Agost is in the proper place
        assertEquals("Agost",mesos.inserir().get(7));
    }
    @AfterAll
    static void printingEnd() {
        System.out.println("Test ends");
    }
}