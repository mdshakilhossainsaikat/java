class Queue 
{
    private int[] elements;
    private int size;
    private static final int DEFAULT_CAPACITY = 8;
    public Queue() 
    {
        elements = new int[DEFAULT_CAPACITY];
        size = 0;
    }
    public void enqueue(int v) 
    {
        if (size >= elements.length) 
        {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        elements[size++] = v;
    }
    public int dequeue() 
    {
        if (size == 0) 
        {
            throw new IllegalStateException("Queue is empty");
        }
        int removedElement = elements[0];
        size--;
        for (int i = 0; i < size; i++) 
        {
            elements[i] = elements[i + 1];
        }
        return removedElement;
    }
    public boolean empty() 
    {
        return size == 0;
    }
    public int getSize() 
    {
        return size;
    }
}
public class ass3_4 
{
    public static void main(String[] args) 
    {
        Queue queue = new Queue();
        for (int i = 1; i <= 20; i++) 
        {
            queue.enqueue(i);
        }
        System.out.println("Dequeuing elements from the queue:");
        while (!queue.empty()) 
        {
            System.out.print(queue.dequeue()+" ");
        }
    }
}
