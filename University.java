public class University {
    private String name;
    private String city;
    private int numberOfStudents;

    public University(String name, String city, int numberOfStudents) {
        this.name = name;
        this.city = city;
        this.numberOfStudents = numberOfStudents;
    }

    public String getName() {

        return name;
    }

    public String getCity() {

        return city;
    }

    public int getNumberOfStudents() {

        return numberOfStudents;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    @Override
    public String toString() {
        return "University{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", numberOfStudents=" + numberOfStudents +
                '}';
    }
}
