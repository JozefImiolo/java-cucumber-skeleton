package skeleton;

import org.junit.Test;

import static org.junit.Assert.*;

public class belly {

    @Test
    public void eat() {
        Belly b = new Belly();
        assertTrue(true);
    }
    @Test
    public  void dodaj() {
        Belly b = new Belly();
        assertEquals(10, b.dodaj(5));
    }

}