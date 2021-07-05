package bomberman.model;

public class Game {

    private static Game instance;

    private Game() {
    }

    public static Game getInstance() {
        if (instance == null) {
            instance = new Game();
        }
        return instance;
    }

    private void readMap() //legge file txt per la mappa
    {

    }
}
