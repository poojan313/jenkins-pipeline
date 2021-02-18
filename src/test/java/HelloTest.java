import org.junit.*;
import static org.junit.Assert.*;
public class HelloTest {



    @Test
    public void NullTest() {
        Hello hello = new Hello();
        assertEquals(hello.getS(),"");
    }
}
