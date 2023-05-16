import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZappingTest {

    @Test
    void zappingMethod() {
        Zapping zapping = new Zapping();
        assertEquals(0, zapping.zappingMethod(0, 0));
    }

    @Test
    void zappingMethod2() {
        Zapping zapping = new Zapping();
        assertEquals(1, zapping.zappingMethod(1, 2));
    }

    @Test
    void zappingMethod3() {
        Zapping zapping = new Zapping();
        assertEquals(20, zapping.zappingMethod(10, 30));
    }

    @Test
    void zappingMethod4() {
        Zapping zapping = new Zapping();
        assertEquals(2, zapping.zappingMethod(2, 99));
    }
}