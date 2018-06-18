package insertSort;

public class InsertSortApp {
    public static void main(String[] args) {
        int maxSize = 100;
        ArrayInsert arrayInsert = new ArrayInsert(maxSize);

        arrayInsert.insert(78);
        arrayInsert.insert(56);
        arrayInsert.insert(99);
        arrayInsert.insert(81);
        arrayInsert.insert(32);
        arrayInsert.insert(44);
        arrayInsert.insert(11);
        arrayInsert.insert(2);
        arrayInsert.insert(23);
        arrayInsert.insert(7);

        arrayInsert.display();

        arrayInsert.insertionSort();

        arrayInsert.display();

    }
}
