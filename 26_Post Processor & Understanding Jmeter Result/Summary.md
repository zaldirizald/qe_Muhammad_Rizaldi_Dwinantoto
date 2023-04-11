# Post Processor & Understanding Jmeter Results
## What is Post Processor?

Post Processor adalah komponen di JMeter yang memungkinkan Anda untuk memodifikasi atau mengekstrak informasi dari respons yang diterima dari server setelah mengirim permintaan.

Setelah JMeter mengirim permintaan ke server, server akan memberikan respons dalam bentuk pesan respons yang berisi data dalam berbagai format seperti JSON, XML, HTML, atau teks biasa. Post Processor dapat digunakan untuk mengekstrak data dari pesan respons ini, yang dapat berguna dalam permintaan berikutnya atau untuk memverifikasi respons yang diterima.

Ada beberapa jenis Post Processor yang tersedia di JMeter, termasuk Regular Expression Extractor, JSON Extractor, XPath Extractor, CSS/JQuery Extractor, dan Boundary Extractor. Post Processor ini digunakan untuk mengekstrak data dari respons berdasarkan aturan dan kondisi tertentu.

Selain mengekstrak data, Post Processor juga dapat digunakan untuk memodifikasi pesan respons sebelum dikirim ke permintaan berikutnya. Misalnya, Regular Expression Post Processor dapat digunakan untuk mengganti teks tertentu dalam pesan respons dengan teks lain.

Secara keseluruhan, Post Processor di JMeter adalah alat penting untuk menangani pesan respons yang diterima dari server, dan dapat digunakan untuk mengekstrak dan memanipulasi data yang dibutuhkan untuk melakukan pengujian kinerja yang efektif.

## JSON Path
JSON Path adalah bahasa kueri yang digunakan untuk mengakses dan mengekstrak data tertentu dari objek JSON. Ini menyediakan cara untuk menavigasi melalui objek JSON dan mengambil nilai tertentu berdasarkan serangkaian kriteria atau kondisi.

Syntax JSON Path mirip dengan syntax XPath untuk dokumen XML. Ia menggunakan notasi titik untuk mewakili level berbeda dari objek JSON dan mendukung beberapa operator untuk menyaring dan memilih data tertentu.

Sebagai contoh, pertimbangkan objek JSON berikut:
{
  "name": "John Doe",
  "age": 30,
  "address": {
    "city": "New York",
    "state": "NY",
    "zip": "10001"
  },
  "phoneNumbers": [
    {
      "type": "home",
      "number": "555-555-1234"
    },
    {
      "type": "work",
      "number": "555-555-5678"
    }
  ]
}

Untuk mengekstrak nilai dari bidang "name", ekspresi JSON Path-nya adalah:

$.name

Untuk mengekstrak nilai dari bidang "city" di dalam objek "address", ekspresi JSON Path-nya adalah:

$.address.city

Untuk mengekstrak nilai dari bidang "number" di dalam objek kedua dari array "phoneNumbers", ekspresi JSON Path-nya adalah:

$.phoneNumbers[1].number

JSON Path dapat digunakan dalam berbagai alat dan bahasa, termasuk JMeter, untuk mengekstrak data tertentu dari respons JSON dan melakukan validasi atau pemrosesan lebih lanjut.



