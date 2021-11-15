package td1;

import junit.framework.TestCase;

import java.util.List;
import java.util.Set;

public class ArbreTest extends TestCase {
    Entier v1 = new Entier(1);
    Entier v2 = new Entier(5);
    Entier v3 = new Entier(2);
    Arbre<Entier> f1 = new Feuille<>(v1);
    Arbre<Entier> f2 = new Feuille<>(v2);
    Arbre<Entier> t = new Noeud<>(List.of(f1, f2));

    public void testTaille() {
        assertEquals(1, f1.taille());
        assertEquals(1, f2.taille());
        assertEquals(2, t.taille());
    }

    public void testContient() {
        assertEquals(true, t.contient(v1));
        assertEquals(true, t.contient(v2));
        assertEquals(false, t.contient(v3));
    }

    public void testValeurs() {
        assertEquals(Set.of(v1,v2), t.valeurs());
    }
/*
    public void testSomme() {
        assertEquals(6, t.somme());
    }
*/}