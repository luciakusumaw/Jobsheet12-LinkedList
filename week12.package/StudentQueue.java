public class StudentQueue {
    AssignmentNode front;
    AssignmentNode rear;
    int size;

    public StudentQueue() {
        front = null;
        rear = null;
        size = 0;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public boolean isFull() {
        return false; 
    }

    public void clear() {
        front = null;
        rear = null;
        size = 0;
        System.out.println("The queue has been cleared.");
    }

    public void enqueue(Student std) {
        AssignmentNode newNode = new AssignmentNode(std, null);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println(std.name + " joined the queue.");
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("The queue is empty!!");
        } else {
            System.out.println("Calling the next student:");
            front.data.print();
            front = front.next;
            if (front == null) {
                rear = null;
            }
            size--;
        }
    }

    public void displayFrontRear() {
        if (isEmpty()) {
            System.out.println("The queue is empty!!");
        } else {
            System.out.println("--- Front Student ---");
            front.data.print();
            System.out.println("--- Rear Student ---");
            rear.data.print();
        }
    }

    public int getTotalStudents() {
        return size;
    }
}