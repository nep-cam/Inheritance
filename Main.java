public class Main {
    public static void main(String[] args) {
        Person man = new Person("Cam", "HN", 20);
        Student student = new Student("Cam", "VP", 20,18365, 8.3, 9.1, 6.7);
        System.out.println(man.toString());
        System.out.println(student.toString());
    }
}