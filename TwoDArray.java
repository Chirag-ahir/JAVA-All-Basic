//2DArray is a Array of array;

public class TwoDArray{
	public static void main(String[] args){
	
		String cars[][] = new String[3][3];
		
		//first is row. second is column.
		
		cars[0][0] = "BMW";
		cars[0][1] = "Haundai";
		cars[0][2] = "Elantra";
		
		cars[1][0] = "Ford";
		cars[1][1] = "Oddi";
		cars[1][2] = "Mustang";
		
		cars[2][0] = "Maruti";
		cars[2][1] = "Echo";
		cars[2][2] = "Van";
		
		for(int i=0; i<cars.length; i++){
			System.out.println();
			for(int j=0; j<cars[i].length; j++){
				System.out.print(cars[i][j]+ " ");
			}
		}
	}
}