package lesson5;

class Employee extends Person {

    private String company;

    public Employee(String name, int age, String company) {
        super(name, age);
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String work() {
        return "Manager";
    }

    @Override
    public String toString() {
        return String.format("(%s, %d, %s)", getName(), getAge(), company);
    }
}

class Person {

    private int age;
    private String name;

    public Person(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String work() {
        return "None";
    }

    @Override
    public String toString() {
        return String.format("(%s, %d)", name, age);
    }
}
