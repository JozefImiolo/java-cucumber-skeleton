package skeleton;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class bellytest {

    @Test
    public void eat() {
        Belly b;
        b = new Belly();
        assertTrue(true);
    }
    @Test
    public  void dodaj() {
        Belly b = new Belly();
        assertEquals(10, b.dodaj(5));
    }

}