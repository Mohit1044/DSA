public class DoublyNode<T> {
    T data;
    DoublyNode<T>next;
    DoublyNode<T> prev;
    DoublyNode (T data)
    {
        this.data = data;
        next = null;
        prev = null;
    }
}
