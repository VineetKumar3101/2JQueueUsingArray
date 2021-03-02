package myinterface;

public interface QueueADT<E> {
    void enqueue(E element);
    E dequeue();
    E peek();
    int size();
    boolean isEmpty();
}
