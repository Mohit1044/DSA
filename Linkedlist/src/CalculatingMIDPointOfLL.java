import java.util.*;
public class CalculatingMIDPointOfLL
{
    public static Node<Integer>midpoint(Node<Integer>head)
    {
        if(head == null || head.next == null)
        {
            return head;
        }
        Node<Integer>slow = head;
        Node<Integer>fast = head;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static void printRecursive(Node<Integer>head)
    {
       if(head == null)
       {
           return;
       }
        System.out.println(head.data+" ");
       printRecursive(head.next);
    }
    public static Node<Integer>takeInput()
    {
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        Node<Integer> head = null;
        Node<Integer> tail = null;
        while(data!=-1)
        {
            Node<Integer>currentNode = new Node<Integer>(data);
            if( head == null)
            {
                head = currentNode;
                tail = currentNode;
            }
            else
            {
                while(tail.next!=null)
                {
                    tail = tail.next;
                }
                tail.next = currentNode;
            }
            data = sc.nextInt();
        }
        return head;
    }
    public static void main(String[] args)
    {
      Node<Integer>head = takeInput();
      printRecursive(head);
      Node<Integer>mid = midpoint(head);
        System.out.println("Mid point of linked list:-"+mid.data);
    }
}
