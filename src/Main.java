public class Main {
    public static void main(String[] args) {
        CadetUtil util = new CadetUtil();

        // Додам кадетів
        util.insert(new Cadet(5, "Жадан Олександр", 20));
        util.insert(new Cadet(12, "Савченко Ігор", 22));
        util.insert(new Cadet(30, "Іваненко Ілля", 19));

        // Пошук
        Cadet found = util.search(12);
        if (found != null) {
            System.out.println("Знайдено:");
            found.printInfo();
        }

        // Видалення
        util.delete(12);

        // Виведення всіх
        System.out.println("\nУсі кадети:");
        util.printAll();
    }
}