import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StackTest {

    private Stack stack;

    @Before
    public void setUp() {
        stack = new Stack(10);
    }

    @Test
    public void newlyCreatedStack_shouldBeEmpty() {
        assertThat(stack.isEmpty(), is(true));
        assertThat(stack.getSize(), is(0));
    }

    @Test
    public void afterOnePush_StackSizeShouldBeOne() {
        stack.push(1);
        assertThat(stack.getSize(), is(1));
        assertThat(stack.isEmpty(), is(false));
    }

    @Test
    public void afterOnePushAndOnePop_shouldBeEmpty() {
        stack.push(1);
        stack.pop();
        assertThat(stack.isEmpty(), is(true));
    }

    @Test(expected = Stack.Overflow.class)
    public void whenPushedOverCapacity_StackOverflows() {
        stack = Stack.make(1);
        stack.push(1);
        stack.push(1);
    }

    @Test(expected = Stack.IllegalCapacity.class)
    public void whenCreatingStackWithNegativeSize_shouldThrowIllegalCapacity() {
        Stack.make(-1);
    }
}
