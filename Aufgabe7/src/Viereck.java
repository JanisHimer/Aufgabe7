//arsch


import java.awt.Point;
import java.util.ArrayList;

public class Viereck {
    private Point a;
    private Point b;
    private Point c;
    private Point d;

    public Viereck(Point a, Point b, Point c, Point d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public boolean isQuadratLOL() {
    	double ab = Math.sqrt((a.getX()-b.getX())*(a.getX()-b.getX())+(a.getY()-b.getY())*(a.getY()-b.getY()));
  	   	double bc = Math.sqrt((c.getX()-b.getX())*(c.getX()-b.getX())+(c.getY()-b.getY())*(c.getY()-b.getY()));
  	   	double cd = Math.sqrt((c.getX()-d.getX())*(c.getX()-d.getX())+(c.getY()-d.getY())*(c.getY()-d.getY()));
  	   	double da = Math.sqrt((a.getX()-d.getX())*(a.getX()-d.getX())+(a.getY()-d.getY())*(a.getY()-d.getY()));
  	   	double f = Math.sqrt((d.getX()-b.getX())*(d.getX()-b.getX())+(d.getY()-b.getY())*(d.getY()-b.getY()));
  	   	double e = Math.sqrt((a.getX()-c.getX())*(a.getX()-c.getX())+(a.getY()-c.getY())*(a.getY()-c.getY()));
  	   	
  	   	double alpha = Math.acos( (f*f-ab*ab-da*da) / (-2*ab*da) );
  	   	double beta = Math.acos( (e*e-ab*ab-bc*bc) / (-2*ab*bc) );
		double gamma = Math.acos( (f*f-bc*bc-cd*cd) / (-2*bc*cd) );
		
  	   	if( (ab == bc) && (bc == cd) && (cd == da) && (alpha == beta)&&(beta ==gamma)&& (gamma == alpha)){
  		   return true;
  	   	}
  	   	
    	return false;
    }
    
    public boolean istRechteckLOL(){
    	double ab = Math.sqrt((a.getX()-b.getX())*(a.getX()-b.getX())+(a.getY()-b.getY())*(a.getY()-b.getY()));
  	   	double bc = Math.sqrt((c.getX()-b.getX())*(c.getX()-b.getX())+(c.getY()-b.getY())*(c.getY()-b.getY()));
  	   	double cd = Math.sqrt((c.getX()-d.getX())*(c.getX()-d.getX())+(c.getY()-d.getY())*(c.getY()-d.getY()));
  	   	double da = Math.sqrt((a.getX()-d.getX())*(a.getX()-d.getX())+(a.getY()-d.getY())*(a.getY()-d.getY()));
  	   	double f = Math.sqrt((d.getX()-b.getX())*(d.getX()-b.getX())+(d.getY()-b.getY())*(d.getY()-b.getY()));
  	   	double e = Math.sqrt((a.getX()-c.getX())*(a.getX()-c.getX())+(a.getY()-c.getY())*(a.getY()-c.getY()));
  	   	
  	   	double alpha = Math.acos( (f*f-ab*ab-da*da) / (-2*ab*da) );
  	   	double beta = Math.acos( (e*e-ab*ab-bc*bc) / (-2*ab*bc) );
		double gamma = Math.acos( (f*f-bc*bc-cd*cd) / (-2*bc*cd) );
    	
		if( (ab == cd) && (bc == da) && (alpha == beta)&&(beta ==gamma)&& (gamma == alpha)){
	  		   return true;
	  	   	}
    	
    	return false;
    }
    
    public boolean isQuadrat() {
        if ((a.getX() == b.getX()) && (a.getY() == d.getY()) && (b.getY() == c.getY()) && (c.getX() == d.getX())) {
            double ab = Math.abs(a.getY() - b.getY());
            double bc = Math.abs(b.getX() - c.getX());
            double cd = Math.abs(c.getY() - d.getY());
            double da = Math.abs(d.getX() - a.getX());
            if (ab == bc && cd == da && bc == cd) {
                return true;
            }
        }
        return false;
    }
    
    public boolean isTrapez(){
    	
    	double ab = Math.sqrt((a.getX()-b.getX())*(a.getX()-b.getX())+(a.getY()-b.getY())*(a.getY()-b.getY()));
    	double bc = Math.sqrt((c.getX()-b.getX())*(c.getX()-b.getX())+(c.getY()-b.getY())*(c.getY()-b.getY()));
  	   	double cd = Math.sqrt((c.getX()-d.getX())*(c.getX()-d.getX())+(c.getY()-d.getY())*(c.getY()-d.getY()));
  	   	double da = Math.sqrt((a.getX()-d.getX())*(a.getX()-d.getX())+(a.getY()-d.getY())*(a.getY()-d.getY()));
  	   	double f = Math.sqrt((d.getX()-b.getX())*(d.getX()-b.getX())+(d.getY()-b.getY())*(d.getY()-b.getY()));
  	   	double e = Math.sqrt((a.getX()-c.getX())*(a.getX()-c.getX())+(a.getY()-c.getY())*(a.getY()-c.getY()));
  	   	
  	   	double alpha = Math.acos( (e*e-ab*ab-bc*bc) / (2*ab*bc) );
  	   	double beta = Math.acos( (f*f-ab*ab-bc*bc) / (2*ab*bc) );
  	   	double gamma = Math.acos( (e*e-cd*cd-da*da) / (2*cd*da) );
  	   	double delta = Math.acos( (f*f-cd*cd-da*da) / (2*cd*da) );
  	     	   	
  	   	if((alpha == beta) && (gamma == delta)){
  	   		return true;
  	   	}
    	
    	
    	return false;
    }
   
   public boolean isRechteck(){
	   if ((a.getX() == b.getX()) && (a.getY() == d.getY()) && (b.getY() == c.getY()) && (c.getX() == d.getX())) {
           double ab = Math.abs(a.getY() - b.getY());
           double bc = Math.abs(b.getX() - c.getX());
           double cd = Math.abs(c.getY() - d.getY());
           double da = Math.abs(d.getX() - a.getX());
           if (ab == cd && bc == da) {
               return true;
           }
       }
       return false;
   }
   
   
   public boolean isParallelogramm(){
	   double ab = Math.sqrt((a.getX()-b.getX())*(a.getX()-b.getX())+(a.getY()-b.getY())*(a.getY()-b.getY()));
	   double bc = Math.sqrt((c.getX()-b.getX())*(c.getX()-b.getX())+(c.getY()-b.getY())*(c.getY()-b.getY()));
	   double cd = Math.sqrt((c.getX()-d.getX())*(c.getX()-d.getX())+(c.getY()-d.getY())*(c.getY()-d.getY()));
	   double da = Math.sqrt((a.getX()-d.getX())*(a.getX()-d.getX())+(a.getY()-d.getY())*(a.getY()-d.getY()));
	   double f = Math.sqrt((d.getX()-b.getX())*(d.getX()-b.getX())+(d.getY()-b.getY())*(d.getY()-b.getY()));
	 
	   double alpha = Math.acos( (f*f-ab*ab-bc*bc) / (-2*ab*bc) );
	   double beta = Math.acos( (f*f-ab*ab-bc*bc) / (2*ab*bc) );
	   double gamma = Math.acos( (f*f-cd*cd-da*da) / (-2*cd*da) );
	   double delta = Math.acos( (f*f-cd*cd-da*da) / (2*cd*da) );
	   
	   if( (ab==cd) && (bc == da) && (alpha == gamma) && (beta == delta) ){
		   return true;
	   }
  
	   return false;
   }
    
   
   public boolean isViereck(){
	   return true;
   }
   
   public boolean isRaute(){
	   double ab = Math.sqrt((a.getX()-b.getX())*(a.getX()-b.getX())+(a.getY()-b.getY())*(a.getY()-b.getY()));
	   double bc = Math.sqrt((c.getX()-b.getX())*(c.getX()-b.getX())+(c.getY()-b.getY())*(c.getY()-b.getY()));
	   double cd = Math.sqrt((c.getX()-d.getX())*(c.getX()-d.getX())+(c.getY()-d.getY())*(c.getY()-d.getY()));
	   double da = Math.sqrt((a.getX()-d.getX())*(a.getX()-d.getX())+(a.getY()-d.getY())*(a.getY()-d.getY()));
	   
	   if( (ab== bc) && (bc == cd) && (cd == da)){
		  return true;
	   }
	   return false;
		   
   }
    
    
    public static void main (String args[]){
    	Point a = new Point(0,0);
    	Point b = new Point(5,0);
    	Point c = new Point(5,5);
    	Point d = new Point(0,5);
    	Viereck quadrat = new Viereck(a,b,c,d);
    	
    	ArrayList<Viereck> liste = new ArrayList<Viereck>();
    	liste.add(quadrat);
    	liste.add(new Viereck(new Point(0,0), new Point(3,0), new Point(5,4), new Point(2,4)));
   
    	for(int i = 0; i< liste.size();i++){
    		Viereck tmp = liste.get(i);
    		System.out.println("//////////////////////////////////////");
    		System.out.println("A("+tmp.a.getX()+","+tmp.a.getY()+"), B("+tmp.b.getX()+","+tmp.b.getY()+"), C("+tmp.c.getX()+","+tmp.c.getY()+"), D("+tmp.a.getX()+","+tmp.a.getY()+")");
    		System.out.println("Quadrat?: "+tmp.isQuadratLOL());
    		System.out.println("Rechteck?: "+tmp.istRechteckLOL());
    		System.out.println("Parallelogram?: "+tmp.isParallelogramm());
    		System.out.println("Trapez?: "+ tmp.isTrapez());
    		System.out.println("Raute?: "+ tmp.isRaute());
    		System.out.println("//////////////////////////////////////");
    	}
    	
    }
    
}

