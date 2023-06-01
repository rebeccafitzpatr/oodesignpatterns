package builderpatternpizza;

public class Pizza {

  
  private int size;
  private boolean onion;
  private boolean cheese;
  private int sausageCount;


  private Pizza(Builder builder) {
    this.size = builder.size;
    this.onion = builder.onion;
    this.cheese = builder.cheese;
    this.sausageCount = builder.sausageCount;
  }
  //create the Pizza inner Builder class
  public static class Builder {

    // main toppings on the pizza
    // onion, cheese, olives, tomato, mushroom, ham ,sausages
    // set the default settings
    private int size; //this is a compulsory specification
    private boolean onion = false;
    private boolean cheese = false;
    private int sausageCount = 0;

  

  public Builder(int size) {
    this.size = size;
  }

  public Builder addOnions(){
    this.onion = true;
    return this;
  }

  public Builder addCheese() {
    this.cheese = true;
    return this;
  }

  public Builder addSausages(int sausageCount) {
    this.sausageCount = sausageCount;
    return this;
  }

  public Pizza build() {
    return new Pizza(this);
  }

}
  
}
