package se.reky.hakan.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ActorTest {
    private Actor player;
    private Actor goblin;

    @BeforeEach
    void setUp() {
        player = new Player("Capser", 30, 10);
        goblin = new Goblin("Nick", 30, 10);
    }

    @DisplayName("Testing if attack was successful")
    @Test
    void test_Successful_Attack(){

        goblin.attack(player);
        assertEquals(20,player.getHp());
    }

}