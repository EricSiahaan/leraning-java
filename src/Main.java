public class Main {
    public static void main(String[] args) {
        // Mmebuat Object Person
        Person person = new Person("budi", 28);

        // Memanggl Metode printInfo() di dalam class
        person.printInfo();

        // mengubah nama object Person mengunakan setter
        person.setName("joko");
        person.setAge(35);

        person.printInfo();
    }
}
