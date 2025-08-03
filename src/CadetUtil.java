public class CadetUtil {
    private Cadet[] cadets = new Cadet[32]; // індексація від 0 до 31

    // Додавання кадета
    public void insert(Cadet cadet) {
        int id = cadet.getId();
        if (id < 0 || id >= cadets.length) {
            System.out.println("ID поза межами допустимого діапазону (0–31)");
            return;
        }
        cadets[id] = cadet;
    }

    // Пошук кадета за ID
    public Cadet search(int id) {
        if (id < 0 || id >= cadets.length) {
            System.out.println("ID поза межами допустимого діапазону (0–31)");
            return null;
        }
        return cadets[id];
    }

    // Видалення кадета за ID
    public void delete(int id) {
        if (id < 0 || id >= cadets.length) {
            System.out.println("ID поза межами допустимого діапазону (0–31)");
            return;
        }
        cadets[id] = null;
    }

    // Виведення всіх кадетів
    public void printAll() {
        for (int i = 0; i < cadets.length; i++) {
            if (cadets[i] != null) {
                cadets[i].printInfo();
            }
        }
    }
}
