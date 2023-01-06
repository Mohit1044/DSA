import java.io.*;
public class stringbasic
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String firstname = br.readLine();
        String lastname = br.readLine();
        String fullname = firstname+" "+lastname;
        System.out.println(fullname.length());
        for(int i=0;i<fullname.length();i++)
        {
            System.out.println(fullname.charAt(i));
        }
    }
}
