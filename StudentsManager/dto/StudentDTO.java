package dto;

public class StudentDTO {

    private String name;
    private String className;
    private double math;
    private double physic;
    private double chemistry;

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

    public void setName(String name) {
        this.name = name;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public void setMath(double math) {
        this.math = math;
    }

    public void setPhysic(double physic) {
        this.physic = physic;
    }

    public void setChemistry(double chemistry) {
        this.chemistry = chemistry;
    }
}
