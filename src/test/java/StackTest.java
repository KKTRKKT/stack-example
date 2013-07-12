import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StackTest {
    @Test
    public void newlyCreatedStack_shouldBeEmpty() {
        Stack stack = new Stack();
        assertThat(stack.isEmpty(), is(true));
        assertThat(stack.getSize(), is(0));
    }

    @Test
    public void afterOnePush_StackSizeShouldBeOne() {
        Stack stack = new Stack();
        stack.push(1);
        assertThat(stack.getSize(), is(1));
    }
}
