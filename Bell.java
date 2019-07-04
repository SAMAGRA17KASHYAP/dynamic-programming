class Main
{
	public static int bellNumber(int n)
	{
		int[][] bell = new int[n+1][n+1];
		bell[0][0]=1;
		for(int i=1;i<=n;i++)
		{
			bell[i][0]= bell[i-1][i-1];
			for(int j=1;j<=i;j++)
			{
				bell[i][j] = bell[i-1][j-1] + bell[i][j-1];
			}
		}
		return bell[n][0];
	}

	public static void main(String[] argv)
	{
		System.out.println("Bell number 1:"+bellNumber(1));
		System.out.println("Bell number2 :"+bellNumber(2));
		System.out.println("Bell number 3:"+bellNumber(3));
		System.out.println("Bell number 4:"+bellNumber(4));
	}
}
