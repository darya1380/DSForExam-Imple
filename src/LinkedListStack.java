public class LinkedListStack implements Stack
{
    Node first;
    private class Node
    {
        int data;
        Node next;
        public Node(int data)
        {
            this.data = data;
        }
    }

    @Override
    public void push(int data) {
        Node nd = new Node(data);
        if(first == null)
            first = nd;
        else
        {
            nd.next = first;
            first = nd;
        }
    }

    @Override
    public int pop() {
        int d = first.data;
        first = first.next;
        return d;
    }
}
