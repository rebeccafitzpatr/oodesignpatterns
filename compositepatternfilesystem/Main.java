package compositepatternfilesystem;

public class Main {

  public static void main(String[] args) {
    Folder folder = new Folder("homework");
    File file1 = new File("todaysHomework", 13);

    folder.addComponent(file1);

    folder.display();
  }
  
}
