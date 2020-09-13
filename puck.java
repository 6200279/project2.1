public class Puck {
    public static final boolean BLACK = true;
    public static final boolean WHITE = false;

    private boolean color;

    public Puck(boolean b) {
        this.color = b;
    }

    public boolean getColor(){
        return color;
    }
}
