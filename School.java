public class School {
    private String name;
    private String address;
    private int student;

    public School(String name, String address, int student) {
        this.name = name;
        this.address = address;
        this.student = student;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getStudent() {
        return student;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setStudent(int capacity) {
        this.student = capacity;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", capacity=" + student +
                '}';
    }
}
