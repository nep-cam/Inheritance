public class Student extends Person {
    private int MSSV;
    private double math;
    private double physic;
    private double chemistry;
    private double average;

    public Student() {

    }

    public Student(String name, String address, int age, int MSSV, double math, double physic, double chemistry) {
        super(name, address, age);
        this.math = math;
        this.physic = physic;
        this.chemistry = chemistry;
        this.average = (physic + math + chemistry) / 3;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, MSSV: %d, Avg: %.2f", super.getName(), MSSV, average);
    }
}
