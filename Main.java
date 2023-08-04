public class Main {
    public static void main(String[] args) {
        University[] universities = {
                new University("AUCA University", "Naryn", 10000),
                new University("Ala-Too University", "Bishkek", 8000),
                new University("MUK University", "Osh", 12000)
        };
        universities[0].setName("AUCA");
        universities[0].setCity("Naryn");
        universities[0].setNumberOfStudents(10000);

        universities[1].setName("Ala-Too University");
        universities[1].setCity("Bishkek");
        universities[1].setNumberOfStudents(8000);

        universities[2].setName("MUK University");
        universities[2].setCity("Osh");
        universities[2].setNumberOfStudents(12000);

        School[] schools = {
                new School("Stem School", "Tungunchv56", 500),
                new School("Akyltai School", "Archa-Beshik 23", 300),
                new School("Seitek School", "Jal 789", 400)
        };
        schools[0].setName("Stem School");
        schools[0].setAddress("Tungunchv56");
        schools[0].setStudent(500);

        schools[0].setName("Akyltai School");
        schools[0].setAddress("Archa-Beshik 23");
        schools[0].setStudent(300);

        schools[0].setName("Seitek School");
        schools[0].setAddress("Jal 789");
        schools[0].setStudent(400);

        Car[] cars = {
                new Car("Toyota", "AAAA", 2020, 37000),
                new Car("Honda", "BBBB", 2019, 12000),
                new Car("Mercedes", "CCC", 2018, 97000)
        };
        cars[0].setMake("Toyota");
        cars[0].setModel("AAAA");
        cars[0].setYear(2020);
        cars[0].setPrice(37000);

        cars[0].setMake("Honda");
        cars[0].setModel("BBBB");
        cars[0].setYear(2019);
        cars[0].setPrice(12000);

        cars[0].setMake("Mercedes");
        cars[0].setModel("CCC");
        cars[0].setYear(2018);
        cars[0].setPrice(97000);


        Person[] persons = {
                new Person("Zalkar", 25, "Male"),
                new Person("Tunuk", 30, "Female"),
                new Person("Nurles", 22, "Male")
        };
        persons[0].setName("Zalkar");
        persons[0].setAge(25);
        persons[0].setGender("Male");

        persons[0].setName("Tunuk");
        persons[0].setAge(30);
        persons[0].setGender("Female");

        persons[0].setName("Nurles");
        persons[0].setAge(25);
        persons[0].setGender("Male");

        System.out.println("\nUniversity объекттери:");
        for (University university : universities) {
            System.out.println(university.getName() + " - " + university.getCity() + " - " + university.getNumberOfStudents());
        }

        System.out.println("\nSchool объекттери:");
        for (School school : schools) {
            System.out.println(school.getName() + " - " + school.getAddress() + " - " + school.getStudent());
        }

        System.out.println("\nCar объекттери:");
        for (Car car : cars) {
            System.out.println(car.getMake() + " " + car.getModel() + " - " + car.getYear() + " - " + car.getPrice());
        }

        System.out.println("\nPerson объекттери :");
        for (Person person : persons) {
            System.out.println(person.getName() + " - " + person.getAge() + " - " + person.getGender());
        }

        schools[0].setAddress("Tungunchv56");
        cars[0].setYear(37000);
        persons[0].setAge(25);

        System.out.println("\nPerson объекттери :");
        for (Person person : persons) {
            System.out.println(person.getName() + " - " + person.getAge() + " - " + person.getGender());
        }
    }
}
