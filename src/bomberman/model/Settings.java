package bomberman.model;

public class Settings {

    public final static int WINDOW_SIZE_IN_PIXEL=816;
    public final static int BLOCK_SIZE_IN_PIXEL=48;
    public final static int CELL_SIZE= (WINDOW_SIZE_IN_PIXEL/BLOCK_SIZE_IN_PIXEL);//17x17 blocks

    public final static int MOVE_RIGHT=0;
    public final static int MOVE_LEFT=1;
    public final static int MOVE_UP=2;
    public final static int MOVE_DOWN=3;
}
