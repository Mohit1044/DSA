import java.util.*;
public class TakeINPUTinDOUBLYLL {
    public static DoublyNode<Integer> TakeInput(){
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        DoublyNode<Integer>head = null;
        DoublyNode<Integer>tail = null;
        while(data!=-1)
        {
            DoublyNode<Integer>currentNode=new DoublyNode<Integer>(data);
            if(head == null)
            {
                head = currentNode;
                tail = currentNode;
            }
            else
            {
                tail.next = currentNode;
                currentNode.prev = tail;
                tail = currentNode;
            }
            data = sc.nextInt();
        }
        return head;
    }
    public static DoublyNode<Integer>insert(DoublyNode<Integer>head,int data,int pos)
    {
         DoublyNode <Integer>h = head;
        DoublyNode<Integer>newNode = new DoublyNode<>(data);
        if(pos==0)
        {
            newNode.next = head;
            head.prev=newNode;
            return newNode;
        }
        else
        {
            while (pos>1)
            {
                head = head.next;
                pos--;
            }
            if(head.next == null)
            {
                head.next = newNode;
                newNode.prev = head;
                return h;
            }
            else
            {
                DoublyNode<Integer>temp = head.next;
                head.next = newNode;
                newNode.next = temp;
                newNode.prev =head;
                temp.prev=newNode;
                return h;
            }
        }
    }
    public static void print(DoublyNode<Integer>head)
    {
        if(head == null)
        {
            return;
        }
        DoublyNode<Integer>temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoublyNode<Integer>head = TakeInput();
        head = insert(head,88,3);
        print(head);
    }
}
