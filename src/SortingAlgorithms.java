import java.util.ArrayList;
import java.util.Collections;

public class SortingAlgorithms {

    //Heap sort


    public void maxHeap(ArrayList<Integer> array, int index, int size) {

        int largest = index; // Root Node
        int left = 2 * index + 1; // Left Child node
        int right = 2 * index + 2; // Right Child node

        if (left < size && array.get(left) > array.get(largest)) {
            largest = left;
        }
        if (right < size && array.get(right) > array.get(largest)) {
            largest = right;
        }

        if (largest != index) {
            Collections.swap(array, index, largest); // Swap the indexes not the values
            maxHeap(array, largest, size);
        }

    }



    public static void main(String[] args) {

        SortingAlgorithms h = new SortingAlgorithms(); // Not edited, but I would recommend static methods for this example

        ArrayList<Integer> array = new ArrayList<Integer>();

        // Arrays are automatically resized, no need to make an empty array, etc.

        array.add(30);
        array.add(10);
        array.add(16);
        array.add(17);
        array.add(19);
        array.add(50);
        array.add(70);
        array.add(86);
        array.add(7);
        array.add(-2);

        int size = array.size();

        // Prerequisites for max heap sorting.

        for(int i = size / 2 - 1; i >= 0; i--) {
            h.maxHeap(array, i, size);
        }

        for(int i = size - 1; i >= 0; i--) {
            Collections.swap(array, i, 0);
            h.maxHeap(array, 0, i);
        }

        System.out.print(array);
        // Output: [-2, 7, 10, 16, 17, 19, 30, 50, 70, 86]
        // Time: 284549 nanoseconds

}
}
