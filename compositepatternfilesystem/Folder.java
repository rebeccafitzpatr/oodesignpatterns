package compositepatternfilesystem;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemElement{
  private String name;
  private List<FileSystemElement> components = new ArrayList<FileSystemElement>();
  
  public Folder(String name) {
    this.name = name;
}

public void addComponent(FileSystemElement component) {
    components.add(component);
}

public void removeComponent(FileSystemElement component) {
    components.remove(component);
}

@Override
public void display() {
    System.out.println("Folder -> " + name);
    for (FileSystemElement component : components) {
        component.display();
    }
}

@Override
public int getSize() {
    int size = 0;
    for (FileSystemElement component : components) {
        size = size + component.getSize();
    }
    return size;
}
}
