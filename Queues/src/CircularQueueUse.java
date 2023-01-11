public class CircularQueueUse {
    public static void main(String[] args) {
        CircularQueueUsingArray CircularQueue = new CircularQueueUsingArray();
        int arr[] = {10,20,30,40,50};
        for(int elem:arr)
        {
            try {
                CircularQueue.enqueue(elem);
            }
            catch (QueueFullException e)
            {

            }
        }
        while (!CircularQueue.isEmpty())
        {
            try{
                System.out.println(CircularQueue.dequeue());
            }
            catch (QueueEmptyException e)
            {

            }
        }
    }
}
