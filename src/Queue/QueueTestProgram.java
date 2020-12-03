package Queue;

import java.util.concurrent.ArrayBlockingQueue;

public class QueueTestProgram {

    public static void main(String[] args) {
        ArrayBlockingQueue<Person> lineup;
        lineup = new ArrayBlockingQueue<Person>(10);

        System.out.print("Adding three customers to the line ... ");
        lineup.add(new Person("Bob", 12));
        lineup.add(new Person("Mary", 6));
        lineup.add(new Person("Steve", 10));
        System.out.println("Here is who is in line at the moment:");
        System.out.println(lineup);

        System.out.print("Serving next customer ... ");
        System.out.println(lineup.remove());
        System.out.println("Here is who is in line now:");
        System.out.println(lineup);

        System.out.print("Serving another customer ... ");
        System.out.println(lineup.remove());
        System.out.println("Here is who is in line now:");
        System.out.println(lineup);
        System.out.print("Adding three more customers to the line ... ");
        lineup.add(new Person("Ralph", 16));
        lineup.add(new Person("Jen", 13));
        lineup.add(new Person("Max", 18));
        System.out.println("Here is who is in line now:");
        System.out.println(lineup);

        System.out.print("Serving next customer ... ");
        System.out.println(lineup.remove());
        System.out.println("Here is who is in line now:");
        System.out.println(lineup);

        System.out.print("Adding four customers to the line ... ");
        lineup.add(new Person("Dave", 4));
        lineup.add(new Person("Sam", 17));
        lineup.add(new Person("Lyn", 8));
        lineup.add(new Person("Betty", 9));
        System.out.println("Here is who is in line now:");
        System.out.println(lineup);

        System.out.print("Here is who is at the front of the line ...");
        System.out.println(lineup.peek());

        System.out.print("Serving next customer ... ");
        System.out.println(lineup.remove());

        System.out.println("Here is who remains in the line:");
        System.out.println(lineup);

        System.out.println("Serving all remaining customers ... ");
        while(!lineup.isEmpty()) {
            System.out.print("Serving next customer ... ");
            System.out.println(lineup.remove());
        }
        System.out.println("Here is who remains in the line:");
        System.out.println(lineup);
    }
}
