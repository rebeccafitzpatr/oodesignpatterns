package commandpatternhomecontrolsystem;

public class Main {

  public static void main(String[] args) {
    Door garageDoor = new Door("garage");
    Door catDoor = new Door("cat");
    RemoteControl invoker = new RemoteControl();


    DoorCloseCommand closeCatDoor = new DoorCloseCommand(catDoor);
    DoorOpenCommand openGarage = new DoorOpenCommand(garageDoor);

    invoker.setCommand(closeCatDoor);
    invoker.pressButton();

    invoker.setCommand(openGarage);
    invoker.pressButton();

    invoker.pressButton();

  } 
  
}
