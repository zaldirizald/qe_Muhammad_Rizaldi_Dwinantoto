# FROM MANUAL TO AUTOMATION TESTING
"From manual to automation testing" adalah proses migrasi dari pengujian manual ke pengujian otomatis dalam siklus pengembangan perangkat lunak. Hal ini dilakukan untuk meningkatkan efisiensi, akurasi, dan konsistensi dari pengujian, serta untuk mengurangi biaya dan waktu yang diperlukan untuk melakukan pengujian.

## Manual vs Automation Testing

Manual dan otomatis Testing adalah dua pendekatan yang berbeda yang digunakan untuk menguji perangkat lunak.

Manual Testing adalah proses secara manual mengevaluasi sebuah aplikasi perangkat lunak untuk mengidentifikasi masalah atau bug. Ini membutuhkan seorang tester untuk melakukan uji manual pada aplikasi, tanpa menggunakan alat perangkat lunak otomatis apa pun. Uji coba manual merupakan pekerjaan berat dan memakan waktu, tetapi karena dilakukan oleh tester manusia, itu dapat memberikan evaluasi lebih mendalam dan akurat dari aplikasi daripada uji otomatis.

Automation Testing adalah proses menggunakan perangkat lunak khusus untuk mengotomatiskan eksekusi uji. Uji otomatis biasanya dilakukan menggunakan bahasa skrip atau alat seperti Selenium. Uji coba otomatis lebih cepat dan efisien daripada uji manual, karena dapat menjalankan banyak uji dalam jangka waktu yang lebih singkat dan dengan keterlibatan manusia yang minimal. Ini juga lebih andal, karena menghilangkan potensi kesalahan manusia.

## Why Manual Testting
Manual testing merupakan jenis pengujian perangkat lunak yang dilakukan secara manual oleh seorang pengujian dengan menggunakan metode, prosedur, dan pengalaman pengujian untuk menemukan kelemahan dan cacat dalam perangkat lunak yang diuji. Meskipun saat ini ada banyak alat dan teknologi untuk melakukan pengujian otomatis, namun manual testing tetap memiliki beberapa keunggulan sebagai berikut:

1. Fleksibilitas: Manual testing dapat dengan mudah menyesuaikan diri dengan perubahan kebutuhan pengujian perangkat lunak, karena pengujian dilakukan secara langsung oleh manusia yang dapat menyesuaikan diri dengan situasi yang berubah-ubah.
2. Keterlibatan manusia: Manual testing melibatkan pengguna akhir atau pengguna simulasi yang melakukan pengujian dengan cara yang sama seperti yang akan dilakukan oleh pengguna akhir asli, sehingga dapat membantu menemukan masalah atau cacat yang mungkin tidak terdeteksi dalam pengujian otomatis.
3. Memastikan kualitas: Manual testing dapat membantu memastikan kualitas perangkat lunak dengan lebih efektif dan efisien karena manusia dapat mengenali masalah yang tidak dapat dideteksi oleh algoritma atau program otomatis.
4. Biaya yang lebih rendah: Manual testing dapat dilakukan tanpa memerlukan biaya untuk alat atau infrastruktur yang khusus, seperti yang diperlukan dalam pengujian otomatis.

Namun, manual testing juga memiliki beberapa kelemahan, seperti waktu dan biaya yang lebih tinggi dibandingkan dengan pengujian otomatis, kesalahan manusia yang lebih mungkin terjadi, dan kurang efektif dalam melakukan pengujian yang repetitif. Oleh karena itu, pengujian manual dan pengujian otomatis biasanya digunakan bersama-sama dalam siklus pengembangan perangkat lunak untuk memastikan kualitas perangkat lunak secara keseluruhan.

## Why Automation Testing
Automation testing memiliki beberapa keunggulan dibandingkan dengan manual testing, yaitu:

1. Efisiensi: Automation testing dapat menghemat waktu dan biaya yang diperlukan untuk melakukan pengujian. Dengan otomatisasi, pengujian dapat dilakukan lebih cepat dan lebih sering, karena tidak terpengaruh oleh batasan waktu dan kelelahan manusia.
2. Akurasi: Automation testing dapat mengurangi kesalahan manusia yang mungkin terjadi dalam manual testing. Skrip pengujian otomatis yang dikembangkan secara tepat dapat memastikan bahwa pengujian dilakukan dengan cara yang sama setiap kali dan tidak ada kesalahan yang terlewatkan.
3. Scalability: Automation testing dapat dengan mudah diulang dan dioptimalkan untuk menguji perangkat lunak dengan skala yang lebih besar atau untuk menguji fungsi yang sama dengan parameter yang berbeda.
4. Konsistensi: Automation testing dapat memastikan bahwa pengujian dilakukan dengan cara yang sama setiap kali, sehingga dapat menghasilkan hasil pengujian yang konsisten dan dapat dipercaya.
5. Coverage: Automation testing dapat membantu menguji lebih banyak skenario dan kasus uji dengan lebih cepat dan lebih efektif daripada manual testing.

Namun, ada juga beberapa kelemahan dalam automation testing, seperti biaya awal yang lebih tinggi untuk mengembangkan skrip pengujian, kesulitan dalam menguji beberapa jenis perangkat lunak seperti perangkat keras, dan kesulitan dalam menemukan cacat yang mungkin terjadi dalam pengujian yang lebih kompleks. Oleh karena itu, biasanya automation testing digunakan bersama dengan manual testing untuk memastikan kualitas perangkat lunak secara keseluruhan.

## Automated Testing Process
Automated testing process terdiri dari beberapa tahapan, yaitu:

1. Perencanaan: Tahapan perencanaan adalah tahapan awal dalam proses automated testing. Pada tahapan ini, tim pengembang dan pengujian perangkat lunak membuat rencana pengujian yang mencakup rincian tentang fitur-fitur yang akan diuji, skenario pengujian, skrip pengujian, dan lingkungan pengujian.
2. Desain pengujian: Pada tahapan desain pengujian, pengembang dan pengujian perangkat lunak merancang skenario pengujian secara terperinci dan membuat skrip pengujian otomatis untuk menguji fitur-fitur yang telah ditentukan.
3. Implementasi skrip pengujian: Pada tahap ini, pengembang dan pengujian perangkat lunak mengimplementasikan skrip pengujian otomatis dan memastikan bahwa skrip tersebut berjalan dengan baik pada lingkungan pengujian.
4. Eksekusi pengujian: Pada tahap ini, skrip pengujian otomatis dijalankan pada lingkungan pengujian dan menghasilkan hasil pengujian. Setelah selesai, hasil pengujian dianalisis dan dilaporkan oleh tim pengujian perangkat lunak.
5. Analisis dan laporan: Setelah pengujian selesai, tim pengujian perangkat lunak menganalisis hasil pengujian dan mengidentifikasi masalah atau cacat yang ditemukan. Kemudian, hasil pengujian dilaporkan dan disampaikan kepada tim pengembang untuk perbaikan.
6. Perbaikan dan pengujian ulang: Setelah cacat diperbaiki oleh tim pengembang, skrip pengujian otomatis dijalankan kembali untuk memastikan bahwa perbaikan berhasil dan tidak ada masalah yang terjadi akibat perubahan pada perangkat lunak.
7. Integrasi dengan Continuous Integration (CI): Terakhir, skrip pengujian otomatis diintegrasikan dengan alat Continuous Integration (CI) untuk memastikan bahwa setiap perubahan pada perangkat lunak diuji secara otomatis setiap kali terjadi perubahan pada kode sumber atau pada lingkungan pengembangan.


## Test Tool Selection
Pemilihan alat uji atau test tool harus didasarkan pada beberapa kriteria, seperti:

- Jenis pengujian: Pertama-tama, perlu dipertimbangkan jenis pengujian yang ingin dilakukan, seperti pengujian fungsional, pengujian performa, pengujian keamanan, atau pengujian beban. Setiap jenis pengujian memerlukan alat yang berbeda untuk melaksanakan pengujian tersebut.
- Ketersediaan sumber daya: Selanjutnya, perlu dipertimbangkan ketersediaan sumber daya seperti dana, personil, dan infrastruktur untuk mengimplementasikan alat pengujian. Beberapa alat uji dapat memerlukan perangkat keras dan software khusus, sehingga harus dipastikan apakah sumber daya tersebut tersedia atau tidak.
- Integrasi: Perlu juga dipertimbangkan apakah alat pengujian dapat diintegrasikan dengan alat lain yang digunakan dalam siklus pengembangan perangkat lunak. Sebagai contoh, integrasi antara alat pengujian dan alat manajemen proyek dapat memudahkan pelaporan hasil pengujian dan manajemen cacat.
- Kompleksitas: Tingkat kompleksitas alat pengujian juga perlu dipertimbangkan. Beberapa alat pengujian memiliki antarmuka yang kompleks dan memerlukan keterampilan teknis yang lebih tinggi untuk menggunakannya.
- Keandalan: Keandalan alat pengujian juga harus menjadi pertimbangan dalam pemilihan alat uji. Pastikan alat yang digunakan memiliki rekam jejak yang baik dalam menjalankan pengujian dan tidak sering mengalami kegagalan.
- Fleksibilitas: Terakhir, fleksibilitas alat pengujian juga harus dipertimbangkan. Beberapa alat uji memungkinkan pengguna untuk menyesuaikan skenario pengujian dengan kebutuhan yang berbeda, sehingga dapat diandalkan untuk menguji berbagai jenis perangkat lunak.


