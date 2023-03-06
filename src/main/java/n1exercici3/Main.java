/*** S1.4 Nivell 1 exercici 3 ***/
package n1exercici3;

public class Main {
    public void throwsException() {
        String[] s=new String[3];  //Trying to access a non-existing position in the array
        s[s.length]="";
    }
}
