package implementation;

import myinterface.QueueADT;

public class MyQueue<E> implements QueueADT<E> {
    private E[] arr;
    private int front;
    private int rear;
    private int size;

    public MyQueue(E[] arr){
        this.arr = arr;
        front  = 0;
        rear = 0;
        size = 0;
    }

    @Override
    public void enqueue(E element) {
        if(size != arr.length){
            if(rear == arr.length){
                rear = 0;
            }
            arr[rear] = element;
            rear++;
            size++;
        }
        else{
            System.out.println("queue overflow");
        }
    }

    @Override
    public E dequeue() {
        E response = null;
        if(!isEmpty()){
            if(size != arr.length) {
                if (front == arr.length) {
                    front = 0;
                }
            }
            response = arr[front];
            front++;
            size--;
        }
        else{
            System.out.println("queue underflow");
        }

        return response;
    }

    @Override
    public E peek() {
        E response = null;
        if(!isEmpty()){
            response = arr[front];
        }
        return response;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    public void traverse(){
        System.out.println("printing queue");
        System.out.print("front<--");
        if(rear <= front){
            //FRONT TO LENGTH
            for (int i = front ; i < arr.length ; i++) {
                System.out.print(arr[i] + "<--");
            }
            //0 to rear
            for (int i = 0; i < rear; i++) {
                System.out.print(arr[i] + "<--");
            }
        }
        else{
            for (int i = front; i < rear ; i++) {
                System.out.print(arr[i] +" <--");
            }
        }
        System.out.println("rear");
    }
}
