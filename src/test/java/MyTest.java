import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyTest {

    MyNonExistingClass myNonExistingClass = new MyNonExistingClass();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }
//
//    @Test
//    public void myTest(){
//        MyNonExistingClass my = new MyNonExistingClass();
//        String hello = my.gretting();
//        String expected = "hello";
//        assertEquals(hello,expected);
//    }

    @Test
    void testGreet() {
        String name = "Bob";
        String expected = "Hello, "+name;
        String actual = myNonExistingClass.greet(name);
        assertEquals(actual,expected);
    }

    @Test
    void testNullGreet() {
    String name = null;
    String expected = "Hello, my friend";
    String actual = myNonExistingClass.greet(name);
    assertEquals(actual,expected);
    }

    @Test
    void testUppercase() {
        String name = "JERRY";
        String expected = "HELLO, JERRY!";
        String actual = myNonExistingClass.greet(name);
        assertEquals(actual,expected);
    }
}
