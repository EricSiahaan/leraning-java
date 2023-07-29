import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;
import javax.swing.plaf.synth.SynthEditorPaneUI;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello world");

        /*
         * // Tipe Data
         * 1. Tipe Data Number :
         * -byte : min => -128 max => 128 => 1 byte
         * -short : min => -32786 max=> 32767 => 2 bytes
         * -int : min => -2 miliar max 2 miliar => 4 byte
         * -long : min -9 triliun max 9 triliun => 8 byte
         * 
         */

        // byte iniByte = 100;
        // short iniShort = 1000;
        // int iniInt = 100000000;
        // long inilong = 1000000000;

        // System.out.println(iniByte);
        // System.out.println(iniShort);
        // System.out.println(iniInt);
        // System.out.println(inilong);

        /*
         * Floating Number:
         * - float :
         * - double :
         */

        // float iniFloat = 10.10F;
        // double iniDouble = 10.10;

        // System.out.println(iniFloat);
        // System.out.println(iniDouble);

        /*
         * Literal Number
         * int decimalInt = 25 ;
         * in
         */

        // int decimalInt = 25;
        // int hexaDecimal = 0Xfffff;
        // int binaryDecimal = 0b10101010;

        // Kode Underscore
        // long balance = 1_000_000_000;
        // long balance2 = 1000000000;

        // System.out.println(balance);
        // System.out.println(balance2);

        /*
         * Konversi Tipe Data Number
         * Widening Castng (otomatis) => byte => short => int => long => float =>double
         * Narrow Casting (manual) => double => float => long => int =>char =>short
         * 
         */

        // byte iniByte = 10;
        // short IniShort = iniByte;
        // short iniInt = IniShort;

        // System.out.println(iniByte);
        // System.out.println(IniShort);
        // System.out.println(iniInt);

        // number Overflow = size pada tipe data tidak bisa mecakup value yang diberikan

        // 2. Tipe Data Char => Tipe Data karakter

        // => kata kunci char

        // char m = 'm';
        // char o = 'o';

        // System.out.println(m);
        // System.out.println(o);

        // Tipe data Boolean :
        // True or false
        // boolean a = true;
        // boolean b = false;

        // System.out.println(a);
        // System.out.println(b);

        /*
         * Tipe Data String => Berisikan Data kumpulan karakter atau sederhananya teks
         */

        // String firstName = "Eric Jakarta";
        // String lastName = "Utomo";

        // String fullName = firstName + " " + lastName;

        // System.out.println(firstName);
        // System.out.println(lastName);
        // System.out.println(fullName);

        // => Variable : Tempat untuk Menyimpan data
        // - Static Type : Ssebuah variabel hanya bisa digunakan untuk menyimpan
        // data yang sama

        // String name = "Eric";

        // String name1;
        // name1 = "Jaka";

        // name1 = "Budi";

        // System.out.println(name);
        // System.out.println(name1);

        // Mengganti value variable harus dengan data yang sama

        /*
         * Kata kunci Var
         */

        // var firstName = "eric";
        // var midleName = "Utomo";
        // var lastName = "anhugrah";

        // System.out.println(firstName);
        // System.out.println(midleName);
        // System.out.println(lastName);

        // Final => secara default variable bisa di buah ubah, tapi dengan
        // menambahkan kata final => tidak bisa lagi di ubah

        // final String name = "Eric";
        // name = "Jaka";

        // System.out.println(name);

        /*
         * Tipe Data array : tipe data dengan value nilai yang sama
         * [1,2,3,4,5,6,7,8,9]
         */

        // Integer[] IntegerArray;
        // IntegerArray = new Integer[5];

        // IntegerArray[0] = 1; => index ke 0
        // IntegerArray[1] = 2; => index ke 1
        // IntegerArray[2] = 3; => index ke 2
        // IntegerArray[2] = 4; => index ke 3
        // IntegerArray[2] = 5; => index ke 4

        // System.out.println(IntegerArray[0]);

        // Membuat Array di dalam array :
        // String[][] fauna = {
        // { "cat", "lion" },
        // { "dog", "monkey" },
        // { "elephant", "crocodile" }
        // };

        // System.out.println(fauna[0][1]);
        // System.out.println(fauna[1][1]);
        // System.out.println(fauna[2][0]);

        // int d = 100;
        // System.out.println(d);

        // d += 10;
        // System.out.println(d);

        // d++;
        // System.out.println(d);

        /*
         * Operasi Matematika => Semua bahasa pemograman terdapat operasi matematika ( +
         * , - , * , / , %)
         * 
         * //
         */

        // int angkaPertama = 9999989;
        // int angkaKedua = 7573;
        // int HasilAhkirTambah = angkaPertama + angkaKedua;
        // int HasilAhkirKurang = angkaPertama - angkaKedua;
        // int HasilAhkirBagi = angkaPertama / angkaKedua;
        // int HasilAhkirKali = angkaPertama * angkaKedua;
        // int HasilAhkirModulo = angkaPertama % angkaKedua;

        // System.out.println(HasilAhkirTambah);
        // System.out.println(HasilAhkirKurang);
        // System.out.println(HasilAhkirBagi);
        // System.out.println(HasilAhkirKali);
        // System.out.println(HasilAhkirModulo);

        /*
         * Augmented Asssigment => teknik dalam pemrograman di mana nilai suatu variabel
         * diubah menggunakan operator matematika atau operator bitwise
         * bersamaan dengan memberikan nilai yang baru.
         * Ini adalah singkatan dari operasi penugasan yang
         * ditingkatkan.
         */

        // int d = 100;
        // d += 10;
        // d -= 10;

        // System.out.println(d);

        /*
         * Unary Operator => Jenis Oprator dalam pemograman yang bekerja pada satu
         * operan saja,
         * nilai atau variabel yang akan di operasikan oleh operator.
         */

        // int d = 100;
        // System.out.println(d);

        // d++;
        // System.out.println(d);

        // d--;
        // System.out.println(d);

        /*
         * Operasi Perbandingan => operasi untuk membandingkan dua buah data
         * menghasilkan nilai boolean (benar atau sala) => true or false
         * jika hasil operasinya adalah benar maka nilainya adalah true
         * jika hasil operasinya adalah salah maka nilainya adalah false
         * >, < , >=, <=
         */

        // int a = 10;
        // int b = 9;

        // boolean lebihBesar = a > b;
        // System.out.println("Apakah a lebih besar dari b ?" + " " + lebihBesar);

        // boolean lebihKecil = a < b;
        // System.out.println("Apakah a lebih kecil dari b ?" + " " + lebihKecil);

        // boolean samaDengan = a == b;
        // System.out.println("Apakah a lebih kecil dari b ?" + " " + samaDengan);

        // boolean tidakSamaDengan = a != b;
        // System.out.println("Apakah a tidak sama dengan b ?" + " " + tidakSamaDengan);

        // boolean lebihKecilAtauSamaDengan = a <= b;
        // System.out.println("Apakah a lebih kecil atau sama dengan ?" + " " +
        // lebihKecilAtauSamaDengan);

        /*
         * Operasi Boolean => Diperuntukan nilai atau tipe data yang bentuknya boolean
         * &&, ||, !(kebalikan)
         */

        // var absen = 60;
        // var nilaiAhir = 80;
        // var ujikom = 60;

        // boolean lulusAbsen = absen >= 75;
        // boolean lulusNilaiahkir = nilaiAhir >= 75;
        // boolean lulusUjikom = ujikom >= 75;

        // var lulus = lulusAbsen && lulusNilaiahkir && lulusUjikom;
        // System.out.println(lulus);

        /*
         * Expression => Konstruksi dari variable, operator dan pemanggilan method,
         * sebuah single value,
         * contoh : int Value = 100;
         * 
         * Statement: Kalimat lengkap dalam bahasa pemograman, kumpulan ekspresi :
         * - Assigment expression : double aValue = 8933.342
         * - pengunaan ++ dan -- : var aValue ++
         * - Method invocation : System.out.println(value = 100)
         * - Object & Expression : Date date = new Date () // Pembuatan object baru
         * 
         * 
         * Block : kumpulan statement yang terdiri dari nol atau lebih staement ({})
         */

        /*
         * If Statement : Salah satu kunci yang digunakan untuk percabangan, kita bisa
         * mengeksekusi kode program tertentu ketika
         * suatu kodisi terpenuhi
         */

        // var nilai = 80;
        // var absen = 90;

        // if (nilai >= 75 && absen >= 75) {
        // System.out.println("Anda lulus");
        // }

        /*
         * Else Statement => Blok if akan di eksekusi ketika kondisi if bernilai true
         * ketika ingin melakukan eksekusi program tertentu jika kondisi if tidak
         * terpenuhi bernilai false
         */

        // var nilai = 80;

        // if (nilai >= 75) {
        // System.out.println("Anda lulus");
        // } else {
        // System.out.println("Maaf anda belum lulus");
        // }

        /*
         * Else if Statement => Dalam if kita butuh membuat beberapa kondisi atau bisa
         * lebih dari 1 kondisi
         */

        // var nilai = 80;
        // var absen = 79;

        // if (nilai >= 75 && absen >= 80) {
        // System.out.println("Anda lulus");
        // } else if (nilai >= 65 && absen >= 80) {
        // System.out.println("Maaf Nilai anda belum lulus tapi absen anda lulus");
        // } else if (nilai >= 55 && absen >= 80) {
        // System.out.println("Maaf Nilai anda belum lulus tapi absen anda lulus");
        // } else {
        // System.out.println("Anda tidak lulus");
        // }

        // Buat sebuah program yang memnerima input dari pengguna berupa usia dan
        // menampilkan keterangannya :
        // => (0-5 Tahun) : Balita
        // => (6-12 Tahun) : Anak- anak
        // => (13-17 Tahun) : Remaja
        // => >17 Tahun : dewasa

        /*
         * Swict Statement => ini lebih sederhana dari if statement
         * kondisinya hanya untuk perbandingan
         */

        // var nilai = "C";

        // switch (nilai) {
        // case "A":
        // System.out.println("Anda lulus dengan baik");
        // break;
        // case "B":
        // System.out.println("Anda lulus dengan cukup");
        // break;
        // case "C":
        // case "D":
        // System.out.println("Anda tidak lulus");
        // break;
        // default:
        // System.out.println("Anda Belum Beruntung");
        // }

        // Soal :
        /*
         * Buatlah program yang menerima masukan berupa angka bulan (1-12) dan mencetak
         * nama bulan tersebut.
         * Jika angka yang dimasukkan tidak berada dalam rentang 1-12, cetak
         * "Bulan tidak valid".
         */

        // Soal :
        /*
         * Buatlah program untuk menentukan zodiak berdasarkan tanggal lahir
         * dengan ketentuan sebagai berikut:
         * 
         * 21 Maret - 19 April: Aries
         * 20 April - 20 Mei: Taurus
         * 21 Mei - 20 Juni: Gemini
         * 21 Juni - 22 Juli: Cancer
         * 23 Juli - 22 Agustus: Leo
         * 23 Agustus - 22 September: Virgo
         * 23 September - 22 Oktober: Libra
         * 23 Oktober - 21 November: Scorpio
         * 22 November - 21 Desember: Sagitarius
         * 22 Desember - 19 Januari: Capricorn
         * 20 Januari - 18 Februari: Aquarius
         * 19 Februari - 20 Maret: Pisces
         */

        // Scanner scanner = new Scanner(System.in); // untuk membaca inputan dari user
        // melauli terminal
        // System.out.print("Masukkan tanggal lahir (contoh: 25): "); // cetakannya
        // untuk meminta memasukan tanggal lahir
        // int day = scanner.nextInt();

        // System.out.print("Masukkan bulan lahir (contoh: 7): "); // cetakannya untuk
        // meminta memasukan bulan
        // int month = scanner.nextInt();

        // String zodiac = calculateZodiac(day, month);
        // System.out.println("Zodiak Anda: " + zodiac); // memanggil fungsi
        // }

        // public static String calculateZodiac(int day, int month) {
        // if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) {
        // return "Aries";
        // } else if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) {
        // return "Taurus";
        // } else if ((month == 5 && day >= 21) || (month == 6 && day <= 20)) {
        // return "Gemini";
        // } else if ((month == 6 && day >= 21) || (month == 7 && day <= 22)) {
        // return "Cancer";
        // } else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
        // return "Leo";
        // } else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
        // return "Virgo";
        // } else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
        // return "Libra";
        // } else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) {
        // return "Scorpio";
        // } else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) {
        // return "Sagitarius";
        // } else if ((month == 12 && day >= 22) || (month == 1 && day <= 19)) {
        // return "Capricorn";
        // } else if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) {
        // return "Aquarius";
        // } else {
        // return "Pisces";
        // }

        /*
         * Berikut adalah beberapa istilah generasi berdasarkan tahun kelahirannya:
         * 
         * Baby boomer, kelahiran 1944 s.d 1964
         * Generasi X, kelahiran 1965 s.d 1979
         * Generasi Y (Millenials), kelahiran 1980 s.d 1994
         * Generasi Z, kelahiran 1995 s.d 2015
         * Buat program dimana user diminta untuk menuliskan nama dan tahun
         * kelahirannya, kemudian cetak nama dan generasinya
         */

        /*
         * Minta user untuk memberikan namanya. Kemudian minta lagi ia
         * untuk memasukkan jenis kelaminnya (pria,wanita). Jika ia memilih pria,
         * cetak tulisan halo bro diikuti dengan namanya, jika ia memilih wanita,
         * cetak tulisan halo sis diikuti dengan namanya,.
         * 
         * Masukkan nama anda: Tony Chopper
         * Anda pria/wanita?: pria
         * Halo bro Tony Chopper
         */

        // Scanner scanner = new Scanner(System.in);

        // System.out.print("Masukkan nama Anda: ");
        // String nama = scanner.nextLine();

        // System.out.print("Tahun kelahiran Anda: ");
        // int tahunKelahiran = scanner.nextInt();

        // String generasi = getGenerasi(tahunKelahiran);

        // System.out.println("Nama: " + nama);
        // System.out.println("Generasi: " + generasi);

        // System.out.print("Anda pria/wanita? (pria/wanita): ");
        // String jenisKelamin = scanner.next();

        // if (jenisKelamin.equalsIgnoreCase("pria")) {
        // System.out.println("Halo bro " + nama);
        // } else if (jenisKelamin.equalsIgnoreCase("wanita")) {
        // System.out.println("Halo sis " + nama);
        // } else {
        // System.out.println("Halo " + nama);
        // }
        // }

        // private static String getGenerasi(int tahunKelahiran) {
        // if (tahunKelahiran >= 1944 && tahunKelahiran <= 1964) {
        // return "Baby Boomer";
        // } else if (tahunKelahiran >= 1965 && tahunKelahiran <= 1979) {
        // return "Generasi X";
        // } else if (tahunKelahiran >= 1980 && tahunKelahiran <= 1994) {
        // return "Generasi Y (Millennials)";
        // } else if (tahunKelahiran >= 1995 && tahunKelahiran <= 2015) {
        // return "Generasi Z";
        // } else {
        // return "Tidak diketahui";
        // }

        /*
         * Switch Lambda => pada java 14 => Switch expression dengan lambda
         * untuk mempermudah penggunaan switch expression karena tidak perlu lagi
         * menggunakan kata break
         */

        // var nilai = "B";

        // switch (nilai) {
        // case "A" -> System.out.println("Anda lulus dengan sangat baik");
        // case "B" -> System.out.println("Anda lulus dengan baik");
        // case "C" -> System.out.println("Anda lulus dengan nilai cukup");
        // case "D" -> System.out.println("Anda tidak lulus");
        // default -> {
        // System.out.println("Anda harus banyak belajar");
        // }
        // }

        /*
         * Pengunaan switch case dengan menggunakan yield
         */

        // var nilai = 80;
        // String kalimat;
        // kalimat = switch (nilai) {
        // case 90:
        // yield " Anda lulus dengan baik";
        // case 80:
        // yield " Anda lulus dengan baik";
        // case 70:
        // yield " Anda lulus dengan baik";
        // default: {
        // yield "Anda belum lulus";
        // }
        // };

        // System.out.println(kalimat);

        // Scanner scanner = new Scanner(System.in);

        // System.out.print("Masukkan nilai: ");
        // String golongan = scanner.nextLine();

        // int nilai;

        // switch (golongan) {
        // case "A":
        // nilai = 90;
        // break;
        // case "B":
        // nilai = 80;
        // break;
        // case "C":
        // nilai = 70;
        // break;
        // case "D":
        // nilai = 60;
        // break;
        // default:
        // nilai = 0;
        // break;
        // }

        // if (nilai > 0) {
        // System.out.println("nilai: " + nilai);
        // } else {
        // System.out.println("nilai jelek.");
        // }

        // Buatlah sebuah penghitungan gaji TOTAL karyawan beradarkan golongan :
        // switch case
        // A : gajiPokok = 5000000;
        // tunjangan = 2000000;

        // B : gajiPokok = 4000000;
        // tunjangan = 1500000;

        // C : gajiPokok = 3000000;
        // tunjangan = 1000000;

        // D : gajiPokok = 2000000;
        // tunjangan = 500000;

        // ouput : Masukkan golongan karyawan (A/B/C/D): A
        // Gaji Pokok: 5000000.0
        // Tunjangan: 2000000.0
        // Gaji Total: 7000000.0

        // Perulangan

        /*
         * For Loop => For adalah salah satu kunci yang bisa di gunakan untuk melakukan
         * perulangan
         * Blok kode : di dalam for akan selalu di ulangi selama kondisi for terpenuhi
         * 
         * Sintak perulangan for :
         * for (init statement;kondisi;post statement) {
         * 
         * }
         */

        // for (;;) {
        // System.out.println("perulangan");
        // }

        // var counter = 1;
        // for (; counter <= 10;) {
        // System.out.println("perulangan" + counter);

        // counter++;
        // }
        // melakukan pengecekan sampai 10 kali
        // jika lebih dari 10 kali perulangan berhenti

        /*
         * Perulangan dengan init statement
         * akan di eksekusi sekali hanya di awal
         */

        // for (var counter = 1; counter <= 10;) {
        // System.out.println("perulangan" + counter);

        // counter++;
        // }

        /*
         * Post statement => dari pada dieksekusi di ahkir perulangan lebih baik di
         * taruh di dalam perulangan
         */

        // for (var counter = 1; counter <= 10; counter++) {
        // System.out.println("perulangan " + counter);

        // }

        /*
         * While Loop => Lebih sederhana dari for loop, hanya terdapat kondisi
         * perulangan, tanpa ada init statement dan post statement
         * + kata kunci while
         */

        // var counter = 1;
        // while (counter <= 100) {
        // System.out.println("perulangan " + counter);

        // counter++;

        // // infinite loop => perulangan tiada ahkir
        // }

        /*
         * Do While loop {
         * Perulangan yang mirip dengan while, hanya ada pengecekan kondisi
         * pengecakan kondisi di while loop di lakukan di awal sebelum perulangan di
         * lakukan
         * sedangkan di do while loop di lakukan setelah perulangan di lakukan walau
         * kondisi true
         * }
         */

        // var counter = 1000;

        // do {
        // System.out.println("perulangan ke" + counter);
        // counter++;
        // } while (counter <= 10);

        /*
         * Break dan continue
         * break => untuk menghentikan perulangan
         * 
         * continue => untuk menghentikan perulangan saat ini, lalu melanjutkan ke
         * perulangan selanjutnya
         */

        // var counter = 1;
        // while (true) {
        // System.out.println("Perulangan ke-" + counter);

        // System.out.print(counter);
        // counter++;

        // if (counter > 10) {
        // break;
        // }
        // }

        // System.out.println("Perulangan berhenti");

        // Continue =>

        // for (var counter = 1; counter <= 100; counter++) {
        // if (counter % 2 == 0) {
        // continue;
        // }
        // System.out.println("perulangan Ganjil" + counter);
        // }

        /*
         * For Each => Kadang melakukan akses data array menggunakan perulangan
         * mengakses data secara otomatis
         */

        // String[] arrays = {
        // "e", "r", "i", "c"
        // };

        // for (int i = 0; i < arrays.length; i++) {
        // System.out.println(arrays[i]);
        // }

        // for (var array : arrays) {
        // System.out.println(array);
        // }

        /*
         * Soal : Buat sebuah program yang mencetak bilangan ganjil dari 1000 hingga 1
         * Soal : Buat sebuah program untuk meencetak hasil perkalian 5 dari 1 hingga
         * 100
         * 
         */

        /*
         * Method (function) : Adalah Blok kode program yang akan berjalan saat kita
         * panggil
         * contoh : System.out.println(array); kita bisa menggunakan kata kunci void,
         * lalu di ikuti dengannama method() dan di ahkiri dengan blok, kita bs
         * memamnggil method dengan
         * menggunakan nama method di ikuti ()
         */

        // sayHelloWorld();
        // }

        // static void sayHelloWorld() {
        // System.out.println("Hello world 1");
        // System.out.println("Hello world 1");
        // System.out.println("Hello world 1");
        // }

        /*
         * Method Parameter => Biasa mengirim informasi ke method yang ingin kita
         * panggil
         * untuk melakukan hal , kita perlu menambahakan parameter atau argument di
         * method yg sudah kita biat
         * cara membuat method parameter sama seperti membuat variable parameter di
         * tempatkan di dalam kurung()
         * di deklarasi method
         * //
         */
        // SayHello("Budi", "Hartanto");
        // hitungAlas(4, 5);

        // }

        // static void SayHello(String firstName, String lastName) {
        // System.out.println("Hello " + firstName + " " + lastName);
        // }

        // static void hitungAlas(int lebar, int tinggi) {
        // System.out.println(lebar * tinggi);
        // System.out.println(lebar + tinggi);

        /*
         * Method return Value
         * Secara default, method tidak menghasilkan value apapun, namu jika kita ingin
         * kitabisa
         * membuat sebuah method mengembalikan sebauh nilai
         * 
         * agar method bisa menghasilkan value, kita harus mengubah kata kunci void
         * dengan tipe
         * data yang di hasilkan
         * dan di dalam block method, untuk menghasilkan nilai tersebut kita harus
         * menggunakan kata kunci
         * "return", lalu di ikuti dengan data yang sesuai
         */

        // System.out.println("Luas segitiga adalah: " + hitungLuasSegitiga(5, 7));
        // }

        // static double hitungLuasSegitiga(double alas, double tinggi) {
        // return (alas * tinggi) / 2;
        // }

        /*
         * Method Variable Argument => Kita butuh mengirim data ke method sejumlah data
         * yang tidak pasti
         * biasanya agar bisa seperti ini kita akan menggunakan array sebagai parameter
         * dalam method tersebut.
         * 
         * di java bisa menggunakan variable argument untuk mengirim data yang tidak
         * tentu jumlahnya
         * parameter dengan tipe ergument hanya bisa di tempatkan di posisi tertentu
         */

        //

        // Menggunakan Variable Argument

        // datanya languung di masukin

        // sayCongrats("eric", 10, 19, 16, 16, 16);
        // }

        // static void sayCongrats(String name, int... values) {
        // var total = 0;
        // for (var value : values) {
        // total += value;
        // }
        // var finalValue = total / values.length;

        // if (finalValue >= 75) {
        // System.out.println("Selamat " + name + " anda lulus");
        // } else {
        // System.out.println(name + "anda tidak lulus");
        // }

        // Method overloading
        // Recusrcive method
        // scope
        // komentar
        // studi kasus

        // soal :
        /*
         * 1. Buatlah sebuah metode bernama isEven yang menerima satu parameter bilangan
         * bulat (int) dan mengembalikan nilai boolean true jika bilangan tersebut
         * genap, dan false jika bilangan tersebut ganjil. Tuliskan kode lengkap untuk
         * metode tersebut.
         * 
         * 2. Buatlah sebuah metode bernama printSquare yang menerima satu parameter
         * // bilangan bulat (int) dan mencetak persegi dari simbol '' dengan ukuran
         * sesuai
         * // dengan nilai parameter tersebut. Misalnya, jika nilai parameter adalah 4,
         * // maka akan dicetak persegi dengan sisi 4 baris dan 4 kolom simbol ''.
         * ditambahkan hitung luas pergeginya
         * Tuliskan
         * // kode lengkap untuk metode tersebut.
         * 
         * 
         * 3. Buatlah sebuah metode bernama calculateSquare yang menerima satu parameter
         * // bilangan bulat (int) dan mengembalikan hasil kuadrat dari bilangan
         * tersebut.
         * // Tuliskan kode lengkap untuk metode tersebut.
         * 
         */

        /*
         * Method Overloading => kemampuan membuat method dengan nama yang sama lebih
         * dari 1 kali
         * parameternya harus berbeda
         * jika ada yang sama akan Error !!!
         */

        // HelloWorld();
        // HelloWorld("budi");
        // HelloWorld("jaka", "budi");
        // }

        // static void HelloWorld() {
        // System.out.println("Hello");
        // }

        // static void HelloWorld(String firstName) {
        // System.out.println("Hello" + firstName);
        // }

        // static void HelloWorld(String firstName, String lastName) {
        // System.out.println("Hello");
        // }

        /*
         * Recursive Method => Kemampuan method untuk memanggil methodnya sendiri
         * ketika melakukan perhitungan factorial
         */

        // System.out.println(5 * 4 * 3 * 2 * 1);

        // System.out.println(factorialLoop(5));
        // System.out.println(factorialRecursive(100));
        // }

        // Perulangan
        // static int factorialLoop(int value) {
        // var result = 1;
        // for (var counter = 1; counter <= value; counter++) {
        // result *= counter;
        // }
        // return result;

        // }
        // static int factorialRecursive(int value) {
        // if (value == 1) {
        // return 1;

        // } else {
        // // perkalian nilai dengan factorialrecursive
        // // jika value tidak sama dengan 1, fungsi akan melakukan recursive
        // return value * factorialRecursive(value - 1);
        // }
        // method untuk get value gaji karyawan
        // => pemanggilan pertamana : factorial recursive(5) akan memanggilan factorial
        // (4)
        // => pemanggilan kedua : factorial recursive(4) akan memanggilan factorial
        // (3)
        // => pemanggilan ketiga : factorial recursive(3) akan memanggilan factorial
        // (2)
        // => pemanggilan ke empat : factorial recursive(2) akan memanggilan factorial
        // (1)

        /*
         * Eroor Stackoverflow dimana method terlalubanyak di java ketika memamnggi;
         * method lain maka stack akan menmpuk terus
         * jika terlalu adlam maka stack akan terlalu besar dan mengakibatkan error
         * stackOverflow
         */

        // loop(100000);
        // }

        // static void loop(int value) {
        // if (value == 0) {
        // System.out.println("selesai");
        // } else {
        // System.out.println("Looop -" + value);
        // loop(value - 1);
        // }
        // }

        /*
         * Komentar => buat dokementasi
         * 
         */

        /*
         * Scope => variable yang hanya bisa di akses di dalam area dimana mereka di
         * buat
         * di buat dalam blok maka hanya bisa di akses di dalam blok tersebut
         */

    }

    // static void sayHello(String name) {
    // String Hello = " Hello " + name;

    // if (!name.isBlank()) {
    // String hi = "Hi " + name;
    // System.out.println(hi);
    // }
    // System.out.println(Hello);
    // }

    // Prototype => bentuk dasar dari sebuah aplikasi
    // OBJECT ORIENTED PROGRAMMING :

    /*
     * OOP : Object Oriented Programming
     * Sebuah sudut pandang bahasa pemograman yang berkonsep object
     * 1. Menggunakan (class)=> formatnya CamelCase
     * 2. EmployeeManagementAplication
     */

    /*
     * Membuat Object :
     * Object adalah initsiasi dari sebuah class
     * untuk membuat object bisa menggunakan kata kunci new di ikuti dengan nama
     * Class dan ();
     */

    /*
     * Kata kunci field :
     * fields / properties / attributes adalah data yang bisa kita sisipkan di dalam
     * object
     * namun sebelum kita memasukan data di fields kita harus mendeklarasikan apa
     * saja yang di miliki object tersebut di dalam dekalarasi class
     * membuat field saama seperti membuat variable, namun di tepatkan di blok class
     */

    /*
     * Classs : Negara, Mahasiswa, Hewan/tumbuhan
     */

    /*
     * Manipulasi Field : Fields yang ada di dalam object bisa kita manipulasi,
     * tergantung field tersebut Final atau Bukan
     * jika final, berarti kita tidak bisa mengubah data fieldnya, namun jika tidak
     * kita bisa mengubah fieldnya
     * untuk memanipulasi data field. sama seperti cara pada variable
     * untuk mengakses field, kita butuh kata kunci . (titik) setelah nama object
     * dan di ikuti nama fieldnya
     * 
     */

    /*
     * Method : Selain menambahkan field, kita juga bisa menambahkan method ke
     * object
     * dengan cara mendeklarasikan method tersebut di ddalam blok class
     * Saama seperti method biasanya, kita juga bisa menambahakan return value,
     * parameter, dan method overloading di dalam method class
     * untuk mengakses method tersebut kita bisa menggunakan tanda titik(.) dan di
     * ikuti dengan nama methodnya sama seperti mengakses field
     */

    /*
     * Constructor :
     * Saat kita membuat Object, maka kita seperti memanggil sebuah method karena
     * kita menggunakan "()"
     * Di dalam class java, kita bisa membuat constructor, contructor adalah method
     * yang di panggil saat pertama kali object di buat
     * mirip seperti di method, kita bisa memberi parameter pada construtor
     * nama constructor harus sama dengan nama class dan tidak membutuhkan kata
     * kunci void atau return value
     */

    // --------------------------29 07 2023----------------------------------//
    /*
     * Constructor Overloading => constructor yang bisa di pakai berkali-kali
     * dengan syarat parameternya harus berbeda jumlahnya
     */

    /*
     * mmemanggil Constructor lain:
     * constructor bisa memanggil constructor lain
     * hal ini memudahkan saat kit butuh menginisialisasikan data dengan berbagai
     * kemungkninan
     * cara untuk memanggil constructor lain, kita hanya butuh memanggil method,
     * namun dengan kata kunci this
     */

    /*
     * Variable shadowing => kejadian ketika kita membuat variable dengan nama yang
     * sama di dalam scope
     * INI BISA TERJADI seperti kita emmbuat nama parameter di method sama nama
     * field di class
     * saat terjadi variable shadowing, maka secara otomatis variable di scpoe
     * atasnya tidak bisa di akses
     */

    /*
     * This Keyword => Untuk mengakses Object saat ini
     * semisal kita butuh mengakses sebuah field yang namanya sama dengan parameter
     * method.
     * Hal ini tidak bisa di lakukan jika langsung menyebut nama field, kita bisa
     * mengakses nama field tersesbut dengan kata kunci "this"
     * bisa juga untuk mengakses method untuk mengatasi masalah variable shadowing
     */

    /*
     * Inheritance => Adalah pewarisan atau kemampuan untuk menurunkan sebuah class
     * lain
     * dalam artian, kita bisa membuat class parent dan class child
     * saat sebuah classs di turunkan, maka semua field dan method akan terbawa
     * untuk melakukan pewarisan di class shi;d harus menggunakan kata extends
     */

}
