class Main
{
	public static void main(String []argc)
	{
		int n= Integer.parseInt(argc[0]);
		int k = Integer.parseInt(argc[1]);
		System.out.println(impl1(n,k));
		System.out.println(withExtraSpace(n,k));
		System.out.println(withoutSpace(n,k));
	}
	public static int impl1(int n,int k)
	{
		int[][] data = new int[n+1][k+1];
		for(int i=0;i<=n;i++)
		{

			for(int t=0;t<=Math.min(k,i);t++)
			{
				if(t==0)
				{
					data[i][t]=1;
				}
				else
				{
					data[i][t] = t * data[i-1][t-1] + data[i-1][t];
				}
			}
		}
		return data[n][k];
	}

	public static int withExtraSpace(int n, int k)
	{
		int[] fact = new int[n+1];
		fact[0]=1;
		for(int i=1;i<=n;i++)
		{
			fact[i]= i* fact[i-1];
		}
		return fact[n]/fact[n-k];
	}
	public static int withoutSpace(int n,int k)
	{
		int result = 1;
		for(int i=n;i>(n-k);i--)
		{
			result = i* result;
		}
		return result;
	}
}
