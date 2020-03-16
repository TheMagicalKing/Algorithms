public class Main {

    public static void main(String[] args) {
        SortingAlgorithms sort = new SortingAlgorithms();
        SearchAlgorithms search = new SearchAlgorithms();

        // Tester Sort Algorithms
        sort.heapSort(10);
        sort.bubbleSort(10);

        // Tester Search Algorithms
        search.find(5, 100, 1);
        search.find(5, 10,2 );
        search.findAlle(8,100,2);
        search.findAlle(2,10,1);
        search.findMax(10,2);

    }

}
