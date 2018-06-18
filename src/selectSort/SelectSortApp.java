package selectSort;

public class SelectSortApp {
    public static void main(String[] args) {
        int maxSize = 100;
        ArraySelect arraySelect = new ArraySelect(maxSize);

        arraySelect.insert(23);
        arraySelect.insert(89);
        arraySelect.insert(3);
        arraySelect.insert(11);
        arraySelect.insert(5);
        arraySelect.insert(67);
        arraySelect.insert(90);
        arraySelect.insert(36);
        arraySelect.insert(52);
        arraySelect.insert(44);

        arraySelect.display();

        arraySelect.selectionSort();

        arraySelect.display();
    }
}
