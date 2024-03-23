import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;

public class MontyHallLifecycleTest extends BaseMontyHallTest {

    @BeforeClass
    public static void setUpClass() {
        System.out.println("Setting up tests for Monty Hall Game...");
    }

    @Before
    public void setUp() {
        System.out.println("Setting up test...");
    }

    @After
    public void tearDown() {
        System.out.println("Tearing down test...");
    }

    @Test
    public void testInvalidPlayerChoice() {
        game.playerChoosesDoor(-1);
        assertFalse(game.openGoatDoor());
    }
}
