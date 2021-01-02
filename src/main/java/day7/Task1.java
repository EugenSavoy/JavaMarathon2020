package day7;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Random random = new Random();
        int stamina = random.nextInt((100 - 90) + 1);
        stamina += 90;

        Player p1 = new Player(stamina);

        int stamina2 = random.nextInt((100 - 90) + 1);
        stamina += 90;
        Player p2 = new Player(stamina2);

        int stamina3 = random.nextInt((100 - 90) + 1);
        stamina += 90;
        Player p3 = new Player(stamina3);

        int stamina4 = random.nextInt((100 - 90) + 1);
        stamina += 90;
        Player p4 = new Player(stamina4);

        int stamina5 = random.nextInt((100 - 90) + 1);
        stamina += 90;
        Player p5 = new Player(stamina5);

        int stamina6 = random.nextInt((100 - 90) + 1);
        stamina += 90;
        Player p6 = new Player(stamina6);

        Player.info();

        System.out.println(Player.countPlayers);

        while (p6.getStamina() > 0) {
            p6.run();
        }

        System.out.println(Player.countPlayers);

        Player.info();

    }
}