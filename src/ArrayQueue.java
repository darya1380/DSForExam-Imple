public class ArrayQueue implements Queue
{
    private int capacity;
    private int[] arr;
    private int front;
    private int rear;
    int size;
    public ArrayQueue(int capacity)
    {
        this.capacity = capacity;
        this.arr = new int[this.capacity];
        front = this.size = 0;
        rear = capacity - 1;
    }
    public boolean isFull()
    {
        return size == capacity;
    }
    public boolean isEmpty()
    {
        return size == 0;
    }
    public void enqueue(int key)
    {
        rear = (rear + 1) % capacity;
        arr[rear] = key;
        size++;
    }
    public int dequeue()
    {
        int item = arr[front];
        front = (front + 1) % capacity;
        size = size - 1;
        return item;
    }

}
