public class LinkedlistUSE {
    // public static void main(String args[])
    // {
    //     Node<Integer>n1 = new Node<>(10);
    //     System.out.println(n1.data);
    //     System.out.println(n1.next);
    // }
    public static Node<Integer> createLinkedlist()
    {
        Node<Integer>n1 = new Node<>(10);
        Node<Integer>n2 = new Node<>(20);
        Node<Integer>n3 = new Node<>(30);
        Node<Integer>n4 = new Node<>(40);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        return n1;
    }
    public static void printLinkedlist(Node<Integer>head)
    {
        Node<Integer>temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void increment(Node<Integer>head)
    {
        Node<Integer>temp = head;
        while(temp!=null)
        {
            temp.data++;
            temp = temp.next;
        }
    }
    public static int length(Node<Integer>head)
    {
        int count = 0;
        Node<Integer>temp = head;
        while(temp!=null)
        {
            count++;
            temp = temp.next;
        }
        return count;
    }
   public static void main(String args[])
   {
       Node<Integer> head = createLinkedlist();
       increment(head);
       printLinkedlist(head);
       System.out.println(length(head));
   }
}
