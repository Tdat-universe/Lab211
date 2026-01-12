package model;

public class Student {

    private String name;
    private String className;
    private double math;
    private double physic;
    private double chemistry;

    public Student() {}

    public Student(String name, String className,
                   double math, double physic, double chemistry) {
        this.name = name;
        this.className = className;
        this.math = math;
        this.physic = physic;
        this.chemistry = chemistry;
    }

    public String getName() {
        return name;
    }

    public String getClassName() {
        return className;
    }

    public double getMath() {
        return math;
    }

    public double getPhysic() {
        return physic;
    }

    public double getChemistry() {
        return chemistry;
    }
}
