package compositepatternfilesystem;

  
public class File implements FileSystemElement{
  private String name;
  private int size;
  public File(String name, int size){
    this.name = name;
    this.size = size;
  }

  @Override
    public void display() {
        System.out.println("File -> " + name);
    }

    @Override
    public int getSize() {
        return size;
    }
}
