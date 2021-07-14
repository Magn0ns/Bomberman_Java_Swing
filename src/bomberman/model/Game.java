package bomberman.model;

import bomberman.application.Settings;

import java.io.*;

public class Game {

    private Character character;

    private static Game game = null;

    private static Game instance;

    private Game() {

        character = new Character(0, 0, 12);

    }

    public static Game getInstance() {
        if (instance == null) {
            instance = new Game();
        }
        return instance;
    }

    public Character getCharacter() {
        return character;
    }


    public int[][] readMap(int [][] array) throws IOException //legge file txt per la mappa
    {
        BufferedReader br = null;
        int size = Settings.CELL_SIZE;
        int row = 0;

        try {
            try {
                br = new BufferedReader(new FileReader("src" + File.separator + "map" + File.separator + "Map.txt"));
                while (br.ready()) {
                    String line = br.readLine();
                    String[] values = line.trim().split(",");

                    for (int col = 0; col < size; col++) {
                        array[row][col] = Integer.parseInt(values[col]);
                    }

                    row++;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
        return array;
    }
}
