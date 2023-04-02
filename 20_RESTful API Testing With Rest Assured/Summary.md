# RESTful API Testing with Rest Assured 
Rest Assured adalah sebuah library populer berbasis Java yang digunakan untuk melakukan pengujian pada RESTful API. Rest Assured menyediakan antarmuka yang sederhana dan mudah digunakan untuk mengirimkan permintaan HTTP, memverifikasi respon, dan menguji berbagai aspek pada RESTful API.

Berikut adalah langkah-langkah untuk melakukan pengujian RESTful API menggunakan Rest Assured:

- Persiapkan dependensi:
Sebelum kita mulai menggunakan Rest Assured, kita perlu menambahkan dependensinya ke dalam proyek kita. Kami bisa menggunakan Maven atau Gradle untuk menambahkan dependensi Rest Assured ke dalam proyek kami.
- Buat kelas pengujian:
Setelah kita menambahkan dependensi Rest Assured ke dalam proyek, selanjutnya kita bisa membuat kelas pengujian untuk menguji RESTful API. Kita bisa menggunakan framework pengujian seperti JUnit atau TestNG.
- Mengirim permintaan HTTP:
Dalam kelas pengujian, kita bisa menggunakan Rest Assured untuk mengirimkan permintaan HTTP ke RESTful API yang ingin diuji. Kita bisa mengatur metode HTTP yang ingin digunakan, mengatur header permintaan, dan mengirimkan payload jika diperlukan.
- Memverifikasi respon:
Setelah kita mengirimkan permintaan HTTP, selanjutnya kita perlu memverifikasi respon yang diterima dari RESTful API. Kita bisa memeriksa kode status HTTP, header respon, dan isi respon untuk memastikan bahwa RESTful API berfungsi dengan benar.
- Melakukan pengujian lanjutan:
Selain memverifikasi respon dasar, kita juga bisa melakukan pengujian lanjutan menggunakan Rest Assured. Misalnya, kita bisa menguji validitas skema JSON atau XML, menguji kecepatan respons RESTful API, atau menguji endpoint yang memerlukan otentikasi.

Dengan menggunakan Rest Assured, kita bisa melakukan pengujian secara efisien dan efektif pada RESTful API. Rest Assured menyediakan banyak fitur yang memudahkan pengujian dan membantu kita memastikan bahwa RESTful API yang kita kembangkan berfungsi dengan benar dan sesuai dengan harapan.

## REST API (API CONCEPT AND FUNDAMENTAL)

API (Application Programming Interface) adalah sekumpulan protokol, metode, dan alat yang digunakan untuk mengembangkan perangkat lunak dan aplikasi. API memungkinkan program dan aplikasi yang berbeda untuk berkomunikasi dan berinteraksi satu sama lain melalui standar protokol yang sama.

API memainkan peran penting dalam pengembangan perangkat lunak modern. Dalam pengembangan perangkat lunak, API digunakan sebagai antarmuka antara komponen perangkat lunak yang berbeda. API memungkinkan pengembang untuk mengintegrasikan layanan, fungsionalitas, dan fitur dari aplikasi atau layanan yang berbeda ke dalam perangkat lunak yang sedang mereka kembangkan.

Beberapa konsep dan fundamental API yang perlu diketahui antara lain:

1. Endpoints: Endpoints adalah alamat URL yang digunakan untuk mengakses API. Endpoints digunakan untuk membedakan sumber daya atau layanan yang berbeda yang tersedia melalui API.

2. Metode HTTP: API menggunakan metode HTTP seperti GET, POST, PUT, DELETE, dan PATCH untuk melakukan operasi pada sumber daya yang tersedia melalui API.

3. Parameter: Parameter adalah informasi tambahan yang dikirimkan bersama dengan permintaan API. Parameter dapat digunakan untuk memfilter hasil atau untuk meminta data yang spesifik.

4. Format respon: Format respon API dapat berupa JSON, XML, atau format lainnya. Format respon dapat disesuaikan sesuai kebutuhan pengembang.

5. Autentikasi: Autentikasi adalah proses untuk memverifikasi identitas pengguna yang menggunakan API. Autentikasi dapat dilakukan menggunakan kunci API, token akses, atau metode otentikasi lainnya.

Dengan memahami konsep dan fundamental API, pengembang dapat merancang dan mengembangkan API yang terstruktur, mudah digunakan, dan terintegrasi dengan aplikasi lain dengan baik.

## THE PRACTICAL TEST PYRAMID

Pyramid tes praktis untuk pengujian API adalah representasi visual dari jenis tes yang harus digunakan dalam pengujian API, berdasarkan tingkat penting dan efisiensinya. Piramida terdiri dari tiga lapisan:

- Tes unit: Tes unit adalah dasar piramida dan merupakan jenis tes paling penting untuk pengujian API. Mereka adalah tes tingkat rendah yang berfokus pada pengujian fungsi atau metode individu secara terisolasi. Tes ini cepat, efisien, dan dapat dijalankan secara sering selama proses pengembangan untuk menangkap bug lebih awal.

- Tes integrasi: Tes integrasi duduk di tengah piramida dan berfokus pada pengujian interaksi antara komponen API yang berbeda. Tes ini lebih lambat dan lebih kompleks daripada tes unit tetapi masih sangat penting untuk memastikan bahwa API berfungsi seperti yang diharapkan.

- Tes ujung ke ujung: Tes ujung ke ujung duduk di puncak piramida dan merupakan jenis tes paling tidak penting untuk pengujian API. Tes ini berfokus pada pengujian seluruh sistem, termasuk API, database, dan ketergantungan eksternal lainnya. Mereka adalah jenis tes yang paling lambat dan paling mahal, tetapi memberikan tingkat kepercayaan yang tinggi bahwa sistem berfungsi dengan benar.

Dengan mengikuti piramida tes praktis, pengembang dan insinyur QA dapat memastikan bahwa mereka menguji API secara menyeluruh sambil tetap menjaga keseimbangan antara efisiensi dan efektivitas.

## REST ASSURED AND THE FEATURE

Rest Assured adalah library berbasis Java yang digunakan untuk menguji API RESTful. Rest Assured menyediakan bahasa domain-specific (DSL) untuk menulis tes dan menyederhanakan proses membuat dan mengeksekusi tes untuk API RESTful. Rest Assured dibangun di atas kerangka pengujian Java populer, JUnit, dan dapat dengan mudah diintegrasikan ke dalam proyek Java yang ada.

Salah satu fitur utama dari Rest Assured adalah kemudahannya dalam penggunaannya. Library ini menyediakan sintaks yang sederhana dan intuitif untuk menulis tes API, sehingga mudah bagi pengembang dan insinyur QA untuk dengan cepat membuat dan mengeksekusi tes untuk API RESTful mereka.

Fitur utama lain dari Rest Assured adalah dukungannya untuk berbagai metode HTTP, termasuk GET, POST, PUT, DELETE, dan lainnya. Ini memungkinkan pengembang dan insinyur QA untuk menguji semua aspek dari API mereka, termasuk pengambilan data, manipulasi data, dan penghapusan data.

Rest Assured juga mendukung mekanisme autentikasi dan otorisasi, seperti autentikasi dasar, OAuth, dan JWT, sehingga mudah untuk menguji API yang membutuhkan autentikasi atau otorisasi.

Selain itu, Rest Assured menyediakan beberapa opsi validasi untuk respons API, termasuk validasi kode respons, header respons, dan body respons. Ini memudahkan untuk memastikan bahwa respons API valid dan memenuhi kriteria yang diharapkan.

Secara keseluruhan, Rest Assured adalah alat yang kuat dan fleksibel untuk menguji API RESTful, dengan berbagai fitur yang membuat mudah untuk membuat dan mengeksekusi tes dengan cepat dan efisien.
