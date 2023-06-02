package prototypepatternavatar;

public class Main {
  public static void main(String[] args) {
    Avatar avatar = new Avatar(50, 30);
    System.out.println(avatar);
    Avatar clone = (Avatar) avatar.copy();
    System.out.println(clone);
  }
  
}
