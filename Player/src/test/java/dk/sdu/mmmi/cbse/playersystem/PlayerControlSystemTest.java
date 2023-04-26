package dk.sdu.mmmi.cbse.playersystem;

import dk.sdu.mmmi.cbse.common.data.GameData;
import dk.sdu.mmmi.cbse.common.data.World;
import dk.sdu.mmmi.cbse.common.services.IGamePluginService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PlayerControlSystemTest {

    private GameData gameData;
    private World world;
    private IGamePluginService playerPlugin;


    public void PlayerControlSystem(){
        assertTrue(false);
    }

    @BeforeEach
    void setup(){
        gameData = new GameData();
        world = new World();
        playerPlugin = new PlayerPlugin();
    }

    @DisplayName("Player plugin start tests")
    @Nested
    class PlayerPluginStarts{

        @Test
        void addPlayerToWorld(){
            playerPlugin.start(gameData, world);
            assertEquals(world.getEntities().stream().collect(Collectors.toList()).toArray().length, 1);
        }
    }


}