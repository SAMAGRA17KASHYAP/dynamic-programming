class Fibo
{
	public static void main(String[] argv)
	{
		if(args.length == 0)
		{
			System.out.println("Please pass some arguments");
			return;
		}
		int n = Integer.parseInt(argv[0]);
		int i1 = 0, i2 =1;
		for(int i=2;i<=n;i++)
		{
			int temp =i2;
			i2 = i1 +i2;
			i1 = temp;
		
		}
		
	}
}
