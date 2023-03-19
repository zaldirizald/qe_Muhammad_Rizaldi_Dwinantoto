# ITERABLE and MAP DATA STRUCTURE
Di dalam bahasa pemrograman Java, Iterable dan Map Data Structure memiliki pengertian yang sama seperti dalam Python:

- Iterable
Iterable dalam Java adalah sebuah interface yang digunakan untuk membuat objek yang dapat diperulangkan atau diiterasi. Interface Iterable memiliki satu metode abstract yaitu iterator(), yang mengembalikan Iterator yang dapat digunakan untuk melintasi elemen-elemen di dalam objek tersebut. Iterable sering digunakan pada objek seperti List, Set, dan Array.

- Map Data Structure
Map Data Structure dalam Java adalah sebuah interface yang merepresentasikan kumpulan pasangan key-value (kunci-nilai). Interface Map memiliki beberapa metode untuk mengakses, menambah, atau menghapus elemen di dalamnya, seperti put(), get(), remove(), dan lain-lain. Map juga menyediakan kemampuan untuk melakukan iterasi pada setiap pasangan key-value yang ada di dalamnya, menggunakan method entrySet().

Di dalam bahasa pemrograman Java, terdapat beberapa fitur yang terdapat pada Iterable dan Map Data Structure, antara lain:

- Iterable
1. Interface Iterable, yang berisi method iterator() untuk mengembalikan iterator yang dapat digunakan untuk melintasi elemen-elemen di dalam objek.
2. Interface Iterator, yang berisi method untuk mengakses dan mengubah elemen-elemen saat melakukan iterasi, seperti hasNext(), next(), dan remove().
3. Class-concrete Collection, seperti List, Set, dan Queue, yang implementasi-nya memenuhi kriteria sebagai objek iterable.
- Map Data Structure
1. Interface Map, yang merepresentasikan kumpulan pasangan key-value (kunci-nilai) dan memiliki method untuk mengakses, menambah, atau menghapus elemen di dalamnya, seperti put(), get(), remove(), dan lain-lain.
2. Interface Entry, yang merepresentasikan sebuah pasangan key-value dalam Map dan memiliki method untuk mengakses key dan value.
3. Class-concrete Map, seperti HashMap, TreeMap, dan LinkedHashMap, yang implementasi-nya memenuhi kriteria sebagai objek Map.