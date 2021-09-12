class array
{
	public static void main(String args[])
	{	
		
		int ar[]={11,12,23,44,565,45,43,344,32,4};
		System.out.println("---array elements---");
		for(int i=0;i<ar.length;i++)
		{
			if (ar[i]==1||ar[i]==0)
			{
				System.out.println(ar[i] + " no is not prime number");
				break;
			}
				if (ar[i]%2!=0)
					System.out.println(ar[i] + " no is  prime number");
				else
					System.out.println(ar[i] + " no is not prime number");
		}		
	}
}