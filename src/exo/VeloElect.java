package exo;

public class VeloElect extends Velo{
  private double DEFAULT_FACTEUR_PUISSANCE_MOTEUR = 15.0;
  private double facteurPuissanceMoteur;
  
  public VeloElect (double braquet, double diamRoue, double coupleMoteur) {
	  super (braquet, diamRoue);
	  facteurPuissanceMoteur = coupleMoteur;
  }
  public VeloElect (double diamRoue, double coupleMoteur) {
	  super(diamRoue);
	  facteurPuissanceMoteur = coupleMoteur;
  }
  public VeloElect() {
	  super();
  }
  public double getDEFAULT_FACTEUR_PUISSANCE_MOTEUR() {
	return DEFAULT_FACTEUR_PUISSANCE_MOTEUR;
}
  public void setDEFAULT_FACTEUR_PUISSANCE_MOTEUR(double dEFAULT_FACTEUR_PUISSANCE_MOTEUR) {
	DEFAULT_FACTEUR_PUISSANCE_MOTEUR = dEFAULT_FACTEUR_PUISSANCE_MOTEUR;
}
  public double getFacteurPuissanceMoteur() {
	return facteurPuissanceMoteur;
}
  public void setFacteurPuissanceMoteur(double facteurPuissanceMoteur) {
	this.facteurPuissanceMoteur = facteurPuissanceMoteur;
}
  @Override
  public String toString() {
	  return "VeloElect [ facteurPuissanceMoteur =" + facteurPuissanceMoteur + "]";
  }
  @Override
  public double getPuissance(double FrequenceCoupDePedale) {
	  return super.getPuissance(FrequenceCoupDePedale) * facteurPuissanceMoteur;
  }
  public static void main (String[] args) {
      VeloElect v1 = new VeloElect();
      VeloElect v2 = new VeloElect(4, 5);
      VeloElect v3 = new VeloElect(3, 9, 7);
      System.out.println("Le velo elec a une puissance de" + v1 );
      System.out.println("Le velo elec a une puissance de" + v2 );
      System.out.println("Le velo elec a une puissance de" + v3 );
      }
}
