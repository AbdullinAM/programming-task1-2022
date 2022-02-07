package programming.task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMyTask {
    @Test public void foo() {
        assertEquals(42, new MyTask().foo());
    }
}
