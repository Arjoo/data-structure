public class User {
    private int deptId;
    private String name;
    private int salary;

    public User(int deptId, String name, int salary) {
        this.deptId = deptId;
        this.name = name;
        this.salary = salary;
    }

    public int getDeptId() {
        return deptId;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
}