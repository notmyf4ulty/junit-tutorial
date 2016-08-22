import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Przemek on 19.08.2016.
 */
public class TestJunit2 extends TestCase {
    protected double val1;
    protected double val2;

    @Before
    public void setUp() {
        val1 = 1.0;
        val2 = 2.0;
    }

    @Test
    public void testAdd() {
        System.out.println("Number of the test cases: " + this.countTestCases());

        String name = this.getName();
        System.out.println("Test case name: " + name);

        this.setName("TestCaseName");
        name = this.getName();
        System.out.println("New test case name: " + name);
    }

    public void tearDown() {}
}
