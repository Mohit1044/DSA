import java.util.*;
public class InsertStarting
{
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
    public static Node<Integer>insertStart(Node<Integer>head,int pos,int data)
    {
        Node<Integer>newNode = new Node<>(data);
        if(pos ==0 )
        {
            newNode.next = head;
            head = newNode;
            return head;
        }

        return head;
    }
    public static void main(String[] args) {
        Node<Integer>head = takeInput();
        print(head);
         head=insertStart(head,0,5);
        print(head);
    }
}
