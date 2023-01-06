import java.util.Scanner;
public class reverseString {
    public static String inputString()
    {
        Scanner sc= new Scanner(System.in);
        String Str = sc.next();
        return Str;
    }
    public static String stringreverse(String str)
    {
        String reversedString = "";
        for(int i = str.length()-1;i>=0;i--)
        {
            reversedString += str.charAt(i);
        }
        return reversedString;
    }
    public static void main(String args[])
    {
        String str = inputString();
        String reversedString = stringreverse(str);
        System.out.println(reversedString);
    }
}
