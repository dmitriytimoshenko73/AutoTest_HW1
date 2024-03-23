import org.junit.Test;
import static org.junit.Assert.*;

public class MontyHallGameTest {

    @Test
    public void testPlayerWinsNotSwitching() {
        MontyHallGame game = new MontyHallGame();
        game.playerChoosesDoor(0);
        assertFalse(game.openGoatDoor());
    }

    @Test
    public void testPlayerWinsSwitching() {
        MontyHallGame game = new MontyHallGame();
        game.playerChoosesDoor(0);
        assertTrue(game.playerSwitchesDoor());
    }

    @Test
    public void testPlayerChoiceChange() {
        MontyHallGame game = new MontyHallGame();
        game.playerChoosesDoor(0);
        int initialChoice = game.playerChoice;
        game.playerSwitchesDoor();
        assertNotEquals(initialChoice, game.playerChoice);
    }

    @Test
    public void testCarPositionValidity() {
        MontyHallGame game = new MontyHallGame();
        assertTrue(game.carPosition >= 0 && game.carPosition <= 2);
    }
}