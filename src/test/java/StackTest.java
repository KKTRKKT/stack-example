import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StackTest {
    @Test
    public void newlyCreatedStack_shouldBeEmpty() {
        Stack stack = new Stack();
        assertThat(stack.isEmpty(), is(true));
    }
}
