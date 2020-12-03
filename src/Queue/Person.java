package Queue;

public class Person implements Comparable<Person>{

    public static final byte ALPHABETICAL = 0;
    public static final byte INCREASING_AGE = 1;
    public static final byte DECREASING_AGE = 2;

    public static byte SortStrategy = INCREASING_AGE;

    protected String name;
    protected int age;

    public Person(String n, int a) {
        name = n;
        age = a;
    }


    @Override
    public int compareTo(Person p) {
        switch(SortStrategy) {
            case ALPHABETICAL: return name.compareTo(p.name);
            case INCREASING_AGE: return age - p.age;
            case DECREASING_AGE: return p.age - age;
        }
        return 0;
    }

    public int getAge() { return age; }
    public String getName() { return name; }
    public String toString() {
        return age + " year old " + name;
    }
}
