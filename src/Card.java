/**
 * Created by Admin on 30/06/2017.
 */
public class Card {
    Shape shape;
    Fill fill;
    Colour colour;
    int num;

    public Card(Shape shape, Fill fill, Colour colour, int num){
        this.shape = shape;
        this.fill = fill;
        this.num = num;
        this.colour = colour;
    }

    @Override
    public String toString() {
        if(num==1){
            return "(" + num + " " + fill + " " + colour + " " + shape + ")";
        }else {
            return "(" + num + " " + fill + " " + colour + " " + shape + "s)";
        }
    }
}
