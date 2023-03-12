# INTROCUTION BASIC PROGRAMING

## Basic
- Type data
- Operator
- Input Output
- Looping
- Branching


## 1. Type Data
Dalam bahasa pemrograman Java, type data mengacu pada jenis nilai atau informasi yang dapat disimpan dalam variabel atau digunakan dalam program. Ada beberapa jenis type data dalam Java, yang dibagi menjadi dua kategori yaitu primitif dan objek.

* Type data primitif:
Byte: menyimpan bilangan bulat dari -128 hingga 127.
Short: menyimpan bilangan bulat dari -32.768 hingga 32.767.
Int: menyimpan bilangan bulat dari -2.147.483.648 hingga 2.147.483.647.
Long: menyimpan bilangan bulat yang lebih besar dari int, dari -9.223.372.036.854.775.808 hingga 9.223.372.036.854.775.807.
Float: menyimpan bilangan pecahan dengan presisi tunggal, dari 1.4E-45 hingga 3.4E38.
Double: menyimpan bilangan pecahan dengan presisi ganda, dari 4.9E-324 hingga 1.8E308.
Boolean: menyimpan nilai true atau false.
Char: menyimpan satu karakter dalam bentuk Unicode.

* Type data objek:
String: menyimpan kumpulan karakter atau teks.
Array: menyimpan kumpulan nilai yang sama dalam satu variabel.
Class: menyimpan objek yang dibuat berdasarkan blueprint (kelas) yang telah ditentukan sebelumnya.

Dalam Java, tipe data sangat penting karena menentukan jenis operasi yang dapat dilakukan pada nilai, ukuran memori yang dibutuhkan untuk menyimpan nilai, dan bagaimana nilai tersebut dapat digunakan dalam program.

## 2. Operator
Dalam bahasa pemrograman Java, operator adalah simbol atau tanda yang digunakan untuk melakukan operasi pada satu atau lebih nilai. Ada beberapa jenis operator dalam Java, yaitu:

1. Operator aritmatika: digunakan untuk melakukan operasi matematika pada dua nilai, seperti penjumlahan, pengurangan, perkalian, pembagian, modulus, dan increment/decrement.
Contoh:
Penjumlahan: int hasil = 5 + 7;
Pengurangan: int hasil = 9 - 3;
Perkalian: int hasil = 2 * 4;
Pembagian: double hasil = 9 / 3;
Modulus: int hasil = 9 % 2;
Increment/decrement: int angka = 10; angka++; angka--;
2. Operator perbandingan: digunakan untuk membandingkan dua nilai dan menghasilkan nilai boolean true atau false, seperti == (sama dengan), != (tidak sama dengan), > (lebih besar dari), < (lebih kecil dari), >= (lebih besar dari atau sama dengan), dan <= (lebih kecil dari atau sama dengan).
Contoh:
Sama dengan: boolean hasil = 5 == 5;
Tidak sama dengan: boolean hasil = 5 != 3;
Lebih besar dari: boolean hasil = 5 > 3;
Lebih kecil dari: boolean hasil = 3 < 5;
Lebih besar dari atau sama dengan: boolean hasil = 5 >= 5;
Lebih kecil dari atau sama dengan: boolean hasil = 3 <= 5;
3. Operator logika: digunakan untuk menggabungkan dua atau lebih nilai boolean dan menghasilkan nilai boolean true atau false, seperti && (dan), || (atau), dan ! (tidak).
Contoh:
Dan: boolean hasil = (5 > 3) && (6 < 8);
Atau: boolean hasil = (5 < 3) || (6 < 8);
Tidak: boolean hasil = !(5 > 3);
4. Operator penugasan: digunakan untuk memberikan nilai pada sebuah variabel, seperti = (assignment), += (penambahan dan assignment), -= (pengurangan dan assignment), *= (perkalian dan assignment), /= (pembagian dan assignment), dan %= (modulus dan assignment).
Contoh:
Assignment: int angka = 5;
Penambahan dan assignment: int angka = 5; angka += 3;
Pengurangan dan assignment: int angka = 5; angka -= 3;
Perkalian dan assignment: int angka = 5; angka *= 3;
Pembagian dan assignment: int angka = 5; angka /= 3;
Modulus dan assignment: int angka = 5; angka %= 3;
5. Operator merupakan elemen penting dalam bahasa pemrograman Java, karena digunakan untuk melakukan operasi matematika, perbandingan, logika, dan penugasan pada nilai atau variabel dalam program.



## 3. Input Output
Input dan output (I/O) adalah proses dasar dalam pemrograman Java, yang digunakan untuk mengambil masukan dari pengguna dan menampilkan hasil keluaran program. Dalam Java, I/O dikelola melalui aliran input dan aliran keluaran.
- Input:
Aliran masukan (input stream) adalah sumber data yang digunakan untuk membaca masukan dari pengguna atau dari file. Dalam Java, aliran masukan umumnya dikaitkan dengan objek System.in, yang digunakan untuk membaca masukan dari keyboard. Objek Scanner dapat digunakan untuk membaca masukan dari aliran masukan, dengan memanggil metode-metode seperti next(), nextInt(), nextDouble(), dan lain-lain.
-Output:
Aliran keluaran (output stream) adalah tujuan data yang digunakan untuk menampilkan hasil keluaran program. Dalam Java, aliran keluaran umumnya dikaitkan dengan objek System.out, yang digunakan untuk menampilkan keluaran di konsol. Metode-metode seperti print() dan println() dapat digunakan untuk menampilkan keluaran ke aliran keluaran.


## 4. Looping
Looping atau perulangan dalam pemrograman Java adalah suatu mekanisme untuk mengulang sebuah blok kode sejumlah kali sesuai dengan kondisi yang ditentukan. Ada beberapa jenis perulangan di Java, yaitu:

- For loop
For loop digunakan untuk mengulang blok kode sejumlah kali dengan kondisi awal, kondisi penghentian, dan langkah pengulangan yang telah ditentukan sebelumnya.
- While loop
While loop digunakan untuk mengulang blok kode selama kondisi yang diberikan masih terpenuhi.
- Do-while loop
Do-while loop mirip dengan while loop, namun perulangan akan dilakukan setidaknya satu kali sebelum kondisi dicek.

## 5. Branching
Branching atau percabangan dalam pemrograman Java adalah suatu mekanisme untuk membuat keputusan pada program berdasarkan suatu kondisi atau variasi input yang diberikan. Ada beberapa jenis percabangan di Java, yaitu:

- If statement
If statement digunakan untuk melakukan eksekusi kode ketika suatu kondisi terpenuhi.
- If-else statement
If-else statement digunakan untuk melakukan eksekusi kode jika suatu kondisi terpenuhi dan eksekusi kode lainnya jika kondisi tersebut tidak terpenuhi.
- Switch statement
Switch statement digunakan untuk memilih salah satu dari beberapa blok kode yang akan dieksekusi berdasarkan nilai dari ekspresi yang diberikan.


