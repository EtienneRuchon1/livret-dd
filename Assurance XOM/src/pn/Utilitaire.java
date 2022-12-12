package pn;

public class Utilitaire {
	
	  public static double arrondi(double val, int dec)
	  {
	    double mult = Math.pow(10.0D, dec);
	    double res = Math.round(val * mult) / mult;
	    return res;
	  }
	

}
