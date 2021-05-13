public class LinkedListQueue implements Queue
{
    private class Node
    {
        int data;
        Node next;
        public Node(int data)
        {
            this.data = data;
        }
    }
    private Node front, rear;
    public void enqueue(int key)
    {
        Node tmp = new Node(key);
        if(rear == null)
        {
            rear = tmp;
            front = tmp;
        }
        else
        {
            rear.next = tmp;
            rear = tmp;
        }
    }
    public int dequeue()
    {
        if(front == null)
            return Integer.MAX_VALUE;
        Node tmp = front;
        int item = tmp.data;
        this.front = this.front.next;
        if(this.front == null)
            this.rear = null;
        return item;
    }
}
