//java code for reverce the string without using inbuilt function
public class program{
	public static void main(String[] args){
		string n = "12345";
		string m = "";
		for( int i = 0; i < string.len(n); i++)
		{
			for(int j = string.len(n); j<0; j--)
			{
				n.charAt(i) = m.charAt(j);
			}
		}
	}
}
