public class StringComparison {
    public static void main(String args[])
    {
        //Below method is used to utilise String Pool concept
        String a = "kushwaha";
        String b = "kushwaha";
        //System.out.println(a==b);
        //below will store in heap not string pool
        String s1= new String("kushwaha");
        String s2= new String("kushwaha");
       // System.out.println(s1==s2);
        //equals method doesn't care about memory it only see the values are same or not
        System.out.println(s1.equals(s2));
    }
}
