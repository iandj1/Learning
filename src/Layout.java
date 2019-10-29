import java.util.ArrayList;

/**
 * Created by Admin on 30/06/2017.
 */
public class Layout {
    Card[] layout = new Card[12];

    public Layout(Card[] layout){
        this.layout = layout;
    }

    public ArrayList<Card[]> solve(){
        ArrayList<Card[]> solutions = new ArrayList<>();
        Card[] cards = new Card[3];
        for(int i = 0; i<10; i++){
            cards[0] = layout[i];
            for(int j=i+1; j<11; j++){
                cards[1] = layout[j];
                for(int k=j+1; k<12; k++){
                    cards[2] = layout[k];
                    if(set(cards)){
                        solutions.add(cards.clone());
                    }
                }
            }
        }
        return solutions;
    }

    boolean set(Card[] cards){ //input length 3 card array, output boolean if set
        if(cards.length!=3){
            System.out.println("input should be length 3");
            return false;
        }

        boolean colourmatch = false;
        boolean fillmatch = false;
        boolean nummatch = false;
        boolean shapematch = false;


        if(cards[0].colour==cards[1].colour && cards[0].colour==cards[2].colour){
            colourmatch = true;
        }else if(cards[0].colour!=cards[1].colour && cards[0].colour!=cards[2].colour && cards[1].colour!=cards[2].colour){
            colourmatch = true;
        }

        if(cards[0].fill==cards[1].fill && cards[0].fill==cards[2].fill){
            fillmatch = true;
        }else if(cards[0].fill!=cards[1].fill && cards[0].fill!=cards[2].fill && cards[1].fill!=cards[2].fill){
            fillmatch = true;
        }

        if(cards[0].num==cards[1].num && cards[0].num==cards[2].num){
            nummatch = true;
        }else if(cards[0].num!=cards[1].num && cards[0].num!=cards[2].num && cards[1].num!=cards[2].num){
            nummatch = true;
        }

        if(cards[0].shape==cards[1].shape && cards[0].shape==cards[2].shape){
            shapematch = true;
        }else if(cards[0].shape!=cards[1].shape && cards[0].shape!=cards[2].shape && cards[1].shape!=cards[2].shape){
            shapematch = true;
        }


        return colourmatch && fillmatch && nummatch && shapematch;
    }




    @Override
    public String toString() {
        String output = "";
        for(int i = 0; i<4; i++){
            output = output+layout[3*i]+" "+layout[3*i+1]+" "+layout[3*i+2]+"\n";
        }
        return output;
    }
}
