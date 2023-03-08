package Queue;
import java.util.Scanner;
public class En_De {
    
    int queue[] = new int[5];
    int size,front,rear;
  
    
     public static void main(String[] args) {
        En_De q = new En_De();
        Scanner s = new Scanner(System.in);
         System.out.println("Enter Array:");
         int queue[] = new int[5];
         for (int i = 0; i < 5; i++) {
            queue[i] = s.nextInt();
        }
          System.out.print("Array are:");
        for (int i = 0; i < 5; i++) {
            System.out.print(" "+ queue[i]);
        }
        //Added element
        q.enqueue(5);
//        q.enqueue(10);
//        q.enqueue(15);
//        q.enqueue(20);
//        q.enqueue(25);
//        
//        //Deleted element
//        q.dequeue();
//        q.dequeue();
        
        q.show();
    }

    public void enqueue(int data) {
        queue[rear] = data;
        rear = rear + 1;
        size = size + 1;
    }

    public int dequeue() {
        int data = queue[front];
        front = front + 1;
        size = size - 1;
        
        return data;
    }

    public void show() {
        System.out.println("Total added Elements: ");
        for (int n : queue) {
            System.out.print(n + " ");
        }
        System.out.println("");
        System.out.println("After deleted element: ");
        for (int i = 0; i < size; i++) {
            System.out.println(queue[i] + "");
        }
    }

   
}
