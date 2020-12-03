package Queue;

import java.util.PriorityQueue;
import java.util.ArrayList;

public class PriorityQueueTestProgram2 {

    public static void main(String[] args) {
        PriorityQueue<Person> lineup = new PriorityQueue<Person>(10);
        System.out.println("Adding 10 customers to the line ... ");
        lineup.add(new Person("Bob", 12));
        lineup.add(new Person("Mary", 6));
        lineup.add(new Person("Steve", 10));
        lineup.add(new Person("Ralph", 16));
        lineup.add(new Person("Jen", 13));
        lineup.add(new Person("Max", 18));
        lineup.add(new Person("Dave", 4));
        lineup.add(new Person("Sam", 17));
        lineup.add(new Person("Lyn", 8));
        lineup.add(new Person("Betty", 9));

        System.out.println();

        // Set priority to be alphabetically
        Person.SortStrategy = Person.ALPHABETICAL;

        // Since items are sorted when added, we need to re-add every item again:
        ArrayList<Person> items = new ArrayList<Person>(lineup);
        lineup.clear();
        lineup.addAll(items);
        System.out.println("Serving all customers ... ");
        while(!lineup.isEmpty()) {
            System.out.print("Serving next customer ... ");
            System.out.println(lineup.remove());
        }
    }
}