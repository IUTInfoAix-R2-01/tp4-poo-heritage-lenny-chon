package tp3exosYaip63;

public class MovablePoint {
  private int x;
  private int y;
  private int xSpeed;
  private int ySpeed;
  
  public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
	  this.x = x;
	  this.y = y;
	  this.xSpeed = xSpeed;
	  this.ySpeed = ySpeed;
  }
  public String ToString() {
	  return "(x, y) speed=(x, y)";
  }
  public void MoveUp() {
	  y -= ySpeed;
  }
  public void MoveDown() {
	  y += ySpeed;
  }
  public void MoveLeft() {
	  x -= xSpeed;
  }
  public void MoveRight() {
	  x += xSpeed;
  }
}

