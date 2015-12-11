import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category({IsolatedTests.class})
public class IsolationTest {
    @Test
    public void testHello() throws Exception {
        System.out.println("Isolation");
        Assert.assertTrue(true);
    }
}
