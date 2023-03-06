/*** S1.4 Nivell 3 exercici 1 ***/
package n3exercici1a7;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import static org.assertj.core.api.Assertions.*;


public class Tests {
    Inputs inputs=new Inputs();

    @BeforeAll
    static void printingStarts() {
        System.out.println("Test starts");
    }

    /* Exercici 1 */
    @Test
    void testIntegerIguals() {

        assertThat(inputs.getInteger1()).isEqualTo(inputs.getInteger2());

    }
    @Test
    void testIntegerDiferents() {

        assertThat(inputs.getInteger1()).isNotEqualTo(inputs.getInteger3());
    }

    /* Exercici 2 */
    @Test
    void testReferenciesIguals() {
        Integer i= inputs.getInteger2();
        assertThat(i).isSameAs(inputs.getInteger2());
    }

    @Test
    void testReferenciesDiferents() {
        Integer i=new Integer(9);
        assertThat(i).isNotSameAs(inputs.getInteger2());
    }

    /* Exercici 3 */
    @Test
    void testArrayEntersIgual() {
        assertThat(inputs.getArray1()).isEqualTo(inputs.getArray2());
    }

    /* Exercici 4 */
    @Test
    void testOrdreDelArray() {
        Object[] array = {inputs.getInteger1(), inputs.getMap(), inputs.getSb(), inputs.getOpt()};

        assertThat(array).containsExactly(inputs.getInteger1(), inputs.getMap(), inputs.getSb(), inputs.getOpt());
    }

    @Test
    void testQualsevolOrdreDelArray() {
        Object[] array = {inputs.getInteger1(), inputs.getSb(), inputs.getMap(), inputs.getOpt()};
        assertThat(array).containsExactlyInAnyOrder(inputs.getSb(),inputs.getInteger1(),inputs.getOpt(),inputs.getMap());
    }

    @Test
    void testUnicElementIElementNoInseritArray() {
        Object[] array = {inputs.getOpt(), inputs.getMap(), inputs.getInteger1()};
        assertThat(array).containsOnlyOnce(inputs.getMap()).doesNotContain(inputs.getArray1());
    }

    /* Exercici 5 */
    @Test
    void testMapConteKey() {
        inputs.getMap().put("Toni",1);
        inputs.getMap().put("Laura",2);
        inputs.getMap().put("Jordi",3);
        assertThat(inputs.getMap()).containsKey("Toni");
    }

    /* Exercici 6 */
    @Test
    void testLlençaExcepcio() {
        assertThatIndexOutOfBoundsException().isThrownBy(()->inputs.getArray1()[3]=4);
    }

    /* Exercici 7 */
    @Test
    void testOptionalEsBuit() {
        assertThat(inputs.getOpt()).isEmpty();
    }

    @AfterAll
    static void printingEnd() {
        System.out.println("Test ends");
    }

}
