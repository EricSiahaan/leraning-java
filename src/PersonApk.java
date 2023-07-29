import java.net.SocketTimeoutException;

import javax.sound.midi.Soundbank;

public class PersonApk {

    public static void main(String[] args) {

        // create object
        // var person = new Person();
        // Person person2 = new Person();
        // Person person3;
        // person3 = new Person();

        // System.out.println(person);
        // System.out.println(person2);
        // System.out.println(person3);

        // person.name = " Eric";
        // System.out.println(person.name);

        // person.address = "Jakarta";
        // System.out.println(person.address);

        // Manipulasi Field
        // var person = new Person();
        // person.name = "Eric";
        // System.out.println(person.name);
        // person.address = "Bekasi";
        // person.name = "Budi";

        // System.out.println(person.name);
        // System.out.println(person.address);
        // System.out.println(person.country);

        // Called Method
        // var person = new Person();
        // person.name = "Hamzah";
        // person.sayGoodBay("Eric");

        // Type data Integer
        // var person = new Person();
        // person.nilaiPertama = 60;
        // person.sayGoodBay(50, 60);

        // memanggil constructor

        // var person = new Person("Eric", "jakarta");
        // System.out.println(person.name);
        // System.out.println(person.addres);
        // person.sayHello("Budi");

        // var person1 = new Person("Eric", "Jakarta");
        // System.out.println(person1.name);
        // System.out.println(person1.addres);
        // System.out.println(person1.country);

        // var person2 = new Person("joko");
        // System.out.println(person2.name);

        // Person person3;
        // person3 = new Person();
        // person3.name = "eric";
        // person3.sayHello("joko");

        // Variable Shadowing

        var person = new Person("hansdeka", "jakarta");

        System.out.println(person.name);
        System.out.println(person.addres);
        System.out.println(person.country);

        Person person2 = new Person("Joko");

        Person person3;
        person3 = new Person();
        person3.name = "Eric";
        person3.sayHello("joko");

    }
}
