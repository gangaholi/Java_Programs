// Compute the area of a circle.
class Area {
	public static void main(String args[]) {
		double pi,radius, area;
		
      radius = 11;// radius of circle
		pi = 3.1416; // pi, approximately
		if(radius >0)
      {  area = pi * radius * radius; // compute area
         System.out.println("Area of circle is " + area);
      }
      else
         System.out.println("Radius not greater than "+radius);
      
	}
}
