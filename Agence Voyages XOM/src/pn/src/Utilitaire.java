package pn.src;

public class Utilitaire {
	 public static int nbCorrespondances = 0;
	 public static int dist = 0;
	 
	 
	  public static void calculerVoyage(String v1, String v2)
	  {
	    if ( (v1.equals("Paris") && 
	    	  v2.equals("Nantes")) ||
	    	  (v1.equals("Nantes") && 
	    	    	  v2.equals("Paris")))
	    	  {
	    	    dist = 400;
	    	    nbCorrespondances = 0;
	    }
	    if ( (v1.equals("Paris") && 
		    	  v2.equals("Biarritz")) ||
		    	  (v1.equals("Biarritz") && 
		    	    	  v2.equals("Paris")))
		    	  {
		    	    dist = 800;
		    	    nbCorrespondances = 1;
		    }
	    if ( (v1.equals("Paris") && 
		    	  v2.equals("Toulouse")) ||
		    	  (v1.equals("Toulouse") && 
		    	    	  v2.equals("Paris")))
		    	  {
		    	    dist = 850;
		    	    nbCorrespondances = 1;
		    }

	    if ( (v1.equals("Paris") && 
		    	  v2.equals("Bordeaux")) ||
		    	  (v1.equals("Bordeaux") && 
		    	    	  v2.equals("Paris")))
		    	  {
		    	    dist = 600;
		    	    nbCorrespondances = 0;
		    }
	    if ( (v1.equals("Paris") && 
		    	  v2.equals("Lille")) ||
		    	  (v1.equals("Lille") && 
		    	    	  v2.equals("Paris")))
		    	  {
		    	    dist = 200;
		    	    nbCorrespondances = 0;
		    }
	    if ( (v1.equals("Paris") && 
		    	  v2.equals("Marseille")) ||
		    	  (v1.equals("Marseille") && 
		    	    	  v2.equals("Paris")))
		    	  {
		    	    dist = 750;
		    	    nbCorrespondances = 1;
		    }
	    if ( (v1.equals("Paris") && 
		    	  v2.equals("Lyon")) ||
		    	  (v1.equals("Lyon") && 
		    	    	  v2.equals("Paris")))
		    	  {
		    	    dist = 450;
		    	    nbCorrespondances = 0;
		    }
}

	  public static double calculPrixTrajet(int km, double coutParKm)
	  {
	    double res = km * coutParKm;
	    return arrondi(res, 2);
	  }

	  public static double arrondi(double val, int dec)
	  {
	    double mult = Math.pow(10.0D, dec);
	    double res = Math.round(val * mult) / mult;
	    return res;
	  }

}
