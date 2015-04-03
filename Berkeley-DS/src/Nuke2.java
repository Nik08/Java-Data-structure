import java.util.Scanner;

public class Nuke2 {
	public static void main(String args[])
	{
		System.out.println("Enter a word");
		Scanner input=new Scanner(System.in);
		String x= input.nextLine();
		int len=x.length();
		int i=0,j=1,k=0;
			if(i==0 && j==1)
			{
				System.out.print(x.substring(i,j));
				i++;j++;
				
				for(k=0;k<((len)-1);k++)
				{
					if(i==1 &&j==2)
					{
						i++;j++;
					}
					else{
						System.out.print(x.substring(i,j));
						i++;j++;
					}
				}
			}
			
		
	}
		
}
