/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
char ch;
Scanner input=new Scanner (System.in);
System.out.println("input the character");
ch=input.next().charAt(0);
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
{
	System.out.println("Vowel");
	
}
else{
	System.out.println("consonent");
}
}
}
