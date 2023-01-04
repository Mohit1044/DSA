import java.util.*;
public class LLinput {
    public static Node<Integer>TakeInput()
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
            else
            {
                tail = tail.next;
                tail.next = currentNode;
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
    public static void printIthNode(Node<Integer>head,int i)
    {
        int position = 0;
        Node<Integer>temp = head;
        while(temp!=null && position<i)
        {
            temp = temp.next;
            position++;
        }
        if(temp!=null)
        {
            System.out.println(temp.data);
        }
    }
    public static void main(String args[])
    {
        Node<Integer>head = TakeInput();
        printIthNode(head,2);
    }
}
