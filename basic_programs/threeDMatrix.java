//	Demonstrate a three-dimensional array. 
class  threeDMatrix
{	public static void main(String args[])
	{	int threeD[][][] = new int[3][3][3]; int i, j, k;
		for(i=0; i<3; i++) 			
			for(j=0; j<3; j++) 
				for(k=0; k<3; k++) 
					threeD[i][j][k] = k +1; 
		
      for(i=0; i<3; i++)
		{ 	for(j=0; j<3; j++)
			{     	for(k=0; k<3; k++)
					System.out.print(threeD[i][j][k] + " ");
				System.out.println();
			}
			System.out.println();
		}
	}
}

