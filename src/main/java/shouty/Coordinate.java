package shouty;

public class Coordinate {
    private final int x;
    private final int y;

    public Coordinate(int xCoord, int yCoord) {
        x = xCoord;
        y = yCoord;
    }

    public int distanceFrom(Coordinate other) {
        // TODO: actually caluculate distance. I think we need to use pythagoras' theorem?
        //return 0;
    	return (int) Math.sqrt(Math.pow((other.x - this.x), 2) + Math.pow((other.y - this.y), 2));

    }
}
