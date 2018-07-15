class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a=0,b=0,count;
		String c="";
		for( a=8+1;a<17;a++)
		{
			count=0;
			for(b=a;b>=1;b--)
			{
				if(a%b==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				c=c+a+" ";
			}
		}
			System.out.print(c);
		
	}
}
