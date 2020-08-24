package classes;

public class PlayingCardClass {
    private int rank;
    private String suit;
    PlayingCardClass(){
        rank = 0;
        suit = "not defined";
    }
    PlayingCardClass(int rank, String suit){
        this.rank = rank;
        this.suit = suit;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }
}
