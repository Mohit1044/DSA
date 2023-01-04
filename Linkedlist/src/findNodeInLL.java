import java.util.*;

public class findNodeInLL {
    public static int FindNode(Node<Integer>head, int n)
    {
        if(head == null)
        {
            return -1;
        }
        int i=0;
        while(head!=null)
        {
            if(head.data.equals(n))
            {
                return i;
            }
            head = head.next;
            i++;
        }
        return -1;
    }
    public static Node<Integer> takeInput ()
    {
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        Node<Integer> head = null;
        Node<Integer> tail = null;
        while (data != -1) {
            Node<Integer> currentNode = new Node<>(data);
            if (head == null) {
                head = currentNode;
                tail = currentNode;
            } else {
                while (tail.next != null) {
                    tail = tail.next;
                }
                tail.next = currentNode;
            }
            data = sc.nextInt();
        }
        return head;
    }
    public static void print (Node < Integer > head)
    {
        Node<Integer> temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
       Node<Integer>head = takeInput();
       print(head);
        System.out.println(FindNode(head,20));
    }
}
