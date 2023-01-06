import java.util.*;
public class StringPalindromeOrNot
{
    public static boolean isPalindrome(String str)
    {
        int left=0;
        int right= str.length()-1;
        while(left<right)
        {
            if(str.charAt(left) != str.charAt(right))
            {
                return false;
            }
            else {
                left++;
                right--;
            }
        }
        return true;
    }
  public static void main(String args[])
  {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a string");
      String str = sc.next();
      boolean A = isPalindrome(str);
      System.out.println(A);
  }
}
