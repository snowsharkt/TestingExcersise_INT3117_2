import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void checkHealth() {
        assertAll(
                () -> assertEquals(-1, Main.checkHealth(-1, -1)),
                () -> assertEquals(0, Main.checkHealth(20, 80)),
                () -> assertEquals(1, Main.checkHealth(20, 120)),
                () -> assertEquals(2, Main.checkHealth(15, 120))
        );

    }
}