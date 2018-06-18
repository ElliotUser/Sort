package bubbleSort;

public class BubbleSortApp {
    public static void main(String[] args) {
        int maxSize = 100;
        ArrayBub arrayBub = new ArrayBub(maxSize);

        arrayBub.insert(32);
        arrayBub.insert(2);
        arrayBub.insert(80);
        arrayBub.insert(11);
        arrayBub.insert(25);
        arrayBub.insert(57);
        arrayBub.insert(29);
        arrayBub.insert(78);
        arrayBub.insert(46);
        arrayBub.insert(1);
        arrayBub.insert(93);

        arrayBub.display();

        arrayBub.bubbleSort();

        arrayBub.display();
    }
}
