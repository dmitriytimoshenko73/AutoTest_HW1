import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class MontyHallParameterizedTest extends BaseMontyHallTest {

    private int playerChoice;
    private boolean expectedOutcome;

    public MontyHallParameterizedTest(int playerChoice, boolean expectedOutcome) {
        this.playerChoice = playerChoice;
        this.expectedOutcome = expectedOutcome;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {0, true},
                {1, true},
                {2, true}
        });
    }

    @Test
    public void testPlayerWinsSwitchingWithParametrizedData() {
        game.playerChoosesDoor(playerChoice);
        assertEquals(expectedOutcome, game.playerSwitchesDoor());
    }
}
