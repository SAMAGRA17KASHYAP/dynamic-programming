class Main
{
static	public int bellNumber(int n)
	{
		if(n<=1) return 1;
		int[][] bell = new int[n+1][n+1];
		bell[0][0]=1;
		for(int i=1;i<n;i++)
		{
			bell[i][0] = bell[i-1][i-1];
			for(int j=1;j<=i+1;j++)
			{
				bell[i][j] = bell[i-1][j-1] + bell[i][j-1];
			}
		}
		return bell[n-1][n-1];
	}
	public static void main(String[] argv)
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(bellNumber(i));
		}
	}
}
