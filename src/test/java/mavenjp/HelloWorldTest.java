import mavenjp.Hello;
import mavenjp.World;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.matchers.JUnitMatchers.containsString;

public class HelloWorldTest {
    
    private static Hello hello;
    private static World world;
    
    public HelloWorldTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        hello = new Hello();
        world = new World();
    }
    
    @AfterClass
    public static void tearDownClass() {
        hello = null;
        world = null;
    }
    
    @Test
    public void HelloTest() {
        assertThat(hello.Hello(), containsString("Hell"));
    }
    
    @Test
    public void WorldTest(){
        assertThat(world.World(), containsString("Worl"));
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

}
