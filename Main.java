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

        schools[1].setName("Akyltai School");
        schools[1].setAddress("Archa-Beshik 23");
        schools[1].setStudent(300);

        schools[2].setName("Seitek School");
        schools[2].setAddress("Jal 789");
        schools[2].setStudent(400);

        Car[] cars = {
                new Car("Toyota", "AAAA", 2020, 37000),
                new Car("Honda", "BBBB", 2019, 12000),
                new Car("Mercedes", "CCC", 2018, 97000)
        };
        cars[0].setMake("Toyota");
        cars[0].setModel("AAAA");
        cars[0].setYear(2020);
        cars[0].setPrice(37000);

        cars[1].setMake("Honda");
        cars[1].setModel("BBBB");
        cars[1].setYear(2019);
        cars[1].setPrice(12000);

        cars[2].setMake("Mercedes");
        cars[2].setModel("CCC");
        cars[2].setYear(2018);
        cars[2].setPrice(97000);


        Person[] persons = {
                new Person("Zalkar", 25, "Male"),
                new Person("Tunuk", 30, "Female"),
                new Person("Nurles", 22, "Male")
        };
        persons[0].setName("Zalkar");
        persons[0].setAge(25);
        persons[0].setGender("Male");

        persons[1].setName("Tunuk");
        persons[1].setAge(30);
        persons[1].setGender("Female");

        persons[2].setName("Nurles");
        persons[2].setAge(25);
        persons[2].setGender("Male");

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

        System.out.println("\nPerson объекттери :");
        for (Person person : persons) {
            System.out.println(person.getName() + " - " + person.getAge() + " - " + person.getGender());
        }
    }
}
