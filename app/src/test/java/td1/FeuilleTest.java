package td1;

import junit.framework.TestCase;
import java.util.Set;

public class FeuilleTest extends TestCase {
    Entier E1 = new Entier(4);
    Chaine C1 = new Chaine("bonjour");
    Feuille A = new Feuille(E1);
    Feuille B = new Feuille (C1);

    public void testTaille() {
        assertEquals(1, A.taille());
        assertEquals(1, B.taille());
    }

    public void testContientTrue() {
        assertEquals(true, A.contient(E1));
        assertEquals(true, B.contient(C1));
    }

    public void testContientFalse() {
        assertEquals(false, A.contient(C1));
        assertEquals(false, B.contient(E1));
    }

    public void testSomme() {
        assertEquals(E1, A.somme());
        assertEquals(C1, B.somme());
    }

    public void testMin() {
        assertEquals(E1, A.min());
        assertEquals(C1, B.min());
    }

    public void testValeur() {
        assertEquals(Set.of(E1), A.valeurs());
        assertEquals(Set.of(C1), B.valeurs());
    }
}