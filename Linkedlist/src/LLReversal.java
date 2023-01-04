import java.util.*;
public class LLReversal {
    public static void printRecursive(Node<Integer>head)
    {
        if(head == null)
        {
            return;
        }
        System.out.print(head.data+"->");
        printRecursive(head.next);
    }
    public static void print(Node<Integer>head)
    {
        Node<Integer>temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println();
    }
    public static Node<Integer>takeInput()
    {
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        Node<Integer>head = null;
        Node<Integer>tail = null;
        while(data!=-1)
        {
            Node<Integer>currentNode = new Node<>(data);
            if(head == null)
            {
                head = currentNode;
                tail = currentNode;
            }
            else{
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
    public static Node<Integer>reverseIterate(Node<Integer>head)
    {
        Node<Integer>previous =null;
        Node<Integer>curr = head;
        Node<Integer>next = null;

      while(curr!=null)
      {
          next = curr.next;
          curr.next = previous;
          previous = curr;
          curr = next;
      }
      head = previous;
      return head;
    }

    public static void main(String[] args) {
        Node<Integer>head = takeInput();
        printRecursive(head);
        head = reverseIterate(head);
        printRecursive(head);
    }
}
