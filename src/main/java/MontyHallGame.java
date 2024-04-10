import java.util.Random;

public class MontyHallGame {
    int carPosition;
    int playerChoice;
    private static Random random;

    public MontyHallGame() {
        random = new Random();
        carPosition = random.nextInt(3); // Автомобиль размещается случайным образом за одной из трех дверей
    }

    public void playerChoosesDoor(int choice) {
        playerChoice = choice;
    }

    public boolean openGoatDoor() {
        int doorToOpen;
        do {
            doorToOpen = random.nextInt(3);
        } while (doorToOpen == carPosition || doorToOpen == playerChoice);

        return doorToOpen == carPosition;
    }

    public boolean playerSwitchesDoor() {
        int newChoice;
        do {
            newChoice = random.nextInt(3);
        } while (newChoice == playerChoice);

        playerChoice = newChoice;
        return playerChoice == carPosition;
    }

    public static void main(String[] args) {
        int totalGames = 1000;
        int playerWinsNotSwitching = 0;
        int playerWinsSwitching = 0;

        for (int i = 0; i < totalGames; i++) {
            MontyHallGame game = new MontyHallGame();
            game.playerChoosesDoor(random.nextInt(3));

            if (!game.openGoatDoor()) {
                playerWinsNotSwitching++;
            }

            if (game.playerSwitchesDoor()) {
                playerWinsSwitching++;
            }
        }

        System.out.println("Победы игрока без смены выбора: " + playerWinsNotSwitching);
        System.out.println("Победы игрока со сменой выбора: " + playerWinsSwitching);
    }
}