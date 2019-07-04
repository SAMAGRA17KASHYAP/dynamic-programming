class Main
{
	public static int binom(int n,int k)
	{
		int[] bin = new int[k+1];
		bin[0]=1;
		for(int i=1;i<=n;i++)
		{
			for(int j= Math.min(i,k);j>0;j--)
			{
				bin[j]=bin[j]+bin[j-1];
			}
		}
		return bin[k];
	}
	public static void main(String[] argv)
	{
		int n = Integer.parseInt(argv[0]);
		int k = Integer.parseInt(argv[1]);
		System.out.println(binom(n,k));
	}
}




