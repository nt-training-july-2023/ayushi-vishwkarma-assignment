package String;

public class OtherMethods {
public static void main(String[] args)
{
	String str1="AYUSHI",str2="ayushi";
	String str3="AYUSHI";
	String str4="Arpita";
	if(str1.equalsIgnoreCase(str2))
	{
		System.out.println(str1+" and "+str2+ " are equal");
	}
	//CompareTo(CaseSensitive)
	System.out.println(str1.compareTo(str2));
	System.out.println(str1.compareTo(str3));
	System.out.println(str1.compareTo(str4));
	System.out.println(str2.compareTo(str1));
	//CompareTo(IgnoreCaseSenstitve)
	System.out.println(str1.compareToIgnoreCase(str2));
	//ends with
	System.out.println(str4.endsWith("ita"));
	//last IndexOf Method
	String S="Hello Indore,Welcome to Indore.";
	System.out.println(S.lastIndexOf("Indore"));
}  
}
