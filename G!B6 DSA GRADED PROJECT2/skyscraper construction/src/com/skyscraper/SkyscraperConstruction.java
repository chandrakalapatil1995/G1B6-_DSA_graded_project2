package  com.skyscraper;

import java.util.*;

public class SkyscraperConstruction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the total number of floors in the building:");
        int totalFloors = scanner.nextInt();

        PriorityQueue<Integer> assembledFloors = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < totalFloors; i++) {
            System.out.println("Enter the floor size given on day " + (i + 1) + ":");
            int floorSize = scanner.nextInt();

            assembledFloors.offer(floorSize);

            List<Integer> constructed = new ArrayList<>();

            while (!assembledFloors.isEmpty() && assembledFloors.peek() == assembledFloors.size()) {
                constructed.add(assembledFloors.poll());
            }

            if (!constructed.isEmpty()) {
                System.out.print("Day: " + (i + 1) + "\n");
                Collections.sort(constructed, Collections.reverseOrder());
                for (int floor : constructed) {
                    System.out.print(floor + " ");
                }
                System.out.println();
            } else {
                System.out.println("Day: " + (i + 1));
            }
        }
    }
}

