class MyPoint 
{   int x, y;
    MyPoint() 
    {   x = 0; y = 0;      }

    MyPoint(int p, int q) 
    {   x = p;   y = q;     }

    void setxy(int p, int q)
    {   x = p;   y = q;    }

    int[] getxy() 
    {   int[] point = new int[2];
        point[0] = x;
        point[1] = y;
        return point;
    }

    double distance(int p, int q) 
    {   double dist;
        double xdiff=Math.pow((x - p),2);
        double ydiff=Math.pow((y - q),2);
        dist = Math.sqrt(xdiff+ ydiff);
        return dist;
    }

    double distance(MyPoint point) 
    {   double dist;
        double xdiff = Math.pow((x - point.x),2);
	     double ydiff = Math.pow((y - point.y),2);
	     dist = Math.sqrt((xdiff+ ydiff));
        return dist;
    }

    double distance() 
    {  double dist;
       dist = Math.sqrt(x * x + y * y);
       return dist;
    }

    public String toString() {
           return ("The coordinate value of x = " + x + "  and  y=" + y);
    }
}

public class Program4 
{
    public static void main(String args[]) 
    {      
        MyPoint mypoint = new MyPoint(4, 5); 
        System.out.println(mypoint);
        int[] point = mypoint.getxy();  
        System.out.print("\nDistance from Point 7,6 to " + point[0] + ", " + point[1] + " is ");
        double distance = mypoint.distance(7, 6);
        System.out.println(distance);
        
        System.out.print("\nDistance from Origin(0,0) to " + point[0] + ", " + point[1] + " is ");
        distance = mypoint.distance();
        System.out.println(distance);
       
        MyPoint mypoint1 = new MyPoint(8, 9);
        System.out.println(mypoint1);
        int[] point1 = mypoint1.getxy();
        System.out.println(mypoint1);
 
        System.out.print("\nDistance from point " + point[0] + ", " + point[1]);
        System.out.println("  to " + point1[0] + ", " + point1[1]+ " is ");
        distance = mypoint1.distance(mypoint);
        System.out.println(distance);  

        System.out.print("\nDistance from Origin(0,0) to " + point1[0] + ", " + point1[1]);
        System.out.print(" is ");
        distance = mypoint1.distance();
        System.out.println(distance);

    }
}
