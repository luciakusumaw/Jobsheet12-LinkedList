import java.util.Scanner;

public class SLLMain13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList13 sll = new SingleLinkedList13();
        System.out.print("Input the number of students to add: ");
        int total = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < total; i++) {
            System.out.println("--- Input Student " + (i + 1) + " ---");
            System.out.print("NIM           : ");
            String nim = sc.nextLine();
            System.out.print("Name          : ");
            String name = sc.nextLine();
            System.out.print("Class Name    : ");
            String className = sc.nextLine();
            System.out.print("GPA           : ");
            double gpa = sc.nextDouble();
            sc.nextLine(); 

           
            Student13 std = new Student13(nim, name, className, gpa);
            
            sll.addLast(std);
        }

        System.out.println("\nFinal Data in Linked List:");
        sll.print();
    }
}