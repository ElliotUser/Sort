package objectSortApp;

public class ObjectSortApp {
    public static void main(String[] args) {
        int maxSize = 100;
        ArrayInOb arr = new ArrayInOb(maxSize);

        arr.insert("Филипов", "Сергей", 21);
        arr.insert("Распод", "Эхмо", 88);
        arr.insert("Сечкин", "Вася", 2);
        arr.insert("Заржавелли", "Гоги", 33);
        arr.insert("Заржавелли", "Ашот", 33);
        arr.insert("Борундуков", "Дейл", 11);
        arr.insert("Крысова", "Галя", 56);
        arr.insert("Яковлев", "Денис", 101);

        System.out.println("Перед сортировкой:");
        arr.display();
        arr.insertionSort();

        System.out.println("После сортировки:");
        arr.display();
    }
}
