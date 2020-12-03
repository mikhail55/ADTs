package Queue;
import java.util.PriorityQueue;

public class PriorityQueueTestProgram {

    public static void main(String[] args) {
        PriorityQueue<Person> lineup;
        lineup = new PriorityQueue<Person>(10); // at most 10 allowed in line

        System.out.print("Adding 10 customers to the line ... ");
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

        System.out.println("Here is who is in line now:");
        System.out.println(lineup);
        System.out.print("Here is who is at the front of the line ...");
        System.out.println(lineup.peek());

        System.out.println("Serving all customers ... ");
        while(!lineup.isEmpty()) {
            System.out.print("Serving next customer ... ");
            System.out.println(lineup.remove());
        }

        System.out.println("Here is who remains in the line:");
        System.out.println(lineup);
    }
}
