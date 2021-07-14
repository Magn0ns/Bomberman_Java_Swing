package bomberman.model;

public class Block {

    public static final int EMPTY=0;
    public static final int BOMBERMAN=1;
    public static final int BREAKABLE_WALL=2; //Blocks that bomberman can destroy with bombs
    public static final int WALL=3;
    public static final int ENEMY=4;

    private int type;

    public Block(int type)
    {
        this.type=type;
    }

    public void setType(int type)
    {
        this.type=type;
    }

    public int getType()
    {
        return this.type;
    }
}
