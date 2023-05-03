import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ClassTest {
    @Test
    void anytext() {
        Assertions.assertTrue((new int[3]).length == 0);
    }

    @Test
    void t2() {
        Assertions.assertFalse(true);
    }

    @Test
    void t3() {
        Assertions.assertEquals(1, 1);
    }
}
