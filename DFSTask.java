import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashSet;

public class DFSTask {
    private Map<String, List<String>> homemap = new HashMap<>();
    private Set<String> visited = new HashSet<>();

    // Method to add connections between rooms
    public void assRoom(String room, String connectedRoom) {
        homemap.computeIfAbsent(room, k -> new ArrayList<>()).add(connectedRoom);
        homemap.computeIfAbsent(connectedRoom, k -> new ArrayList<>()).add(room); // Bidirectional
    }

    // DFS traversal
    public void dfs(String currentRoom) {
        if (visited.contains(currentRoom)) {
            return;
        }

        System.out.println("Visiting: " + currentRoom);
        visited.add(currentRoom);

        List<String> neighbors = homemap.getOrDefault(currentRoom, new ArrayList<>());
        for (String neighbor : neighbors) {
            dfs(neighbor);
        }
    }

    public static void main(String[] args) {
        DFSTask house = new DFSTask();

        // Add connections between rooms
        house.assRoom("Hall", "Kitchen");
        house.assRoom("Kitchen", "Bedroom");
        house.assRoom("Bedroom", "Bathroom");
        house.assRoom("Hall", "Garage");

        // Start DFS from 'Hall'
        house.dfs("Hall");
    }
}
