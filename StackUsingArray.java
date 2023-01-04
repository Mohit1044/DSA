public class StackUsingArray {
 private int data[];
 private int topIndex;//index of the topmost element of the stack
 StackUsingArray(int size)
 {
     data = new int[size];
     topIndex =-1;
 }

 public int top() throws StackEmptyException
 {
	 if(topIndex == -1)
	 {
		 throw new StackEmptyException();
	 }
   return data[topIndex];
 }
 public int size()
 {
   return topIndex+1;
 }
 public void push(int elem)throws StackFullException
 {
	 //if stack if full
	 if(topIndex == data.length-1)
	 {
		 throw new StackFullException();
		 //throw exception
	 }
    data[++topIndex]=elem;
 }
 public boolean isEmpty()
 {
     if(topIndex == -1)
     {
         return true;
     }
     else
     {
         return false;
     }

 }
 public int pop()throws StackEmptyException
 {
   if(topIndex == -1)
   {
	   throw new StackEmptyException();
   }
   int temp = data[topIndex];
   topIndex--;
   return temp;
 }
}
