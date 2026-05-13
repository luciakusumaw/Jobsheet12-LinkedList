public class SLLMain13 {
    public static void main(String[] args) {
        SingleLinkedList13 sll = new SingleLinkedList13();
        
        Student13 std1 = new Student13("001", "Student 1", "TI-1I", 3.89);
        Student13 std2 = new Student13("002", "Student 2", "TI-1I", 3.45);
        Student13 std3 = new Student13("003", "Student 3", "TI-1I", 3.20);
        Student13 std4 = new Student13("004", "Student 4", "TI-1I", 3.00);

        sll.addFirst(std4);
        sll.addLast(std1);
        sll.insertAfter(std3, "Student 4");
        sll.insertAt(2, std2);

        System.out.println("Data at index 1 is:");
        Student13 data = sll.getData(1);
        data.print();

        int idx = sll.indexOf("Student 1");
        System.out.println("Student 1 is located at index: " + idx);

        sll.removeFirst();
        sll.removeLast();
        sll.print();

        sll.removeAt(0);
        sll.print();
    }
}