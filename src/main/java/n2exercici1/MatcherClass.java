/*** S1.4 Nivell 2 exercici 1 ***/
package n2exercici1;


import org.hamcrest.Description;
import org.hamcrest.FeatureMatcher;
import org.hamcrest.Matcher;
import static org.hamcrest.Matchers.*;
import org.hamcrest.TypeSafeMatcher;
import org.hamcrest.text.CharSequenceLength;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.api.Test;



public class MatcherClass {
    public static Matcher<String> longitud(Matcher<Integer> matcher) {  //Defining method that returns Matcher
        return new FeatureMatcher<String, Integer>(matcher, "és una String de longitud","longitud") {  //Returning matcher
            @Override
            protected Integer featureValueOf(String string) {
                return string.length();
            }
        };
    }
    @Test
    public void testingHasLength8 () {  //Testing matcher
        assertThat("Mordor",longitud(is(6)));
    }
}


