// public class Person {
//     // mempunyai variable name => jadi object kita akan memiliki attribut name
//     // Integer nilaiPertama;
//     String name;
//     String addres;

//     final String country = "Indonesia";

//     // craete method - function
//     // void sayGoodBay(Integer nilaiKedua, Integer nilaiKetiga) {
//     // System.out.println(nilaiPertama + nilaiKedua + nilaiKetiga);
//     // }

//     // void sayHello(String paramName) {
//     // System.out.println("Hello " + paramName + "My Name is" + name);
//     // }

//     // membuat Constructor

//     // Person(String paramName, String paramAdress) {
//     // // untuk name dan address yang telah di deklarasikan di atas untuk valuenya
//     // di
//     // // buat dari parametger yang ada di constructor
//     // name = paramName;
//     // addres = paramAdress;
//     // }

//     // --------------------------29 07 2023----------------------------------//
//     // contructor Overloading

//     // Person(String paramName) {
//     // // untuk name dan address yang telah di deklarasikan di atas untuk valuenya
//     // di
//     // // buat dari parametger yang ada di constructor
//     // name = paramName;

//     // }

//     // Person() {

//     // }

//     // // Memamnggil constructor lain
//     // Person (String paramName, String paramAdress) {

//     // name = paramName;
//     // addres = paramAdress
//     // }

//     // Person(String name, String address) {
//     // this.name = name;
//     // this.addres = address;
//     // }

//     Person(String name, String adress) {
//         this.name = name;
//         this.addres = adress;

//     }

// }

public class Person {

    // Variable class
    String name;
    int age;

    // Konstruktor
    Person(String name, int age) {
        // Menggunakan "this" untuk merujuk pada variable class
        this.name = name;
        this.age = age;
    }

    // method untuk mencetak informasi tentang object person

    public void printInfo() {
        System.out.println("Nama: " + this.name);
        System.out.println("Usia: " + this.age + " tahun");
    }

    // method untuk mengubah nama object person
    public void setName(String name) {
        // Menggunakan "this" untuk merujuk pada variable class
        this.name = name;
    }

    // method untuk mengubah usia Object Person
    public void setAge(int age) {
        // Menggunakan "this" untuk merujuk pada variable class
        this.age = age;
    }

}
