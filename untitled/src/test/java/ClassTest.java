import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ClassTest {
    @Test
    void anytext() {
        Assertions.assertTrue((new int[3]).length == 0);
    }

    void t2() {
        Assertions.assertFalse(false);
    }
}
