public class Student13 {
    String nim, name, className;
    double gpa;

    public Student13() {
    }

    public Student13(String nm, String nama, String kls, double ip) {
        nim = nm;
        name = nama;
        className = kls;
        gpa = ip;
    }

    void print() {
        System.out.println(nim + " - " + name + " - " + className + " - " + gpa);
    }
}