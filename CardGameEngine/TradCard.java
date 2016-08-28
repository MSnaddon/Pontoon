package cardGameEngine;

public class TradCard {

  Suit suit;
  Rank rank;

  public TradCard(Suit suit, Rank rank) {
    this.suit = suit;
    this.rank = rank;
  }

  public Suit getSuit() {
    return this.suit;
  }
  public String getSuitString() {
    return this.suit.getSuitString();
  }

  public Rank getRank() {
    return this.rank;
  }

  public int getRankInt() {
    return this.rank.getRankInt();
  }

}