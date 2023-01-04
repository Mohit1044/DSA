import java.util.*;
public class DeletioninLL {
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
                while (tail.next!=null)
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
    public static Node<Integer>delete(Node<Integer>head,int pos)
    {
        if(head == null)
        {
            return head;
        }
        if(pos == 0)
        {
            return head.next;
        }
        int count = 0;
        Node<Integer>currentHead = head;
        while(currentHead!=null && count<(pos-1))
        {
            currentHead = currentHead.next;
            count++;
        }
        if(currentHead==null || currentHead.next==null)
        {
            return head;
        }
        currentHead.next=currentHead.next.next;
        return head;
    }
    public static void main(String[] args) {
        Node<Integer>head = takeInput();
        print(head);
        head = delete(head,2);
        print(head);
    }
}
