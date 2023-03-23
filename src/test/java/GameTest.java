import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameTest {

    @Test
    public void FirstPlayerWin () {
        Game game = new Game();
        Player john = new Player(345, "John15",100);
        Player rick = new Player(378,"RickRick", 58);

        game.register(john);
        game.register(rick);
        int expected = 1;
        int actual = game.round("John15","RickRick");

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void SecondPlayerWin () {
        Game game = new Game();
        Player john = new Player(345, "John15", 100);
        Player rick = new Player(378, "RickRick", 158);

        game.register(john);
        game.register(rick);
        int expected = 2;
        int actual = game.round("John15","RickRick");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void FirstPlayerIsNotRegistered () {
        Game game = new Game();
        Player john = new Player(345, "John15", 100);
        Player rick = new Player(378, "RickRick", 158);

        game.register(john);
        game.register(rick);
        Assertions.assertThrows(NotRegisteredException.class,
                () -> game.round("Luke","John15")
        );
    }

    @Test
    public void SecondPlayerIsNotRegistered () {
        Game game = new Game();
        Player john = new Player(345, "John15", 100);
        Player rick = new Player(378, "RickRick", 158);

        game.register(john);
        game.register(rick);
        Assertions.assertThrows(NotRegisteredException.class,
                () -> game.round("John15","Luke")
        );
    }
    @Test
    public void BothPlayersAreNotRegistered () {
        Game game = new Game();
        Player john = new Player(345, "John15", 100);
        Player rick = new Player(378, "RickRick", 158);

        game.register(john);
        game.register(rick);
        Assertions.assertThrows(NotRegisteredException.class,
                () -> game.round("Helen","Luke")
        );
    }

    @Test
    public void Draw () {
        Game game = new Game();
        Player john = new Player(345, "John15", 100);
        Player rick = new Player(378, "RickRick", 100);

        game.register(john);
        game.register(rick);
        int expected = 0;
        int actual = game.round("John15","RickRick");

        Assertions.assertEquals(expected, actual);
    }

}
