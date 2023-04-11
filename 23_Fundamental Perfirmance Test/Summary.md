# FUNDAMENTAL PERFORMANCE TEST
Fundamental Performance Test adalah istilah dalam bahasa Inggris yang mengacu pada tes kinerja dasar. Istilah ini mengacu pada serangkaian tes yang dirancang untuk mengukur kemampuan seseorang dalam melakukan tugas-tugas dasar yang terkait dengan pekerjaan tertentu.
Dalam bahasa Indonesia, Fundamental Performance Test dapat diartikan sebagai Tes Kinerja Dasar atau Tes Kemampuan Dasar. Tes ini biasanya digunakan dalam konteks rekrutmen karyawan baru atau evaluasi kinerja karyawan yang sudah ada.
Tes Kinerja Dasar dapat mencakup berbagai tugas yang relevan dengan pekerjaan, seperti kemampuan berkomunikasi, kemampuan berpikir kritis, kemampuan memecahkan masalah, kemampuan bekerja dalam tim, dan kemampuan mengelola waktu. Tes ini dirancang untuk membantu pengusaha atau manajer dalam mengevaluasi kemampuan calon karyawan atau karyawan saat ini dalam menjalankan tugas-tugas yang mendasar dan kritis dalam pekerjaan mereka.

## Performance Test

Performance Test atau yang biasa dikenal dengan istilah tes kinerja adalah metode untuk menguji kemampuan suatu sistem atau aplikasi untuk menangani beban kerja yang tinggi atau volume transaksi yang besar. Tes ini dilakukan untuk mengetahui bagaimana sistem atau aplikasi akan berkinerja dalam situasi yang memerlukan penggunaan sumber daya yang intensif.

Dalam pengujian kinerja, sebuah sistem atau aplikasi diuji dengan memberikan beban kerja yang meningkat secara bertahap. Beban kerja ini dapat berupa jumlah pengguna yang menggunakan sistem secara bersamaan atau jumlah transaksi yang harus diolah dalam waktu tertentu. Tujuan dari pengujian kinerja adalah untuk menemukan batas kemampuan sistem atau aplikasi tersebut sehingga dapat diketahui apakah sistem atau aplikasi tersebut dapat digunakan dengan efektif dan efisien dalam situasi nyata.

Pengujian kinerja sangat penting dilakukan pada sistem atau aplikasi yang penting, seperti sistem perbankan, sistem manajemen informasi, dan aplikasi bisnis, karena jika sistem atau aplikasi gagal berkinerja dalam situasi kritis, dapat berdampak besar pada bisnis atau organisasi tersebut. Oleh karena itu, pengujian kinerja merupakan bagian penting dari siklus pengembangan perangkat lunak dan harus dilakukan secara teratur untuk memastikan sistem atau aplikasi selalu berkinerja dengan baik dalam situasi yang memerlukan penggunaan sumber daya yang intensif.

## Introduction to Jmeter 

JMeter (Java Meter) adalah sebuah perangkat lunak open source yang digunakan untuk melakukan pengujian kinerja dan beban pada aplikasi web atau layanan web. JMeter dikembangkan oleh Apache Software Foundation dan ditulis dalam bahasa pemrograman Java.

JMeter memungkinkan pengguna untuk melakukan pengujian kinerja dan beban pada berbagai jenis protokol seperti HTTP, HTTPS, FTP, SMTP, POP3, dan lainnya. Selain itu, JMeter juga mendukung pengujian fungsional, pengujian pemakaian sumber daya, pengujian keamanan, dan pengujian terus-menerus.

JMeter menggunakan antarmuka grafis pengguna untuk mempermudah penggunaan dan menyediakan fitur untuk merekam penggunaan aplikasi dan melihat hasil pengujian dalam bentuk grafik atau tabel. Selain itu, JMeter juga dapat digunakan sebagai alat pengujian beban untuk menguji performa server atau infrastruktur jaringan dengan membuat simulasi beban tinggi pada server atau jaringan.

Dalam pengujian kinerja, JMeter dapat melakukan simulasi pengguna yang banyak mengakses aplikasi atau layanan web secara bersamaan dan mengukur waktu respons dari aplikasi atau layanan tersebut. Hasil pengujian dapat digunakan untuk mengetahui kekuatan dan kelemahan aplikasi atau layanan web, serta untuk mengoptimalkan kinerja aplikasi atau layanan tersebut agar dapat menangani beban kerja yang lebih besar.

Dengan kelebihannya dalam melakukan pengujian kinerja dan beban pada aplikasi atau layanan web, JMeter menjadi salah satu alat yang sangat populer digunakan dalam pengujian perangkat lunak.

## Post Processor

Post Processor dalam JMeter adalah salah satu komponen yang digunakan untuk memproses dan memanipulasi data respons yang diterima dari server setelah pengiriman permintaan oleh JMeter. Post Processor digunakan untuk melakukan ekstraksi data dari respons server dan melakukan transformasi data untuk pengujian selanjutnya.

Contoh dari Post Processor yang umum digunakan adalah Regular Expression Extractor, JSON Extractor, dan XPath Extractor. Regular Expression Extractor digunakan untuk mengekstrak data dari respons server yang sesuai dengan pola yang diberikan. JSON Extractor digunakan untuk mengekstrak data dari respons JSON yang diterima dari server. XPath Extractor digunakan untuk mengekstrak data dari respons XML yang diterima dari server.

Selain itu, Post Processor juga digunakan untuk melakukan transformasi data yang diterima dari server. Misalnya, jika data respons dari server berupa waktu dalam format yang tidak sesuai dengan format yang dibutuhkan untuk pengujian selanjutnya, maka Post Processor dapat digunakan untuk mengubah format data tersebut agar sesuai dengan kebutuhan pengujian selanjutnya.

Setelah melakukan ekstraksi dan transformasi data, Post Processor dapat mengirim data tersebut ke komponen pengujian selanjutnya seperti Graph Plotting, Assertion, atau Request. Dengan menggunakan Post Processor, JMeter dapat melakukan pengujian dengan lebih fleksibel dan dapat memanipulasi data respons dari server sesuai dengan kebutuhan pengujian.
## Understanding Jmeter Result

JMeter Result atau hasil pengujian pada JMeter dapat diinterpretasikan dengan menggunakan grafik dan tabel yang disediakan oleh JMeter. Berikut adalah penjelasan dari beberapa grafik dan tabel yang tersedia pada hasil pengujian JMeter:

1. Graph Results: Grafik ini menampilkan data pengujian dalam bentuk grafik garis yang menunjukkan variasi respons waktu server selama pengujian berlangsung.

2. Response Times Over Time: Grafik ini menampilkan waktu respons rata-rata dan waktu respons maksimum yang diterima oleh server selama pengujian berlangsung.

3. Response Time Distribution: Grafik ini menampilkan distribusi waktu respons dari server yang diterima selama pengujian berlangsung.

4. Transactions Per Second: Grafik ini menampilkan jumlah transaksi per detik yang dihasilkan oleh JMeter selama pengujian berlangsung.

5. Summary Report: Tabel ini menampilkan rincian statistik pengujian, seperti jumlah permintaan, waktu rata-rata respons, waktu respons maksimum, dan persentil waktu respons.

6. Aggregate Report: Tabel ini menampilkan statistik pengujian dalam bentuk agregat, seperti jumlah permintaan, waktu rata-rata respons, waktu respons maksimum, dan persentil waktu respons.

Dalam menginterpretasikan hasil pengujian JMeter, perlu diperhatikan beberapa faktor seperti jumlah pengguna yang digunakan selama pengujian, tingkat beban yang dihasilkan, dan kondisi jaringan yang digunakan. Selain itu, hasil pengujian JMeter juga dapat diinterpretasikan dengan membandingkan dengan hasil pengujian sebelumnya untuk melihat perubahan kinerja dari waktu ke waktu.

Dalam melakukan pengujian kinerja dengan JMeter, penting untuk memahami hasil pengujian agar dapat membuat keputusan yang tepat terkait dengan optimasi dan pengembangan aplikasi atau layanan web.

