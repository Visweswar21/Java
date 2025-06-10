import java.util.Collections;
import java.util.PriorityQueue;

public class heapexample {

    public static void main(String[] args) {
        // Min-Heap (default behavior)
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
        minHeap.add(10);
        minHeap.add(5);
        minHeap.add(15);
        minHeap.add(1);

        System.out.println("Min Heap Output:");
        while (!minHeap.isEmpty()) {
            System.out.println(minHeap.poll());
        }

        // Max-Heap using custom comparator
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.add(20);
        maxHeap.add(5);
        maxHeap.add(15);
        maxHeap.add(10);

        System.out.println("Max Heap Output:");
        while (!maxHeap.isEmpty()) {
            System.out.println(maxHeap.poll());
        }
    }
}
