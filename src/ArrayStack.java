public class ArrayStack implements Stack
{
    int[] arr;
    int top;
    int capacity;
    public ArrayStack(int capacity)
    {
        this.capacity = capacity;
        this.arr = new int[this.capacity];
        top = 0;
    }

    @Override
    public void push(int data) {
        if(top == capacity - 1)
        {
            System.out.println("OV");
            return;
        }
        arr[++top] = data;
    }

    @Override
    public int pop() {
        if(top < 0)
            System.out.println("Underflow");
        else
            return arr[top--];
        return Integer.MIN_VALUE;
    }
}
