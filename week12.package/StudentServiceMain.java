import java.util.Scanner;

public class StudentServiceMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentQueue serviceQueue = new StudentQueue ();
        int choice;

        do {
            System.out.println("\n=== Student Service System ===");
            System.out.println("1. Student Join Queue (Register)");
            System.out.println("2. Call Next Student (Process)");
            System.out.println("3. Show Front and Rear Student");
            System.out.println("4. Show Total Students in Queue");
            System.out.println("5. Check If Empty/Full");
            System.out.println("6. Clear Queue");
            System.out.println("0. Exit");
            System.out.print("Select Menu: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("NIM: "); String nim = sc.nextLine();
                    System.out.print("Name: "); String name = sc.nextLine();
                    System.out.print("Class: "); String cls = sc.nextLine();
                    System.out.print("GPA: "); double gpa = sc.nextDouble();
                    serviceQueue.enqueue(new Student (nim, name, cls, gpa));
                    break;
                case 2:
                    serviceQueue.dequeue();
                    break;
                case 3:
                    serviceQueue.displayFrontRear();
                    break;
                case 4:
                    System.out.println("Current queue size: " + serviceQueue.getTotalStudents());
                    break;
                case 5:
                    System.out.println("Is Empty: " + serviceQueue.isEmpty());
                    System.out.println("Is Full : " + serviceQueue.isFull());
                    break;
                case 6:
                    serviceQueue.clear();
                    break;
                case 0:
                    System.out.println("Thank you for using the system.");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 0);
    }
}