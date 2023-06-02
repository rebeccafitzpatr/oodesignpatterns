components of the design pattern are:

- command - declares an interface for execution

- ConcreteCommand: are classes that implement the Command interface, they keep a reference of who is the receiver of the command

- receiver: just knows how to execute the particular command
- Invoker: holds the COncreteCommand that is going to be executed;

- Client: creates a ConcreteCommand and give it to the Invoker.


Notably, this design pattern keeps the invoke separate from the receiver.

Lets implement a remote control for a home system that automates the toggling of electrical units: lights, doors

so: Lights, doors are the recievers
 - create the command inteface for execution

 - create 4 concreate commands for light on, light off, door open and door close

 - create an invoker, which is the remote control