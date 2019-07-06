import static java.lang.Math.max;
class Main
{
	public static void main(String[] argv)
	{
		int gold[][]= { {1, 3, 1, 5}, 
                        {2, 2, 4, 1}, 
                        {5, 0, 2, 3}, 
                        {0, 6, 1, 2} }; 
                          
        int m = 4, n = 4; 
          
        System.out.print(goldMine(gold, m, n)); 

	}

	public static int goldMine(int[][] gold,int m,int n)
	{
		int[][] goldTable = new int[m][n];

		int rightUp = 0, right = 0,rightDown =0;

		for(int col = n-1;col>=0;col--)
		{
			for(int row = 0;row<m;row++)
			{
				right = (col == n-1)?0:goldTable[row][col+1];
				rightUp = (col == n-1||row==0)?0:goldTable[row-1][col+1];
				rightDown = (col == n-1||row == m-1)?0:goldTable[row+1][col+1];
				goldTable[row][col]= gold[row][col] + max(right,max(rightUp,rightDown)); 
			}
		}
		int res = goldTable[0][0];
		for(int i=1;i<m;i++)
		{
			res = max(res,goldTable[i][0]);
		}
		return res;
	}
}

