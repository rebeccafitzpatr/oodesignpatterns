package builderpatternnoodleshop;

public class SoupNoodle {
  public enum NoodleType{THICK, THIN};
  public enum Sizes{SMALL, MEDIUM, LARGE};
  
  private NoodleType noodleType; 
  private Sizes size;
  private boolean extraNoodle;
  private boolean extraVeggies;
  private boolean bambooShoots;
  private int eggs;

  private SoupNoodle(Builder builder) {
    this.noodleType = builder.noodleType;
    this.size = builder.size;
    this.extraNoodle = builder.extraNoodle;
    this.extraVeggies = builder.extraVeggies;
    this.bambooShoots = builder.bambooShoots;
    this.eggs = builder.eggs;
  }


  public static class Builder {
    private NoodleType noodleType; 
    private Sizes size;
    private boolean extraNoodle = false;
    private boolean extraVeggies = false;
    private boolean bambooShoots = false;
    private int eggs = 0;

  public Builder(NoodleType noodleType, Sizes size) {
    this.noodleType = noodleType;
    this.size = size;
  }

  public Builder extraNoodle() {
      this.extraNoodle = true;
      return this;
    }

    public Builder extraVeggies(){
      this.extraVeggies = true;
      return this;
    }
    public Builder bambooShoots(){
      this.bambooShoots = true;
      return this;

    }
    public Builder addEggs(int eggsToAdd) {
      this.eggs += eggsToAdd;
      return this;
    }

    public SoupNoodle build() {
      return new SoupNoodle(this);
    }
  }

}
