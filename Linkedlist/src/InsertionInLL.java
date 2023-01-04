import java.util.*;
public class InsertionInLL
{
    public static Node<Integer> takeInput()
    {
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        Node<Integer>head = null;
        Node<Integer>tail = null;
        while(data!=-1)
        {
            Node<Integer>currentnode = new Node<>(data);
            if(head == null)
            {
                head = currentnode;
                tail = currentnode;
            }
            else
            {
              while(tail.next!=null)
              {
                  tail=tail.next;
              }
                tail.next=currentnode;
            }
            data = sc.nextInt();
        }
        return head;
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
    public static Node<Integer>insert(Node<Integer>head,int elem,int pos)
    {
        Node<Integer>NodeTobeInserted = new Node<>(elem);
        if(pos == 0)
        {
            NodeTobeInserted.next = head;
            head = NodeTobeInserted;
        }
        else
        {
            int count = 0;
            Node<Integer>prev = head;
            while(count<pos-1 && prev!=null)
            {
                count++;
                prev = prev.next;
            }
            if(prev!=null)
            {
                NodeTobeInserted.next = prev.next;
                prev.next = NodeTobeInserted;
            }
        }
        return head;
    }
  public static void main(String args[])
  {
    Node<Integer> head = takeInput();
    print(head);
    head =insert(head,80,2);
    print(head);
  }
}
