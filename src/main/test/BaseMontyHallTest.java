import org.junit.Before;

public abstract class BaseMontyHallTest {

    protected MontyHallGame game;

    @Before
    public void setUp() {
        game = new MontyHallGame();
    }
}
