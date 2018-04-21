papackage skeleton;

import org.junit.Before;
import org.junit.Test;
import skeleton.HelloWorld;

import static org.junit.Assert.assertEquals;

public class HelloWorldTest {

    private HelloWorld subject;

    @Before
    public void setup() {
        subject = new HelloWorld();
    }

    @Test
    public void testGetMessage() {
        assertEquals("Hello World!", subject.getMessage(false));
    }

}