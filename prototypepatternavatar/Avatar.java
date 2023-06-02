package prototypepatternavatar;

public class Avatar implements Prototype {
  private int size;
  private int walkingSpeed;

  public Avatar(int size, int walkingSpeed) {
    this.size  = size;
    this.walkingSpeed = walkingSpeed;
  }

  public int getSize() {
    return size;
  }

  @Override
  public Prototype copy(){
    return new Avatar(size,walkingSpeed);
  }
}
