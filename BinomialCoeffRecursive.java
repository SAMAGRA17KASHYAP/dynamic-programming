class Main
{
	public static int binomial(int n,int k)
	{
		System.out.println(n+"::"+k);
		if(n<0||k<0) return 0;
		if(n == 0||k==n)
			return 1;
		return binomial(n-1,k-1) + binomial(n-1,k);
	}
	public static void main(String[] args)
	{
		System.out.println(binomial(5,4));
	}
}
