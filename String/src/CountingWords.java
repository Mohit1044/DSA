import java.util.Scanner;
public class CountingWords {
    public static int countwords(String str)
    {
        if(str.length()==0)
        {
            return 0;
        }
        int spaces=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i) == ' ')
            {
                spaces++;
            }
        }
        return spaces+1;
    }
public static void main(String args[])
{
    Scanner sc = new Scanner(System.in);
    String str= sc.next();
    countwords(str);
}
}
