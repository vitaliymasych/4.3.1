public class Cadet {
    private int id;
    private String name;
    private int age;

    public Cadet(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void printInfo() {
        System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
    }
}
