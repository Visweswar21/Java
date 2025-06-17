import java.util.*;

public class HeaterRadius {
    public static int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(houses);
        Arrays.sort(heaters);

        int radius = 0;
        for (int house : houses) {
            // Use binary search to find the closest heater
            int index = Arrays.binarySearch(heaters, house);
            if (index < 0) {
                index = -index - 1;
            }

            int dist1 = index < heaters.length ? Math.abs(heaters[index] - house) : Integer.MAX_VALUE;
            int dist2 = index > 0 ? Math.abs(heaters[index - 1] - house) : Integer.MAX_VALUE;

            int minDist = Math.min(dist1, dist2);
            radius = Math.max(radius, minDist);
        }

        return radius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] houseStr = sc.nextLine().replaceAll("[\\[\\],]", " ").trim().split("\\s+");
        String[] heaterStr = sc.nextLine().replaceAll("[\\[\\],]", " ").trim().split("\\s+");

        int[] houses = Arrays.stream(houseStr).mapToInt(Integer::parseInt).toArray();
        int[] heaters = Arrays.stream(heaterStr).mapToInt(Integer::parseInt).toArray();

        System.out.println(findRadius(houses, heaters));
    }
}
