package cardGameEngine;

public enum Suit{

  DIAMOND("Diamond"),
  SPADE("Space"),
  CLUB("Club"),
  HEART("Heart");

  private String suit;

  private Suit( String suit ) {
    this.suit = suit;
  }

  public String getSuitString(){
    return this.suit;
  }
}