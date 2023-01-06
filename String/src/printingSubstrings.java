import java.io.*;
public class printingSubstrings
{
public static void main(String args[])throws IOException
{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    int n = str.length();
    for(int i=0;i<n;i++)
    {
        for(int j=i;j<n;i++)
        {
            for(int k=j;k<=j;k++)
            {
                System.out.print(str.charAt(k));
            }
            System.out.println();
        }
    }
}
}
