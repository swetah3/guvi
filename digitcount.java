import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner input=new Scanner (System.in);
		int num;
		int count=0;
		num =input.nextInt();
		while(num!=0)
		{
			num =num/10;
			count=count+1;
		
		}
			System.out.println(+ count);
	}
}
