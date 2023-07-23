package String;

public class EqualsAndequalOperator {
public static void main(String args[])
{
	String s1="Ayushi";
	String s2="Ayushi";
	String s3=new String("Ayushi");
	if(s1==s2)
	{
	System.out.println("s1 and s2 refer to same object.");//True
	}
	if(s1==s3)
	{
	System.out.println("s1 and s3 refers to same object.");//false
	}else {
		System.out.println("s1 and s3 refers to different objects.");//false
	}
	
	System.out.println(s1.equals(s3));//true
	System.out.println(s1.equals(s2));//true
}
}
