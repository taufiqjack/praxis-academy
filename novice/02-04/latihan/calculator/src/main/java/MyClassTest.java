
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;

public class MyClassTest {
    @Test
    public void testExceptionIsThrown(){
        MyClass tester = new MyClass();
        assertThrows(IllegalArgumentException.class,()-> tester.multiply(1000,5));
    }
    @Test
    public void testMultiply(){
        MyClass tester = new MyClass();
        assertEquals(50,tester.multiply(10,5),"10 x 5 must be 50");
    }
}
