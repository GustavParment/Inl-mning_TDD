package se.reky.hakan;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import se.reky.hakan.model.Goblin;
import se.reky.hakan.model.Player;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class SimplePlayerInteractionTest {
    private Player player;
    private PlayerInteraction playerInteraction;
    private Goblin goblin;

    private PlayerInteraction setUpScanner(String dataForScanner) {
        Scanner scanner = new Scanner(dataForScanner);
        IOHandler ioHandler = new IOHandler(scanner);
        player = new Player();
        return new SimplePlayerInteraction(ioHandler);
    };
    @Test
    void setupPlayerTest() {
        playerInteraction = setUpScanner("Player_1");
        playerInteraction.setupPlayer(player);
        assertEquals("Player_1", player.getName());
    }

    @DisplayName("Testing if Hp was updated")
    @Test
    void test_Update_Health(){
        playerInteraction = setUpScanner("Player_2");
        playerInteraction.setupPlayer(player);
        playerInteraction.updatePlayerHealth(player, 40);
        assertEquals(50,player.getHp());

    }

}