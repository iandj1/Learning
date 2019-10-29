import java.util.ArrayList;

/**
 * Created by Admin on 30/06/2017.
 */
public class SetTest {
    public static void main(String[] args) {

        Card[] cards = new Card[12];

        /*
        for(int i=0; i<12; i++){
            cards[i] = new Card(Shape.oval,Fill.empty,Colour.purple,2);
        }
        */
        cards[0] = new Card(Shape.diamond,Fill.shaded,Colour.green,1);
        cards[1] = new Card(Shape.diamond,Fill.shaded,Colour.purple,1);
        cards[2] = new Card(Shape.squiggle,Fill.solid,Colour.purple,1);
        cards[3] = new Card(Shape.diamond,Fill.empty,Colour.red,2);
        cards[4] = new Card(Shape.oval,Fill.empty,Colour.red,3);
        cards[5] = new Card(Shape.squiggle,Fill.shaded,Colour.green,1);
        cards[6] = new Card(Shape.oval,Fill.solid,Colour.red,2);
        cards[7] = new Card(Shape.oval,Fill.solid,Colour.purple,1);
        cards[8] = new Card(Shape.diamond,Fill.solid,Colour.green,1);
        cards[9] = new Card(Shape.diamond,Fill.solid,Colour.purple,1);
        cards[10] = new Card(Shape.oval,Fill.empty,Colour.green,2);
        cards[11] = new Card(Shape.oval,Fill.empty,Colour.purple,3);





        Layout layout = new Layout(cards);
        System.out.println(layout);

        ArrayList<Card[]> solutions = layout.solve();

        for(Card[] solution: solutions){
            for(int i=0; i<3; i++){
                System.out.print(solution[i]+" ");
            }
            System.out.println();
        }


    }
}
