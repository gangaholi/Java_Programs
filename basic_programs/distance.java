import java.util.Scanner;
class distance
{  public static void main(String args[])
  {  Scanner in=new Scanner(System.in);
     int p1[]= new int[2];
     int p2[]= new int[2];
     System.out.println(" Enter poin1 - X, Y coordinate values");
     p1[0]=in.nextInt();
     p1[1]=in.nextInt();
     System.out.println(" Enter poin12- X, Y coordinate values");
     p2[0]=in.nextInt();
     p2[1]=in.nextInt();
     double t1, t2, dist;
     
     t1=p1[0]-p2[0]; 
     t2=p1[1]-p2[1];
     dist= t1*t1 + t2*t2;
     dist=Math.sqrt(dist);
     System.out.println("dist="+dist);    
  } 
}
