
public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1,row=1,col,a=3;
		char s=(char)65;
		for( a=1;a<=3;a++)
		{
			if(row<4)
			{
				s=(char)65;
				a=a-1;
			}
			else{
				s=(char)67-1;
				a=a+1;
			}
			System.out.print(" ");	
		}
		for( row=1;row<=5;row++)
		{
			for(col=1;col<=n;col++)
			{
				int m=n/2+1;
				System.out.print(s);
				if(col<m)
				{
				s--;
				}
				else{
					s++;
				}
				
			}
			System.out.println();
			if(row<4){
			n=n+2;
			}
			else
			{
				n=n-2;
			}
		}
		
	}
	
	}