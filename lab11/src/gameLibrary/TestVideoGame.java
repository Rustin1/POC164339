package gameLibrary;

import java.util.Arrays;

public class TestVideoGame {
    public static void main(String[] args) {
        VideoGame[] tab = new VideoGame[5];
        tab[0] = new VideoGame("Minecraft", "Mojang", 8.8);
        tab[1] = new VideoGame("The Witcher 3", "CDProjectRed", 9.0);
        tab[2] = new VideoGame("The Witcher 2", "CDProjectRed", 8.4);
        tab[3] = new VideoGame("RockSimulator", "RckSTdio", 4.9);
        tab[4] = new VideoGame("How I met your father", "Bjorn", 6.2);

        System.out.println("Before sorting: ");
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
        Arrays.sort(tab);

        System.out.println("Before sorting: ");
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
    }
}
