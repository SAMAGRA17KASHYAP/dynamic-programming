class Main
{
	public static  int calculate(int n,int k)
	{
		int[][]bin = new int[n+1][k+1];
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=Math.min(i,k);j++)
			{
				if(i == j || j==0)
					bin[i][j]=1;
				else
				{
					bin[i][j]= bin[i-1][j-1]+bin[i-1][j];
				}
			}
		}
		return bin[n][k];
	}
	public static void main(String[] args)
	{
		int n = Integer.parseInt(args[0]);
		int k = Integer.parseInt(args[1]);
		System.out.println(calculate(n,k));
	}
}
