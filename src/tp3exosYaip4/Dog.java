package tp3exosYaip4;

public class Dog extends Animal {
  public Dog(String name) {
	  super(name);
  }
@Override 
  public void greets() {
	  System.out.println("woaffffff");
  }
public void greets(Dog another) {
	  System.out.println("woaffffff");
}
public String toString() {
    return "Dog[" + super.toString() + "]";
}
}
