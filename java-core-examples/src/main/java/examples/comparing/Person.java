package examples.comparing;

public class Person implements Comparable<Person> {
    public String name;
    public int year;

    public Person(String name, int year) {
        this.name = name;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Person{" + " name='" + name + '\'' + ", year=" + year + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public int compareTo(Person person) {
        int i = this.name.compareTo(person.name);
        if (i == 0) {
            i = this.year - person.year;
        }
        return i;
    }
}
