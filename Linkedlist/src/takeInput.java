import java.util.*;
public class takeInput {
    public static void print(Node<Integer>head)
    {
        Node<Integer>temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+"<- ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static int length(Node<Integer>head)
    {
        int count=0;
        Node<Integer>temp = head;
        while(temp!=null)
        {
            count++;
            temp = temp.next;
        }
        return count;
    }
    public static Node<Integer> TakeInput(){
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        Node<Integer>head = null;
        Node<Integer>tail = null;
        while(data!=-1)
        {
            Node<Integer>currentNode=new Node<Integer>(data);
            if(head == null)
            {
                head = currentNode;
                tail = currentNode;
            }
            else
            {
                tail.next = currentNode;
                tail = currentNode;
            }
            data = sc.nextInt();
        }
        return head;
        }

    public static void main(String[] args) {
        Node<Integer> head = TakeInput();
        System.out.println(length(head));
    }
}

