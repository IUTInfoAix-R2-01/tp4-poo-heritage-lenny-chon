package exo;
import java.util.Random;
public class Velo {
  private double DEFAULT_BRAQUET = 13.0;
  private double braquet;
  private double diamRoue;
  private Random genAlea;
  public double getDEFAULT_BRAQUET() {
	return DEFAULT_BRAQUET;
}
  public void setDEFAULT_BRAQUET(double dEFAULT_BRAQUET) {
	DEFAULT_BRAQUET = dEFAULT_BRAQUET;
}
  public double getBraquet() {
	return braquet;
}
  public void setBraquet(double braquet) {
	this.braquet = braquet;
}
  public double getdiamRoue() {
	return diamRoue;
}
  public void setdiamRoue(double diamRoue) {
	diamRoue = diamRoue;
}
  public Random getGenAlea() {
	return genAlea;
}
  public void setGenAlea(Random genAlea) {
	this.genAlea = genAlea;
}
  public Velo(double braquet, double diamRoue) {
	  this.braquet = braquet;
	  this.diamRoue = diamRoue;
  }
  public Velo(double braquet) {
	  this.braquet = braquet;
  }
  public Velo() {
	  super();
  }
  public String toString() {
	  return "Velo [ braquet =" + braquet + ", diamroue=" + diamRoue + "]";
  }
  public double getPuissance(double FrequenceCoupDePedale) {
	  return FrequenceCoupDePedale*braquet*diamRoue*genAlea.nextDouble();
  }
  public static void main (String[] args) {
      Velo v1 = new Velo();
      Velo v2 = new Velo(4, 5);
      System.out.println("Le velo a une puissance de" + v1 );
      System.out.println("Le velo a une puissance de" + v2 );
      }
}