package tp3exosYaip4;

public class Cat extends Animal {
  public Cat(String name) {
	  super(name);
  }
@Override
  public void greets() {
	  System.out.println("meowwwww");
  }
  public String toString() {
    return "Cat[" + super.toString() + "]";
}
}
