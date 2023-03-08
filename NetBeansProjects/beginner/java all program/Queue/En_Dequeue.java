package Queue;

public class En_Dequeue {

    //private static int x;
    int front = -1, rear = -1;
    int n = 4;
    int ar[] = new int[n];

    public static void main(String[] args) {

        En_Dequeue ed = new En_Dequeue();
        ed.enqueue(10);
        ed.enqueue(20);
        ed.enqueue(30);
        ed.display();
    }

    public void enqueue(int data) {
        if (rear == n - 1) {
            System.out.println("Overflow");
        } else if (front == -1 && rear == -1) {
            front = rear = 0;

            ar[rear] = data;
        } else {
            rear++;

            ar[rear] = data;
        }

    }

    void display() {
        int i;
        if (front == -1 && rear == -1) {
            System.out.println("Queue is Empty");
        } else {
            for (i = front; i <= rear; i++) {
                System.out.println(ar[i] + "");
            }
        }
    }

}

/////////////////////////////////
// Java program to remove elements
// from a Queue

