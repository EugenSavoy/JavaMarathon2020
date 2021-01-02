package day7;

public class Player {

    final static int MAX_STAMINA = 100;
    final static int MIN_STAMINA = 0;
    static int countPlayers = 0;
    private int stamina;

    public Player(int stamina) {
        if (countPlayers < 6) {
            this.stamina = stamina;
            countPlayers += 1;
        }
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public int getStamina() {
        return stamina;
    }

    public void run() {

        if (this.stamina > 0) {
            this.stamina -= 1;

            if (this.stamina == 0) {
                countPlayers -= 1;
            }

        }

    }

    public static void info() {
        int result = 6 - countPlayers;
        if (countPlayers < 6) {
            if (result > 1) {
                System.out.printf("Команды неполные. На поле еще есть %s свободных мест", result);
            } else if (result == 1) {
                System.out.printf("Команды неполные. На поле еще есть %s свободное место", result);
            }

        } else {
            System.out.println("На поле нет свободных мест");
        }
    }
}
